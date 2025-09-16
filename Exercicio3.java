package com.mycompany.aula_9;
public class Exercicio3 {
    public static void main(String[] args) {
        int[] numeros = {5, 12, 7, 20, 15};

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                numeros[i] = 0;
            }
        }

        System.out.print("Array com ímpares = 0: ");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
    }
}

