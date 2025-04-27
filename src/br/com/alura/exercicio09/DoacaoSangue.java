package br.com.alura.exercicio09;

import java.util.Scanner;

public class DoacaoSangue {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Digite a idade do doador: ");
      int idadeDoador = scanner.nextInt();
      System.out.println("Digite o peso do doador (em kg): ");
      int pesoDoador = scanner.nextInt();
      if (idadeDoador >= 18 && idadeDoador <= 65 && pesoDoador > 50) {
         System.out.println("O doador é compatível");
      } else {
         System.out.println("O doador não é compatível.");
         if (idadeDoador < 18 || idadeDoador > 65) {
            System.out.println("Motivo: Deve ter entre 18 e 65 anos");
         }
         if (pesoDoador <= 50) {
            System.out.println("Motivo: Deve pesar mais de 50Kg.");
         }
      }
      scanner.close();
   }
}
