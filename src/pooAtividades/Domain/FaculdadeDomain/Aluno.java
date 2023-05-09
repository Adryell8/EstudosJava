package pooAtividades.Domain.FaculdadeDomain;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String nome;
	private int idade;
	private String faculdade;

	List<Disciplina> disciplinas = new ArrayList<Disciplina>();// um array list é usado para quando não se sabe o
																// tamanho do array

	public double calculaMedia() {
		double somaNotas = 0;
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}
		return somaNotas / disciplinas.size();
	}

	public String SituacaoAluno() {
		String situacao;
		if (calculaMedia() >= 70) {
			situacao = "Aprovado";
		} else {
			situacao = "Reprovado";
		}
		return situacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getFaculdade() {
		return faculdade;
	}

	public void setFaculdade(String faculdade) {
		this.faculdade = faculdade;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	@Override
	public String toString() {
		return "--- Aluno ---" + "\nNome aluno:" + nome + ", " + "\nIdade:" + idade + "," + "\nFaculdade:" + faculdade
				+ ", " + "\n" + disciplinas + "\nMédia: " + calculaMedia() + "\nSituação: " + SituacaoAluno();
	}

}