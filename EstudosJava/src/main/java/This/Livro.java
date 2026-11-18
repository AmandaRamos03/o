package This;

public class Livro {
    String titulo;
    String autor;
    int paginas;

    // Construtor 1: só o título -> chama o construtor 2
    public Livro(String titulo) {
        this(titulo, "Desconhecido");
    }

    // Construtor 2: título e autor -> chama o construtor 3
    public Livro(String titulo, String autor) {
        this(titulo, autor, 0);
    }

    // Construtor 3: completo -> o único que faz as atribuições
    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return String.format("Título: %s%nAutor: %s%nPáginas: %d%n", titulo, autor, paginas);
    }

    public static void main(String[] args) {
        Livro livro1 = new Livro("O renascimento");
        Livro livro2 = new Livro("O nascimento", "Amanda Francisca");
        Livro livro3 = new Livro("A morte", "Amanda Francisca", 18);

        System.out.println(livro1);
        System.out.println(livro2);
        System.out.println(livro3);
    }
}