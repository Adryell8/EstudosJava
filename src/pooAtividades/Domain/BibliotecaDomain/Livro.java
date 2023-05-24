package pooAtividades.Domain.BibliotecaDomain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Livro {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String nomeLivro;
	private Date anoLancamentoLivro;


	public Livro() {

	}

	public Livro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public Livro(String nomeLivro, Date anoLancamentoLivro) {
		this.nomeLivro = nomeLivro;
		this.anoLancamentoLivro = anoLancamentoLivro;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivroAtual, String nomeLivroNovo) {
		if (this.nomeLivro.equals(nomeLivroAtual)) {
			this.nomeLivro = nomeLivroNovo;
		}
	}

	public Date getAnoLancamentoLivro() {
		return anoLancamentoLivro;
	}

	public void setAnoLancamentoLivro(Date anoLancamentoLivro) {
		this.anoLancamentoLivro = anoLancamentoLivro;
	}

	public void updateNomeLivro() {

	}

	@Override
	public String toString() {
		return "Livro [nomeLivro=" + nomeLivro + ", anoLancamentoLivro=" + sdf.format(anoLancamentoLivro);
	}

}