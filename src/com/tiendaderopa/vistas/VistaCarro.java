package com.tiendaderopa.vistas;

import com.tiendaderopa.modelos.ModeloOrdenesCompra;
import com.tiendaderopa.modelos.ModeloProducto;

public class VistaCarro {
    public void mostrarCarro(ModeloOrdenesCompra orden) {
        System.out.println("Carrito de compras:");
        for (ModeloProducto producto : orden.getProductos()){
            System.out.println(producto.getNombre() + ": $" + producto.getPrecio());
        }
        System.out.println("Total: $" + orden.calcularTotal());
    }
}
