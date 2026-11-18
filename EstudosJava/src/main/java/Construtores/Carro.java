package Construtores;

public class Carro {
    String marca;
    int ano;

    public Carro(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro("Corolla", 2003);
        Carro carro2 = new Carro(" Hb20", 2027);

        System.out.println("Carro 1 é da marca: " + carro1.marca + " e é do ano: " + carro1.ano);
        System.out.println("Carro 2 é da marca: " + carro2.marca + " e é do ano: " + carro2.ano);

    }
}
