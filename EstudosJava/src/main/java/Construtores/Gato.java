package Construtores;

public class Gato {
    String nome;
    int idade;

    public Gato(){
        this.nome = "sem nome";
        this.idade = 0;
    }
    public static void main (String [] args){
        Gato gato = new Gato();
        System.out.println(gato.nome);
        System.out.println(gato.idade);
    }
}
