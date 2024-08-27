package com.tiendaderopa.vistas;

import com.tiendaderopa.modelos.ModeloProducto;

public class VistaProducto {
    public void mostrarProductos(ModeloProducto producto) {
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Precio: $" + producto.getPrecio());
    }
}
