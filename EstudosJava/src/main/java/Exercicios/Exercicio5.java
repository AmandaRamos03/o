package Exercicios;

public class Exercicio5 {
    public static void main(String[] args) {

        String frase = "Java;Python;JavaScript";
        String[] linguagens = frase.split(";");

        System.out.println(linguagens[0]);
        System.out.println(linguagens[1]);
        System.out.println(linguagens[2]);
    }
}
