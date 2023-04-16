package pooAtividades.Test;

import java.util.Scanner;

import pooAtividades.Domain.Escola;
import pooAtividades.Domain.Professor;

public class EscolaTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o nome do professor: ");
		Professor professor = new Professor(sc.nextLine());
		Professor[] professores = {professor};
		System.out.println("Informe o nome da escola: ");
		Escola escola = new Escola(sc.nextLine(), professores);
		//escola.setProfessor(professores);
		
		escola.imprime();
		
	}

}
