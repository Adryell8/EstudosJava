package pooAtividades.Test.TestCadastroSeminario;

import java.util.Scanner;

import pooAtividades.Domain.CadastroSimplesSeminario.Aluno;
import pooAtividades.Domain.CadastroSimplesSeminario.Local;
import pooAtividades.Domain.CadastroSimplesSeminario.ProfessorSeminario;
import pooAtividades.Domain.CadastroSimplesSeminario.Seminario;

public class CadastroSeminario {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String Endereco, NomeAluno, NomeProfessor, Especializacao, SeminarioTitulo;
		int IdadeAluno;

		System.out.println("Informe o indereço: ");
		Endereco = input.nextLine();
		Local local = new Local(Endereco);
		
		System.out.println("Informe o nome do aluno:");
		NomeAluno = input.nextLine();
		System.out.println("Informe a idade do aluno:");
		IdadeAluno = input.nextInt();
		Aluno aluno = new Aluno(NomeAluno, IdadeAluno);
		Aluno[] alunos = { aluno };

		input.nextLine();

		System.out.println("Informe o nome do professor:");
		NomeProfessor = input.nextLine();
		System.out.println("Informe a especialização do professor:");
		Especializacao = input.nextLine();
		ProfessorSeminario professorSemi = new ProfessorSeminario(NomeProfessor, Especializacao);

		System.out.println("Informe o titulo do seminairo:");
		SeminarioTitulo = input.nextLine();
		Seminario seminario = new Seminario(SeminarioTitulo, local, alunos);
		Seminario[] seminarios = { seminario };

		professorSemi.setseminarios(seminarios);
	}

}
