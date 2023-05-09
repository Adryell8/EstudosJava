package pooAtividades.Test.FaculdadeTest;

import java.util.Scanner;
import pooAtividades.Domain.FaculdadeDomain.Aluno;
import pooAtividades.Domain.FaculdadeDomain.Disciplina;

public class FaculdadeTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Aluno al = new Aluno();
		System.out.println("Informe o nome do Aluno: ");
		al.setNome(input.nextLine());

		System.out.println("Informe a idade do Aluno: ");
		al.setIdade(input.nextInt());

		System.out.println("Informe a faculdade do aluno: ");
		input.nextLine();
		al.setFaculdade(input.nextLine());

		System.out.println("Informe a quantidade de disciplinas: ");
		int qtdDisciplinas = input.nextInt();

		for (int i = 1; i <= qtdDisciplinas; i++) {
			input.nextLine();

			System.out.println("Informe a disciplina " + i + ": ");
			String disc = input.nextLine();

			System.out.println("Informe a nota " + i + ": ");
			double nota = input.nextDouble();
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(disc);
			disciplina.setNota(nota);

			al.getDisciplinas().add(disciplina);
		}
		// System.out.println("Média do aluno: " + al.calculaMedia());
		// System.out.println("Situação do aluno:" + al.SituacaoAluno());
		System.out.println(al);
		input.close();
	}

}
