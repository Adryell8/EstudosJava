package javaAtividades;

import java.util.Scanner;

public class TesteMenorMaiorEtc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = 0, num2 = 0, contInt = 0, soma = 0;
		char cont = 0;

		do {
			System.out.println("Informe o primeiro valor: ");
			num1 = sc.nextInt();

			System.out.println("Informe o seguno valor: ");
			num2 = sc.nextInt();

			System.out.println("Informe qual operação deseja realizar: (+, -, *, /");
			cont = sc.next().charAt(0);

			System.out.println("Deseja realizar outra operção (Se não, digite -999)?");
			contInt = sc.nextInt();

			int maior = 0;
			int menor = num1;

			if (num1 > maior) {
				maior = num1;
			} else if (num2 > maior) {
				maior = num2;
			}

			if (num1 < menor) {
				menor = num1;
			} else if (num2 < menor) {
				menor = num2;
			}

			System.out.println("O maior número é: " + maior + " e o menor: " + menor);

			if (soma % 2 == 0) {
				System.out.println("Número par");
			} else {
				System.out.println("Número impa");
			}

			if (soma > 0) {
				System.out.println("Número positivo");
			} else if (soma == 0) {
				System.out.println("Número igual 0");
			} else {
				System.out.println("Número negativo");
			}

		} while (contInt != -999);

		switch (cont) {
		case '+':
			soma = num1 + num2;
			System.out.println("A soma dos valores: " + num1 + " e, " + num2 + " é:" + soma);
			break;
		case '-':
			soma = num1 - num2;
			System.out.println("A soma dos valores: " + num1 + " e, " + num2 + " é:" + soma);
			break;
		case '*':
			soma = num1 - num2;
			System.out.println("A soma dos valores: " + num1 + " e, " + num2 + " é:" + soma);
			break;
		case '/':
			soma = num1 - num2;
			System.out.println("A soma dos valores: " + num1 + " e, " + num2 + " é:" + soma);
		default:
			System.out.println("Operação não encontrada.");
		}

	}

}
