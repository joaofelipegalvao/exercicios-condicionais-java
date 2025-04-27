package br.com.alura.exercicio03;

import java.util.Scanner;

public class ValidacaoDeSenha {
   public static void main(String[] args) {
      String senhaCorreta = "123456";
      Scanner scanner = new Scanner(System.in);
      System.out.println("Digite a senha: ");

      String senhaUsuario = scanner.nextLine();

      if (senhaUsuario.equals(senhaCorreta)) {
         System.out.println("Acesso permitido!");
      } else {
         System.out.println("Acesso negado!");
      }
      scanner.close();
   }
}
