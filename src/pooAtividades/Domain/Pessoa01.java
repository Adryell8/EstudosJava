package pooAtividades.Domain;

import java.util.Calendar;

public class Pessoa01 {
	private String nome;
	private String sobreNome;
	private int AnoDeNascimento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public int getAnoDeNascimento() {
		return AnoDeNascimento;
	}

	public void setAnoDeNascimento(int anoDeNascimento) {
		AnoDeNascimento = anoDeNascimento;
	}

	public String JuntaNome() {
		return this.nome + " " + this.sobreNome;
	}

	public int QtdAnos() {
		Calendar cal = Calendar.getInstance();
		int anoAtual = cal.get(Calendar.YEAR);

		int anos = anoAtual - this.AnoDeNascimento;

		return anos;
	}
}