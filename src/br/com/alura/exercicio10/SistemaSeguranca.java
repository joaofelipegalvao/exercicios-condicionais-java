package br.com.alura.exercicio10;

import java.util.Scanner;

public class SistemaSeguranca {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int codigoAcesso = 2023;

      System.out.println("Digite o código de acesso: ");
      int codigoDigitado = scanner.nextInt();
      System.out.println("Digite o nível de permissão: ");
      int nivelPermissao = scanner.nextInt();

      boolean codigoValido = codigoDigitado == codigoAcesso;
      boolean permissaoValida = nivelPermissao == 1 || nivelPermissao == 2 || nivelPermissao == 3;
      if (codigoValido && permissaoValida) {
         System.out.println("Acesso permitido. Bem-vindo ao sistema!");
      } else {
         System.out.println("Acesso negado pelos seguintes motivo(s):");
         if (!codigoValido) {
            System.out.println("- Código de acesso incorreto. Por favor, verifique e tente novamente");
         }
         if (!permissaoValida) {
            System.out.println("- Nível de permissão informado é inválido.");
         }
      }
      scanner.close();
   }
}
