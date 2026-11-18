package Exercicios;

import java.util.Scanner;
import java.util.Locale;

public class LojaVirtual {
    public static double calcularPrecoFinal(
            double valorCompra) {
        if (valorCompra <= 100.0) {
            return valorCompra - (valorCompra * 10.0 / 100.0);
        } else {
            return valorCompra;
        }
    }
    public static boolean verificarCupom(double valorCompra) {
        if (valorCompra <= 100.0) {
            return true;
        } else {
            return false;
        }
    }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            sc.useLocale(Locale.US);

            System.out.println("Digite o valor da compra:");
            double valorCompra = sc.nextDouble();

            double resultado1 = calcularPrecoFinal(valorCompra);
            boolean resultado2 = verificarCupom(valorCompra);

            System.out.println(resultado1);
            System.out.println(resultado2);
        }
    }
