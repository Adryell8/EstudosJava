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
				.println("Infome a operação que deseja realizar: soma(+); subtração(-); multiplicaçã(*); divisão(/). ");
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
			System.out.println("Operador inválido");
			return;
		}

		System.out.println(num1 + " " + operador + " " + num2 + " " + "resulta no valor: " + resultado);

	}

}