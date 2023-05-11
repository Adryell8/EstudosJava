package pooAtividades.Domain.BibliotecaDomain;

public class Livro {
	private String nomeLivro;
	private int anoLancamentoLivro;
	private Autor autor;
	
	public Livro() {
		
	}
	public Livro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	public Livro(String nomeLivro, int anoLancamentoLivro) {
		this.nomeLivro = nomeLivro;
		this.anoLancamentoLivro = anoLancamentoLivro;
	}
	public Livro(String nomeLivro, int anoLancamentoLivro, Autor autor) {
		this.nomeLivro = nomeLivro;
		this.anoLancamentoLivro = anoLancamentoLivro;
		this.autor = autor;
	}
	public String getNomeLivro() {
		return nomeLivro;
	}
	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	public int getAnoLancamentoLivro() {
		return anoLancamentoLivro;
	}
	public void setAnoLancamentoLivro(int anoLancamentoLivro) {
		this.anoLancamentoLivro = anoLancamentoLivro;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}

}