package pooAtividades.Test;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

import pooAtividades.Domain.Calculadora;

public class CalculadoraTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculadora calc = new Calculadora();

		double resultado;
		boolean continua = true;

		List<Double> numeros = new ArrayList<Double>();

		while (continua) {
			System.out.println("Informe um valor para a opera��o: ");
			double valor = sc.nextDouble();
			numeros.add(valor);

			sc.nextLine();

			if (numeros.size() >= 2) {
				System.out.println("Deseja adicionar outro valor? Responda com S ou N");
				String respCon = sc.nextLine().toLowerCase();

				if (respCon.equalsIgnoreCase("n")) {
					continua = false;
				}
			}
		}
		System.out.println("Informe a opera��o que deseja realizar: ");
		System.out.println("Soma(1); Subtra��o(2); Multiplica��o(3); Divis�o(4)");
		System.out.println("Apenas digite o valor da sua opera��o");
		int operacao = sc.nextInt();

		switch (operacao) {
		case 1:
			resultado = calc.soma(numeros);
			System.out.println("O resultado da sua soma foi: " + resultado);
			break;
		case 2:

			resultado = calc.subtrai(numeros);

			System.out.println("O resultado da subtra��o foi: " + resultado);
			break;

		case 3:

			resultado = calc.multiplica(numeros);

			System.out.println("O resultado da multiplica��o foi: " + resultado);
			break;
		case 4:

			resultado = calc.divide(numeros);

			System.out.println("O resultado da divis�o foi: " + resultado);
			break;
		default:
			System.out.println("Opera��o n�o inv�lida.");

		}
	}
}