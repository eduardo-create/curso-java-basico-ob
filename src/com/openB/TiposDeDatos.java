package com.openB;

public class TiposDeDatos {

    public static void main(String[] args) {

        //Datos numericos
        //numericos enteros
        byte variable1 = 1;
        System.out.println(variable1);
        short variable2 = 10;
        System.out.println(variable2);
        //se suele trabajar mas con estas dos ultimas opciones por mayor capacidad de alamacenamiento
        int variable3 = 20;
        System.out.println(variable3);
        long variable4 = 30;
        System.out.println(variable4);

        //numericos con decimales
        float variable5 = 5.5f;
        System.out.println(variable5);
        double variable6 = 10.5d;
        System.out.println(variable6);

        //booleanos
        boolean variable7 = false;
        System.out.println(variable7);
        boolean variable8 = true;
        System.out.println(variable8);


        //De texto
        char variable9 = 'a'; //se escribe comilla simple para diferencia caracter de cadena de texto
        System.out.println(variable9);
        String variable10 = "Eduardo";
        System.out.println(variable10);
    }
}
