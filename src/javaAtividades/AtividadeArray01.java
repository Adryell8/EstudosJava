package javaAtividades;

import java.util.Scanner;

public class AtividadeArray01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] num1 = new int[5];
		int[] num2 = new int[5];

		for (int i = 0; i < num1.length; i++) {
			System.out.println("Informe " + (i + 1) + "°" + " número:");
			num1[i] = input.nextInt();
// num2[i] = num1[i];
		}

		num2 = num1;

		for (int j = 0; j < num2.length; j++) {
			System.out.println(num2[j]);
		}
	}

}