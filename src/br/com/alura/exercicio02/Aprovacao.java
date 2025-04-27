package br.com.alura.exercicio02;

public class Aprovacao {
   public static void main(String[] args) {
      double media = 7;

      if (media >= 7) {
         System.out.printf("O estudante teve média %.1f e foi aprovado.%n", media);
      } else if (media >= 5.0 && media <= 6.9) {
         System.out.printf("O estudante teve média %.1f e está de recuperação.%n", media);
      } else {
         System.out.printf("O estudante teve média %.1f e foi reprovado.%n", media);
      }
   }
}
