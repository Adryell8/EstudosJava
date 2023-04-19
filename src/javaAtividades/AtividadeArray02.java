package javaAtividades;

import java.util.Scanner;

public class AtividadeArray02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double num[] = new double[5];
		double soma = 0, media = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Informe " + (i + 1) + "°" + " número:");
			num[i] = input.nextInt();
		}
		for (int j = 0; j < 5; j++) {
			System.out.println("Número " + (j + 1) + ":" + num[j]);
			soma += num[j];

		}

		System.out.println(soma);

		media = (soma / 5);

		System.out.println("A média é: " + media);
	}

}
