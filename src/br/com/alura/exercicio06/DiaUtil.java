package br.com.alura.exercicio06;

import java.util.Scanner;

public class DiaUtil {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Digite o dia da semana (em letras minúsculas): ");

      String dia = scanner.nextLine();
      switch (dia) {
         case "segunda":
         case "terça":
         case "quarta":
         case "quinta":
         case "sexta":
            System.out.println(dia + " é um dia útil");
            break;
         default:
            System.out.println("Dia inválido");
      }
   }
}
