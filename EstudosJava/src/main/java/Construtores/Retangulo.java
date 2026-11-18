package Construtores;

public class Retangulo {
    double largura;
    double altura;

public Retangulo (double largura, double altura){
    this.largura = largura;
    this.altura = altura;
}

public double calcularArea(){
    return largura * altura;
}

public static void main (String [] args){
    Retangulo retangulo = new Retangulo(5,3);

    System.out.println(retangulo.calcularArea());

}
}
