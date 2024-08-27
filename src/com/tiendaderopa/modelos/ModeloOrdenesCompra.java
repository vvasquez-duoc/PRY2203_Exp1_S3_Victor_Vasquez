package com.tiendaderopa.modelos;

import java.util.ArrayList;
import java.util.List;

public class ModeloOrdenesCompra {
    private List<ModeloProducto> productos = new ArrayList<>();

    public void addProducto(ModeloProducto producto){
        productos.add(producto);
    }

    public List<ModeloProducto> getProductos(){
        return productos;
    }

    public int calcularTotal(){
        return productos.stream().mapToInt(ModeloProducto::getPrecio).sum();
    }
}
