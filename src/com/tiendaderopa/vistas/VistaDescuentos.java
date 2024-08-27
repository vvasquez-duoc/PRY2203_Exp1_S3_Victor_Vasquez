package com.tiendaderopa.vistas;

import java.util.Scanner;

public class VistaDescuentos {
    private Scanner teclado = new Scanner(System.in);

    public double preguntarDescuento() {
        System.out.print("Ingrese el porcentaje de descuento: ");
        return teclado.nextInt();
    }
}
