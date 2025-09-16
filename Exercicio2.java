package com.mycompany.aula_9;

import java.util.ArrayList;

public class Exercicio2 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Alice");
        nomes.add("Carlos");

        int contador = 0;
        for (String nome : nomes) {
            if (nome.startsWith("A")) {
                contador++;
            }
        }
        System.out.println("Nomes que começam com A: " + contador);
    }
}
