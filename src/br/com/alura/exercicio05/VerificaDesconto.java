package br.com.alura.exercicio05;

import java.util.Locale;
import java.util.Scanner;

public class VerificaDesconto {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Digite o valor da compra: ");

      double valorDaCompra = scanner.nextDouble();

      if (valorDaCompra >= 100) {
         double desconto = 10;
         double precoComDesconto = valorDaCompra - (valorDaCompra * desconto) / 100;
         System.out.printf("Desconto de 10%% aplicado.\nNovo valor: R$ %.2f\n", precoComDesconto);
      } else {
         System.out.printf("Desconto não aplicado. \nValor total: R$ %.2f\n", valorDaCompra);
      }
      scanner.close();
   }
}
