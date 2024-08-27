package com.tiendaderopa.singleton;
import com.tiendaderopa.decorador.Component;
import com.tiendaderopa.decorador.Producto;

public class ManejadorDescuentos {
    private static ManejadorDescuentos instancia;

    private ManejadorDescuentos(){
    }

    public static ManejadorDescuentos obtenerInstancia(){
        if(instancia == null){
            instancia = new ManejadorDescuentos();
        }
        return instancia;
    }

    public int aplicarDescuento(Producto producto, Component tipoDescuento){
        int precioAux = producto.getPrecio();
        return tipoDescuento.aplicarDescuento(precioAux);
    }
}
