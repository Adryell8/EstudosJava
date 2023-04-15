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
			System.out.println("Informe um valor para a operação: ");
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
		System.out.println("Informe a operação que deseja realizar: ");
		System.out.println("Soma(1); Subtração(2); Multiplicação(3); Divisão(4)");
		System.out.println("Apenas digite o valor da sua operação");
		int operacao = sc.nextInt();

		switch (operacao) {
		case 1:
			resultado = calc.soma(numeros);
			System.out.println("O resultado da sua soma foi: " + resultado);
			break;
		case 2:

			resultado = calc.subtrai(numeros);

			System.out.println("O resultado da subtração foi: " + resultado);
			break;

		case 3:

			resultado = calc.multiplica(numeros);

			System.out.println("O resultado da multiplicação foi: " + resultado);
			break;
		case 4:

			resultado = calc.divide(numeros);

			System.out.println("O resultado da divisão foi: " + resultado);
			break;
		default:
			System.out.println("Operação não inválida.");

		}
	}
}