package pooAtividades.Domain.BibliotecaDomain;

public class Livro {
	private String nomeLivro;
	private int anoLancamentoLivro;
	
	public Livro() {
		
	}
	public Livro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	public Livro(String nomeLivro, int anoLancamentoLivro) {
		this.nomeLivro = nomeLivro;
		this.anoLancamentoLivro = anoLancamentoLivro;
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
	@Override
	public String toString() {
		return "Livro [nomeLivro=" + nomeLivro + ", anoLancamentoLivro=" + anoLancamentoLivro + "]";
	}
	
	
	
}