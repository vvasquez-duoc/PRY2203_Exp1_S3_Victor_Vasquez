package com.tiendaderopa.decorador;

public class DescuentoDiezPorciento extends Decorator{
    public DescuentoDiezPorciento(Component producto){
        super(producto);
    }
    
    @Override
    public int aplicarDescuento(int precio){
        return (int) Math.round(precio * 0.9);
    }
}
