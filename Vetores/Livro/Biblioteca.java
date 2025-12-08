public class Biblioteca {

    private Livro[] livros;

    public Biblioteca(int qntd) {
        this.livros = new Livro[qntd];
    }

    public void add(int pos, Livro livro) {
        livros[pos] = livro;
    }

    public void listar() {
        for (int i = 0; i < livros.length; i++) {
            Livro l = livros[i];

            if (l != null) {
                System.out.println("Posição " + i + ": " + l.getTitulo() + " - " + l.getAutor());
            } else {
                System.out.println("Posição " + i + ": [Vazio]");
            }

        }
    }

    public Livro buscarPorAutor(String autor) {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null && livros[i].getAutor().equalsIgnoreCase(autor)) {
                return livros[i];
            }
        }
        return null; // se n encontrar
    }
}
