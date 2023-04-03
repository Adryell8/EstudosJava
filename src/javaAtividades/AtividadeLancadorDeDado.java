package javaAtividades;

import java.util.Random;
import java.util.Scanner;

public class AtividadeLancadorDeDado {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		boolean continuar = true;

		while (continuar) {
			System.out.println("Deseja rolar qual dado (informe o número de lados do dado)? (Sem o número: D6 = 6...)");
			int Dado = sc.nextInt();
			if (Dado == 6) {
				int D6 = ran.nextInt(6) + 1;
				System.out.println("O resultado da rolagem do dado D6 é: " + D6);
			} else if (Dado == 8) {
				int D8 = ran.nextInt(8) + 1;
				System.out.println("O resultado da rolagem do dado D8 é: " + D8);
			} else if (Dado == 10) {
				int D10 = ran.nextInt(10) + 1;
				System.out.println("O resultado da rolagem do dado D10 é: " + D10);
			} else if (Dado == 12) {
				int D12 = ran.nextInt(12) + 1;
				System.out.println("O resultado da rolagem do dado D12 é: " + D12);
			} else if (Dado == 20) {
				int D20 = ran.nextInt(20) + 1;
				System.out.println("O resultado da rolagem do dado D20 é: " + D20);
			}

			System.out.println("Deseja continuar?");
			String resposta = sc.next();

			if (resposta.equalsIgnoreCase("n")) {
				continuar = false;
			}
		}
	}
}