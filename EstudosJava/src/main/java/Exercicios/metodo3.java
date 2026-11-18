package Exercicios;

public class metodo3 {
    public static boolean ehPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
        public static void main(String[] args){
            boolean resultado = ehPar(7);
            System.out.println(resultado);
        }

}
