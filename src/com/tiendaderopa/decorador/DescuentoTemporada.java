package com.tiendaderopa.decorador;

public class DescuentoTemporada extends Decorator{
    private int descuentoTemporada;
    
    public DescuentoTemporada(Component producto, int descuentoTemporada){
        super(producto);
        this.descuentoTemporada = descuentoTemporada;
    }
    
    @Override
    public int aplicarDescuento(int precio){
        return (int) Math.round(precio - (precio * descuentoTemporada / 100));
    }
}
