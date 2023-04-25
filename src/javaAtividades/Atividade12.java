package javaAtividades;

import java.util.Scanner;

public class Atividade12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int xA = 0, xB = 0, xC = 0;

		System.out.println("Informe o A lado do triangulo: ");
		xA = input.nextInt();
		System.out.println("Informe o B lado do triangulo: ");
		xB = input.nextInt();
		System.out.println("Informe o C lado do triangulo: ");
		xC = input.nextInt();

		int yA = 0, yB = 0, yC = 0;

		System.out.println("Informe o lado A do segundo Triangulo");
		yA = input.nextInt();
		System.out.println("Informe o lado B do segundo Triangulo");
		yB = input.nextInt();
		System.out.println("Informe o lado C do segundo Triangulo");
		yC = input.nextInt();

		double p1 = (xA + xB + xC) / 2;
		double area1 = Math.sqrt(p1 * (p1 - xA) * (p1 - xB) * (p1 - xC));

		double p2 = (yA + yB + yC) / 2;
		double area2 = Math.sqrt(p2 * (p2 - yA) * (p2 - yB) * (p2 - yC));

		System.out.println("A area do triangulo 1 é: " + area1);
		System.out.println("A area do triangulo 2 é: " + area2);

		if (area1 > area2) {
			System.out.println("O primiero triangulo é maior");
		} else {
			System.out.println("O segundo triangulo é maior");
		}

	}

}