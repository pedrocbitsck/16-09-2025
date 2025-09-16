package com.mycompany.aula_9;


public class Exercicio1 {
    public static void main(String[] args) {
        int[] numeros = {5, 12, 7, 20, 15};
        int contador = 0;

        for (int n : numeros) {
            if (n > 10) {
                contador++;
            }
        }
        System.out.println("Maiores que 10: " + contador);
    }
}
