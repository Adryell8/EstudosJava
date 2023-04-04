package javaAtividades;

import java.util.Scanner;

public class Atividade08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char vogal;
		System.out.println("Informe a vogal: ");
		vogal = sc.next().charAt(0);

		String vogalString = Character.toString(vogal);

		if (vogalString.equalsIgnoreCase("a")) {
			System.out.println("É uma vogal.");
		} else {
			System.out.println("Não é um usuário.");
		}

	}

}