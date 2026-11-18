package Exercicios;

public class metodo6 {
    public static double calcularPrecoFinal(double preco) {
        return preco - preco * (10.0 / 100);
    }
    public static void main (String []args){
        double resultado = calcularPrecoFinal(200.00);
        System.out.println(resultado);
    }
}
