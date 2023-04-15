package javaAtividades;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe qual tabuada você deseja ver (informe apenas o número):");
		int tabNum = sc.nextInt();

		sc.nextLine();

		System.out.println("Informe até quanto você deseja que a tabuada vá: ");
		int tabNumMax = sc.nextInt();

		for (int i = 1; i <= tabNumMax; i++) {
			int resultado = tabNum * i;
			System.out.println(tabNum + " * " + i + " : " + resultado);
		}

	}

}