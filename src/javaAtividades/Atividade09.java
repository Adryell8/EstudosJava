package javaAtividades;

import java.util.Scanner;

public class Atividade09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int joao, maria, jose;

		System.out.println("Informe a idade do primeiro filho: ");
		joao = sc.nextInt();

		System.out.println("Informe a idade do segundo filho: ");
		maria = sc.nextInt();

		System.out.println("Informe a idade do terceiro filho: ");
		jose = sc.nextInt();

		if ((joao < jose) && (joao < maria)) {
			System.out.println("Jo�o � o ca�ula");
		} else {
			if ((jose < joao) && (jose < maria)) {
				System.out.println("jose � ca�ula");
			} else {
				System.out.println("Maria � o ca�ula.");
			}
		}
	}

}