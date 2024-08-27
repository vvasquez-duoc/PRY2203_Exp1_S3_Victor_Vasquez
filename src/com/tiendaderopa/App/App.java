package com.tiendaderopa.App;

import com.tiendaderopa.singleton.ManejadorDescuentos;
import com.tiendaderopa.command.AgregarAlCarro;
import com.tiendaderopa.command.Carro;
import com.tiendaderopa.command.Command;
import com.tiendaderopa.command.ManejadorDelCarro;
import com.tiendaderopa.command.RemoverDelCarro;
import com.tiendaderopa.decorador.Component;
import com.tiendaderopa.decorador.DescuentoDiezPorciento;
import com.tiendaderopa.decorador.DescuentoMarca;
import com.tiendaderopa.decorador.DescuentoTemporada;
import com.tiendaderopa.decorador.Producto;


public class App {
    public static void main(String[] args) {
        ManejadorDescuentos manejadorDescuentos = ManejadorDescuentos.obtenerInstancia();
        
        Carro carro = new Carro();
        ManejadorDelCarro manejadorDelCarro = new ManejadorDelCarro();
        
        Producto productoBase = new Producto();
        // CREO VARIOS PRODUCTOS
        Producto poleraPolo = new Producto("Polera", 7500, "Polo");
        Producto poleraMaui = new Producto("Polera", 8990, "Maui");
        Producto jeansCK = new Producto("Jeans", 35990, "Calvin Klein");
        Producto pantalonDockers = new Producto("Pantalon", 27990, "Dockers");
        Producto zapatillasAdidas = new Producto("Zapatillas", 69990, "Adidas");
        Producto zapatillasNike = new Producto("Zapatillas", 57990, "Nike");
        
        // APLICO DESCUENTOS
        // DESCUENTO DE 10% A POLERAS
        Component poleraDescuento = new DescuentoDiezPorciento(productoBase);
        // DESCUENTO A ZAPATILLAS PERO SOLO DE LA MARCA ADIDAS DEL 40%
        Component descuentoTemporada = new DescuentoTemporada(productoBase, 40);
        
        poleraPolo.setPrecio(manejadorDescuentos.aplicarDescuento(poleraPolo, poleraDescuento));
        poleraMaui.setPrecio(manejadorDescuentos.aplicarDescuento(poleraMaui, poleraDescuento));
        zapatillasAdidas.setPrecio(manejadorDescuentos.aplicarDescuento(zapatillasAdidas, descuentoTemporada));
        zapatillasNike.setPrecio(manejadorDescuentos.aplicarDescuento(zapatillasNike, descuentoTemporada));
        
        // GENERO COMANDOS
        Command agregarPoleraPolo = new AgregarAlCarro(carro, poleraPolo);
        Command agregarPoleraMaui = new AgregarAlCarro(carro, poleraMaui);
        Command agregarJeansCK = new AgregarAlCarro(carro, jeansCK);
        Command agregarPantalonDockers = new AgregarAlCarro(carro, pantalonDockers);
        Command agregarZapatillasNike = new AgregarAlCarro(carro, zapatillasNike);
        Command agregarZapatillasAdidas = new AgregarAlCarro(carro, zapatillasAdidas);
        Command removerPantalonDockers = new RemoverDelCarro(carro, pantalonDockers);
        
        // AGREGO LOS COMANDOS AL MANEJADOR
        manejadorDelCarro.agregarComando(agregarPoleraPolo);
        manejadorDelCarro.agregarComando(agregarPoleraMaui);
        manejadorDelCarro.agregarComando(agregarJeansCK);
        manejadorDelCarro.agregarComando(agregarPantalonDockers);
        manejadorDelCarro.agregarComando(agregarZapatillasNike);
        manejadorDelCarro.agregarComando(agregarZapatillasAdidas);
        manejadorDelCarro.agregarComando(removerPantalonDockers);
        
        // EJECUTAR LOS COMANDOS
        manejadorDelCarro.ejecutarComandos();
        
        // MUESTRO CONTENIDO DEL CARRO
        carro.mostrarProductos();
        carro.mostrarTotalCarro();
    }
}
