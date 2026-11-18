package Exercicios;

public class desafioExtra {
    public static void verificarEstoque(int quantidadeProduto) {
        if (quantidadeProduto < 5) {
            System.out.println("Estoque baixo!");
        } else {
            System.out.println("Estoque suficiente");
        }
    }
    public static void main(String[]args){
            verificarEstoque(6);
        }
    }


