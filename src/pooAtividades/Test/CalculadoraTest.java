package pooAtividades.Test;

import java.util.Scanner;

import pooAtividades.Domain.Calculadora;

public class CalculadoraTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculadora calc = new Calculadora();

		double num1, num2;
		double resultado;

		System.out.println("Informe a opera��o que deseja realizar: ");
		System.out.println("Soma(1); Subtra��o(2); Multiplica��o(3); Divis�o(4)");
		System.out.println("Apenas digite o valor da sua opera��o");
		int operacao = sc.nextInt();

		switch (operacao) {
		case 1:
			System.out.println("Informe o primeiro valor para a opera��o de soma: ");
			num1 = sc.nextDouble();
			System.out.println("Informe o segundo valor: ");
			num2 = sc.nextDouble();

			resultado = calc.soma(num1, num2);

			System.out.println("O resultado da sua soma foi: " + resultado);
			break;
		case 2:
			System.out.println("Informe o primeiro valor para ser subtra�do: ");
			num1 = sc.nextDouble();
			System.out.println("Informe o segundo valor: ");
			num2 = sc.nextDouble();

			resultado = calc.subtrai(num1, num2);

			System.out.println("O resultado da subtra��o foi: " + resultado);
			break;
		case 3:
			System.out.println("Informe o primeiro valor para ser multiplicado: ");
			num1 = sc.nextDouble();
			System.out.println("Informe o segundo valor: ");
			num2 = sc.nextDouble();

			resultado = calc.multiplica(num1, num2);

			System.out.println("O resultado da multiplica��o foi: " + resultado);
			break;
		case 4:
			System.out.println("Informe o valor para ser dividido: ");
			num1 = sc.nextDouble();
			System.out.println("Informe o valor que ir� dividir: ");
			num2 = sc.nextDouble();
			
			resultado = calc.divide(num1, num2);
			
			System.out.println("O resultado da divis�o foi: "+resultado);
			break;
		default:
			System.out.println("Opera��o n�o inv�lida.");
		}
	}

}
