package br.com.alura.exercicio01;

import java.util.Scanner;

public class ParOuImpar {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Digite um número inteiro para verificar se é par ou ímpar: ");
      int numero = scanner.nextInt();

      if (numero % 2 == 0) {
         System.out.println(numero + " é par.");
      } else {
         System.out.println(numero + " é impar");
      }
      scanner.close();
   }
}
