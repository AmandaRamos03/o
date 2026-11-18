package Exercicios;

public class metodo4 {
    public static double calcularMedia (double nota1, double nota2){
        return (nota1 + nota2) / 2;
    }

    public static void main(String[] args){
        double resultado = calcularMedia(8.0, 6.0);
        System.out.println(resultado);
    }
}
