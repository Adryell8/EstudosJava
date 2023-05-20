package pooAtividades.Domain.BibliotecaDomain;

import java.util.ArrayList;
import java.util.List;

public class Autor {
	private String nomeAutor;
	private int anoNascimento;
	List<Livro> livros = new ArrayList<>();
	
	public Autor() {
		
	}
	
	public Autor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
	public Autor(String nomeAutor, List<Livro>livros) {
		this.nomeAutor = nomeAutor;
		this.livros = livros;
	}
	public Autor(String nomeAutor, List<Livro>livros,int anoNascimento) {
		this.nomeAutor = nomeAutor;
		this.anoNascimento = anoNascimento;
	}
	
	public String getNomeAutor() {
		return nomeAutor;
	}
	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public List<Livro> getLivros() {
		return livros;
	}
	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	@Override
	public String toString() {
		return "Autor [nomeAutor=" + nomeAutor + ", anoNascimento=" + anoNascimento + ", livros=" + livros + "]";
	}
	
	
}
