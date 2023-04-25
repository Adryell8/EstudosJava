package pooAtividades.Test;

import java.util.Scanner;
import pooAtividades.Domain.AtividadeCalcTriangulo;

public class AtividadeCalcTrianguloTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		AtividadeCalcTriangulo triangulo = new AtividadeCalcTriangulo();
		AtividadeCalcTriangulo triangulo2 = new AtividadeCalcTriangulo();

		System.out.println("Informe o A lado do triangulo: ");
		triangulo.a = input.nextDouble();
		System.out.println("Informe o B lado do triangulo: ");
		triangulo.b = input.nextDouble();
		System.out.println("Informe o C lado do triangulo: ");
		triangulo.c = input.nextDouble();

		System.out.println("Informe o A lado do triangulo: ");
		triangulo2.a = input.nextDouble();
		System.out.println("Informe o B lado do triangulo: ");
		triangulo2.b = input.nextDouble();
		System.out.println("Informe o C lado do triangulo: ");
		triangulo2.c = input.nextDouble();

		System.out.println(triangulo.area());
		System.out.println(triangulo2.area());

		if (triangulo.area() > triangulo2.area()) {
			System.out.println("O primiero triangulo é maior");
		} else {
			System.out.println("O segundo triangulo é maior");
		}

		if (triangulo.area() < triangulo2.area()) {
			System.out.println("O primiero triangulo é menor");
		} else {
			System.out.println("O segundo triangulo é menor");
		}

	}

}