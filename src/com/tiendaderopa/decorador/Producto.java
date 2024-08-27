package com.tiendaderopa.decorador;

public class Producto implements Component {
    private String nombre;
    private int precio;
    private String marca;
    
    public Producto(){
        
    }
    
    public Producto(String nombre, int precio, String marca){
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
    }
    
    @Override
    public int getPrecio(){
        return this.precio;
    }
    @Override
    public String getNombre(){
        return this.nombre;
    }
    @Override
    public String getMarca(){
        return this.marca;
    }
    @Override
    public int aplicarDescuento(int precio){
        return precio;
    }

    public void setPrecio(int precio){
        this.precio = precio;
    }
}
