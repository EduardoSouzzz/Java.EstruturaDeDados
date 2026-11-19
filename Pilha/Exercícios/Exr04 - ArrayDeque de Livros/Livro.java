package pilhas;

public class Livro {
	
	private String titulo;
	private String isbn;
	private int anoPUblicacao;
	private String autor;
	
	public Livro(String titulo, String isbn, int anoPUblicacao, String autor) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.anoPUblicacao = anoPUblicacao;
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

	public int getAnoPUblicacao() {
		return anoPUblicacao;
	}

	public void setAnoPUblicacao(int anoPUblicacao) {
		this.anoPUblicacao = anoPUblicacao;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", isbn=" + isbn + ", anoPUblicacao=" + anoPUblicacao + ", autor=" + autor
				+ "]";
	}
}
