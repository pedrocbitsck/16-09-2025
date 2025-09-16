package com.mycompany.aula_9;
    
public class Exercicio4 {
    public static void main(String[] args) {
        int[] numeros = {8, 15, 3, 22, 11};
        int contador = 0;

        for (int n : numeros) {
            if (n > 10) {
                contador++;
            }
        }
        System.out.println("Maiores que 10: " + contador);
    }
}
