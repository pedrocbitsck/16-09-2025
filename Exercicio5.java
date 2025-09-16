package com.mycompany.aula_9;

import java.util.ArrayList;

public class Exercicio5 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Amanda");
        nomes.add("Pedro");
        nomes.add("André");
        nomes.add("João");

        int contador = 0;
        for (String nome : nomes) {
            if (nome.startsWith("A")) {
                contador++;
            }
        }
        System.out.println("Nomes que começam com A: " + contador);
    }
}
