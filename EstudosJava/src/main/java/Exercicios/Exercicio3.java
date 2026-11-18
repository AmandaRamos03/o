package Exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua primeira nota: ");
        double primeiraNota = sc.nextDouble();

        System.out.println("Digite a sua segunda nota: ");
        double segundaNota = sc.nextDouble();

        double media = (primeiraNota + segundaNota) / 2;

        if (media >= 7) {
            System.out.println("Aprovado! Sua média é: " + media);
        } else if (media >= 5 && media < 7) {
            System.out.println("Em recuperação! Sua média é: " + media);
        } else {
            System.out.println("Reprovado! Sua média é: " + media);
        }

        sc.close();
    }

    public static class Exercicio4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite um número: ");
            int numero = sc.nextInt();

            for (int i = numero; i >= 0; i--) {
                System.out.println(i);
            }
            {
                System.out.println("Fim");
            }
        }
    }
}
