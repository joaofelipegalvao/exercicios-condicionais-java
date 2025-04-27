package br.com.alura.exercicio08;

import java.util.Scanner;

public class VerificacaoTriangulo {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Digite o primeiro lado: ");
      int primeiroLado = scanner.nextInt();
      System.out.println("Digite o segundo lado: ");
      int segundoLado = scanner.nextInt();
      System.out.println("Digite o terceiro lado: ");
      int terceiroLado = scanner.nextInt();

      if (primeiroLado + segundoLado > terceiroLado && primeiroLado + terceiroLado > segundoLado && segundoLado + terceiroLado > primeiroLado) {
         System.out.println("Os lados podem formar um triângulo");
      } else {
         System.out.println("Os lados NÃO podem formar um triângulo.");
      }
      scanner.close();
   }
}
