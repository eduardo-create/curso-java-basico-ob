package com.openB;

public class Funciones {

    public static void main(String[] args) {


        double result2 = precioConIva(1510d, 1.21d);

        System.out.println(result2);

    }

    static int precioConIva(double price, double iva){
        return ((int) (price * iva));
    }
}
