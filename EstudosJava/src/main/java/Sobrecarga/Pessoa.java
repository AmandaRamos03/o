package Sobrecarga;

public class Pessoa {
    String nome;
    int idade;

    public Pessoa() {
        this.nome = "Desconhecido";
        this.idade = 0;
    }

    public Pessoa(String nome) {
        this.nome = nome;
        this.idade = 18;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("Amanda");
        Pessoa p3 = new Pessoa("Cida", 23);

        System.out.println(p1.nome);
        System.out.println(p1.idade);
        System.out.println();

        System.out.println(p2.nome);
        System.out.println(p2.idade);
        System.out.println();

        System.out.println(p3.nome);
        System.out.println(p3.idade);
    }
}