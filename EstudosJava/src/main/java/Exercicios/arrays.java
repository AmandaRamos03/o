package Exercicios;

public class arrays {
    public static void main(String[] args) {
        int[] numeros = {5, 10, 15, 20};

        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma = soma + numeros[i];
        }

        System.out.println("A soma é: " + soma);
    }
}