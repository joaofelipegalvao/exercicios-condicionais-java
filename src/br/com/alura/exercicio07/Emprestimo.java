package br.com.alura.exercicio07;

import java.util.Scanner;

public class Emprestimo {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Digite o valor do empréstimo: ");

      double valorEmprestimo = scanner.nextDouble();

      if (valorEmprestimo >= 1000 && valorEmprestimo <= 5000) {
         System.out.printf("O valor R$ %.2f, está dentro do intervalo permitido.\n", valorEmprestimo);
      } else {
         System.out.printf("O valor R$ %.2f, não está dentro do intervalo permitido.\n", valorEmprestimo);
      }
   }
}
