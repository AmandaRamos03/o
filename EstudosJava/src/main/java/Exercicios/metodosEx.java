package Exercicios;

public class metodosEx {
    public static int converterSegundos(int minutos){
        return minutos * 60;
    }
    public static void main (String[] args){
        int resultado = converterSegundos(6);
        System.out.println(resultado);
    }
}
