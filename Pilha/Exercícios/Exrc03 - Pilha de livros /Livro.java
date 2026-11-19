public class Livro {

    private String titulo;
    private String isbn;
    private int anoDePublicacao;
    private String autor;

    public Livro(String titulo, String isbn, int anoDePublicacao, String autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.anoDePublicacao = anoDePublicacao;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro " +
                " | titulo: " + titulo +
                " | isbn: " + isbn +
                " | anoDePublicacao: " + anoDePublicacao +
                " | autor: " + autor;
    }
}
