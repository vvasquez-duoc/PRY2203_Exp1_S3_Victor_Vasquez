package com.tiendaderopa.controlador;

import com.tiendaderopa.modelos.ModeloOrdenesCompra;
import com.tiendaderopa.modelos.ModeloProducto;
import com.tiendaderopa.vistas.VistaCarro;

public class ControladorCarro {
    private ModeloOrdenesCompra orden;
    private VistaCarro vistaCarro;

    public ControladorCarro(ModeloOrdenesCompra orden, VistaCarro vistaCarro) {
        this.orden = orden;
        this.vistaCarro = vistaCarro;
    }

    public void addProductoAlCarro(ModeloProducto producto) {
        orden.addProducto(producto);
    }

    public void mostrarDetallesCarro() {
        vistaCarro.mostrarCarro(orden);
    }
}
