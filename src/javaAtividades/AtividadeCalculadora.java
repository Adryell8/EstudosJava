package javaAtividades;

import java.util.Scanner;

public class AtividadeCalculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double num1, num2, resultado = 0;

		char operador;

		System.out.println("Digite o primeiro valor: ");
		num1 = sc.nextDouble();

		System.out.println("Infome o segundo valor: ");
		num2 = sc.nextDouble();

		System.out
				.println("Infome a opera��o que deseja realizar: soma(+); subtra��o(-); multiplica��(*); divis�o(/). ");
		operador = sc.next().charAt(0);

		switch (operador) {
		case '+':
			resultado = num1 + num2;
			break;
		case '-':
			resultado = num1 - num2;
			break;
		case '*':
			resultado = num1 * num2;
			break;
		case '/':
			resultado = num1 / num2;
			break;
		default:
			System.out.println("Operador inv�lido");
			return;
		}

		System.out.println(num1 + " " + operador + " " + num2 + " " + "resulta no valor: " + resultado);

	}

}