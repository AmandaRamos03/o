package Sobrecarga;

    public class Teste {
        String texto;

        public Teste() {
            this.texto = "vazio";
        }

        public Teste(String texto) {
            this.texto = texto;
        }

        public Teste(String texto, int vezes) {
            this.texto = texto.repeat(vezes);
        }

        public static void main(String[] args) {
            System.out.println(new Teste().texto);
            System.out.println(new Teste("oi").texto);
            System.out.println(new Teste("ha", 3).texto);
        }
    }

