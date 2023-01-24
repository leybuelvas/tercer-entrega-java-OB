package com.company;

import javax.swing.*;

public class Nombres {

    public static void main(String[] args) {

        //se crea el array de tipo String
        String[] nombres = new String[] { "Ley", "Lesly", "Juan"};

        //se recorre el array y mostramos en consola
        for(int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    }
}
