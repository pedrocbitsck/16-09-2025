package com.mycompany.aula_9;

import java.util.ArrayList;

public class Dificil_1 {
    public static void main(String[] args) {
        ArrayList <Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);

         ArrayList <Integer> pares = new ArrayList<>();
         for (int numero : numeros) {
             if (numero % 2 == 0) {
                 pares.add(numero);
             }
         }
         System.out.println("Os pares achados foi os numeros "+pares);
    }
   
}
