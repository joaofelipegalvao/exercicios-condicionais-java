package br.com.alura.exercicio04;

import java.util.Scanner;

public class ComparaNumeros {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Digite o primeiro número: ");
      int primeiroNumero = scanner.nextInt();
      System.out.println("Digite o segundo número: ");
      int segundoNumero = scanner.nextInt();

      if (primeiroNumero > segundoNumero) {
         System.out.println("O maior número é " + primeiroNumero);
      } else if (segundoNumero > primeiroNumero) {
         System.out.println("O maior número é " + segundoNumero);
      } else {
         System.out.println("Ambos são iguais");
      }

   }
}
