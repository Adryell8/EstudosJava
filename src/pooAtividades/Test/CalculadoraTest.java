package pooAtividades.Test;

import java.util.Scanner;

import pooAtividades.Domain.Calculadora;

public class CalculadoraTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculadora calc = new Calculadora();

		double num1, num2;
		double resultado;

		System.out.println("Informe a operação que deseja realizar: ");
		System.out.println("Soma(1); Subtração(2); Multiplicação(3); Divisão(4)");
		System.out.println("Apenas digite o valor da sua operação");
		int operacao = sc.nextInt();

		switch (operacao) {
		case 1:
			System.out.println("Informe o primeiro valor para a operação de soma: ");
			num1 = sc.nextDouble();
			System.out.println("Informe o segundo valor: ");
			num2 = sc.nextDouble();

			resultado = calc.soma(num1, num2);

			System.out.println("O resultado da sua soma foi: " + resultado);
			break;
		case 2:
			System.out.println("Informe o primeiro valor para ser subtraído: ");
			num1 = sc.nextDouble();
			System.out.println("Informe o segundo valor: ");
			num2 = sc.nextDouble();

			resultado = calc.subtrai(num1, num2);

			System.out.println("O resultado da subtração foi: " + resultado);
			break;
		case 3:
			System.out.println("Informe o primeiro valor para ser multiplicado: ");
			num1 = sc.nextDouble();
			System.out.println("Informe o segundo valor: ");
			num2 = sc.nextDouble();

			resultado = calc.multiplica(num1, num2);

			System.out.println("O resultado da multiplicação foi: " + resultado);
			break;
		case 4:
			System.out.println("Informe o valor para ser dividido: ");
			num1 = sc.nextDouble();
			System.out.println("Informe o valor que irá dividir: ");
			num2 = sc.nextDouble();
			
			resultado = calc.divide(num1, num2);
			
			System.out.println("O resultado da divisão foi: "+resultado);
			break;
		default:
			System.out.println("Operação não inválida.");
		}
	}

}
