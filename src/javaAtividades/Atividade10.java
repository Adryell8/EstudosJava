package javaAtividades;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] notas = new int[5];

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe a nota: ");
			notas[i] = input.nextInt();
		}
		for (int j : notas) {
			if (j % 2 == 0) {
				System.out.println("Valor original: " + j);
				j = j * 3;
				System.out.println("Valor modificado: " + j);
			} else if (j % 2 != 0) {
				System.out.println("Valor original: " + j);
				j = j + 1;
				System.out.println("Valor modificado: " + j);
			}
		}
	}
}