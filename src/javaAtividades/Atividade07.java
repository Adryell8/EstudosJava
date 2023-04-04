package javaAtividades;

import java.util.Scanner;

public class Atividade07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double valorChocolate = 8.00;
		double valorMorango = 5.00;

		System.out.println("Informe o sabor: ");
		System.out.println(
				"Sabores: Chocolate(C), valor:" + valorChocolate + " e sorvete de Morango(M), valor:" + valorMorango);

		char sabor = sc.next().charAt(0);
		sc.nextLine();
		System.out.println("Informe quantidade de bolas que você deseja: ");
		int quantBola = sc.nextInt();

		String saborString = Character.toString(sabor);

		switch (sabor) {
		case 'c':
			double valorCholateEBolas10 = (valorChocolate * quantBola) * 0.1;
			double valorComDesconto10 = valorChocolate - valorCholateEBolas10;

			double valorCholateEBolas5 = (valorChocolate * quantBola) * 0.05;
			double valorComDesconto5 = valorChocolate - valorCholateEBolas5;

			if (saborString.equalsIgnoreCase("c")) {
				if (quantBola > 3) {
					System.out.println(
							"O seu sorvete tem 10% de desconto. Que começará a valer: " + valorComDesconto10 + "R$");
				} else if (quantBola < 3) {
					System.out.println(
							"O seu sorvete tem 5% de desconto. Que começará a valer: " + valorComDesconto5 + "R$");
				}
			}
			break;
		case 'm':
			System.out.println("Sorvete de morango não tem desconto.");
			break;
		default:
			System.out.println("Sabor inválido.");
			return;
		}

	}

}