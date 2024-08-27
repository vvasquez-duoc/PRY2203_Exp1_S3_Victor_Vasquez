package com.tiendaderopa.modelos;

public class ModeloProducto {
    private String nombre;
    private int precio;

    public ModeloProducto(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre(){ 
        return nombre;
    }
    public void setNombre(String nombre){ 
        this.nombre = nombre; 
    }

    public int getPrecio(){ 
        return precio; 
    }
    public void setPrice(int precio){ 
        this.precio = precio; 
    }
}
