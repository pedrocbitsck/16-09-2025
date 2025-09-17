package com.mycompany.aula_9;

public class Facil_3 {
    public static void main(String[] args) {
      int[] numeros = {3,5,7,2,8,1,4,10,6};
       int maior =numeros[0];
       for(int numero : numeros) {
           if(numero > maior){
               maior = numero;
           }
       }
       System.out.println("O maior vai ser: "+maior);
    }
    
}
