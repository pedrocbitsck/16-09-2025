package com.mycompany.aula_9;

public class Exercicio8 {
    public static void main(String[] args) {
        int[] numeros = {5, 12, 7, 20, 15};
        int contador = 0;

        for (int n : numeros) {
            if (n % 2 == 0) {
                contador++;
            }
        }
        System.out.println("Números pares: " + contador);
    }
}

