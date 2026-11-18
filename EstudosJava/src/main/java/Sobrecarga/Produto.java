package Sobrecarga;

public class Produto {
    String nome;
    double preco;
    int estoque;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = 0;
    }

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public static void main(String[] args) {
        Produto p1 = new Produto("Caneta", 2.50);
        Produto p2 = new Produto("Lapis", 2.0, 1);

        System.out.println("Produto:" + p1.nome);
        System.out.printf("Preco: %.2f%n", p1.preco);
        System.out.println("Estoque: " + p1.estoque);
        
        System.out.println("Produto:" + p2.nome);
        System.out.printf("Preco: %.2f%n", p2.preco);
        System.out.println("Estoque: " + p2.estoque);
    }
}