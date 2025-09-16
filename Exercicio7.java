package com.mycompany.aula_9;
public class Exercicio7 {
    public static void main(String[] args) {
        int[] numeros = {25, 12, 7, 20, 15};
        int menor = numeros[0];

        for (int n : numeros) {
            if (n < menor) {
                menor = n;
            }
        }
        System.out.println("Menor número: " + menor);
    }
}
