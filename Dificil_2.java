package com.mycompany.aula_9;

import java.util.ArrayList;

public class Dificil_2 {
    public static void main(String[] args) {
        ArrayList<String> Palavras = new ArrayList<>();
        Palavras.add("Uva");
        Palavras.add("Maça");
        Palavras.add("Kiwi");
        Palavras.add("Banana");
        
        ArrayList<String> comA = new ArrayList<>();
          for (String Palavra : Palavras) {
              if (Palavra.contains("a")) {
                  comA.add(Palavra);
              }
          }
          System.out.println("Palavras com a letra A: "+comA);
    }
    
}
