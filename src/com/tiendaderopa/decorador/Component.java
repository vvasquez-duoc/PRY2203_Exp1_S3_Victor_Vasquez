package com.tiendaderopa.decorador;

public interface Component {
    int getPrecio();
    String getMarca();
    String getNombre();
    
    int aplicarDescuento(int precio);
}
