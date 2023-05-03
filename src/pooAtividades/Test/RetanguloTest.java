package pooAtividades.Test;

import java.util.Scanner;

import pooAtividades.Domain.Retangulo;

public class RetanguloTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Retangulo ret = new Retangulo();

		double a, l;

		System.out.println("Informe a altura do retangulo: ");
		ret.a = input.nextDouble();

		System.out.println("Informe a largura do retangulo: ");
		ret.l = input.nextDouble();

		ret.Resultados();

	}

}