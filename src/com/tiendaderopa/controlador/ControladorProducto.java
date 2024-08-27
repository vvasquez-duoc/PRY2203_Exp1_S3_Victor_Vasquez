package com.tiendaderopa.controlador;

import com.tiendaderopa.modelos.ModeloProducto;
import com.tiendaderopa.vistas.VistaProducto;

public class ControladorProducto {
    private ModeloProducto producto;
    private VistaProducto vistaProducto;

    public ControladorProducto(ModeloProducto producto, VistaProducto vistaProducto) {
        this.producto = producto;
        this.vistaProducto = vistaProducto;
    }

    public void mostrarDetallesProducto() {
        vistaProducto.mostrarProductos(producto);
    }
}
