package Exercicios;

public class Aluno{
    String nome;
    int idade;

    public Aluno (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Amanda", 20);

        System.out.println(aluno1.nome);
        System.out.println(aluno1.idade);
    }
}
