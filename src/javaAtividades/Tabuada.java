package javaAtividades;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe qual tabuada voc� deseja ver (informe apenas o n�mero):");
		int tabNum = sc.nextInt();

		sc.nextLine();

		System.out.println("Informe at� quanto voc� deseja que a tabuada v�: ");
		int tabNumMax = sc.nextInt();

		for (int i = 1; i <= tabNumMax; i++) {
			int resultado = tabNum * i;
			System.out.println(tabNum + " * " + i + " : " + resultado);
		}

	}

}