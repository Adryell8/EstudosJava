package pooAtividades.Domain.BibliotecaDomain;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Autor {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String nomeAutor;
	private Date dataNascimento;
	private List<Livro> listLivros = new ArrayList<Livro>();

	public Autor() {
	}

	public Autor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public Autor(String nomeAutor, Date dataNascimento) {
		this.nomeAutor = nomeAutor;
		this.dataNascimento = dataNascimento;
	}

	public Autor(String nomeAutor, Date dataNascimento, List<Livro> livros) {
		this.nomeAutor = nomeAutor;
		this.dataNascimento = dataNascimento;
		this.listLivros = livros;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public Date getAnoNascimento() {
		return dataNascimento;
	}

	public void setAnoNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public List<Livro> getLivros() {
		return listLivros;
	}

	public void setLivros(List<Livro> livros) {
		this.listLivros = livros;
	}
	
	public void adicionaLivro(Livro livros) {
		listLivros.add(livros);
	}
	public void removeLivro(Livro livros) {
		listLivros.remove(livros);
	}
	public void removeLivro(int indice) {
		if(indice >= 0 && indice < listLivros.size()) {
			listLivros.remove(indice);
		}else {
			System.out.println("Livro não encontrado");
		}
	}
	public void updateLivro(int indice, Livro livroNovo ) {
		if(indice >= 0 && indice < listLivros.size()) {
		listLivros.set(indice, livroNovo);
		}else {
			System.out.println("Índice inválido.");
		}
	}
	public int quantLivros() {
		return listLivros.size();
	}
	public String obterLivro(Livro livro) {
		if(listLivros.contains(livro)) {
			return livro.toString();
		}
		return "Livro não encontrado";
	}
	@Override
	public String toString() {
		return "Autor [nomeAutor=" + nomeAutor + ", data Nascimento=" + sdf.format(dataNascimento) + ", livros=" + listLivros + "]";
	}

}
