package javaAtividades;

import java.util.Random;
import java.util.Scanner;

public class AtividadeLancadorDeDado {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int quantRolagem = 0;
		boolean continuar = true;

		while (continuar) {
			System.out.println("Deseja rolar qual dado (informe o número de lados do dado)? (Sem o número: D6 = 6...)");
			int Dado = sc.nextInt();
			String DadoString = String.valueOf(Dado);

			if (DadoString.equalsIgnoreCase("6")) {
				System.out.println("Informe quantos dados deseja que sejam rolados: ");
				quantRolagem = sc.nextInt();

				for (int i = 0; i < quantRolagem; i++) {
					int D6 = ran.nextInt(6) + 1;
					System.out.println("O resultado da rolagem do dado " + (i + 1) + "°" + " é: " + D6);
				}
			} else if (DadoString.equalsIgnoreCase("8")) {
				System.out.println("Informe quantos dados deseja que sejam rolados: ");
				quantRolagem = sc.nextInt();
				for (int i = 0; i < quantRolagem; i++) {
					int D8 = ran.nextInt(8) + 1;
					System.out.println("O resultado da rolagem do dado " + (i + 1) + "°" + " é: " + D8);
				}
			} else if (DadoString.equalsIgnoreCase("10")) {
				System.out.println("Informe quantos dados deseja que sejam rolados: ");
				quantRolagem = sc.nextInt();
				for (int i = 0; i < quantRolagem; i++) {
					int D10 = ran.nextInt(10) + 1;
					System.out.println("O resultado da rolagem do dado " + (i + 1) + "°" + " é: " + D10);
				}
			} else if (DadoString.equalsIgnoreCase("12")) {
				System.out.println("Informe quantos dados deseja que sejam rolados: ");
				quantRolagem = sc.nextInt();
				for (int i = 0; i < quantRolagem; i++) {
					int D12 = ran.nextInt(12) + 1;
					System.out.println("O resultado da rolagem do dado " + (i + 1) + "°" + " é: " + D12);
				}
			} else if (DadoString.equalsIgnoreCase("20")) {
				System.out.println("Informe quantos dados deseja que sejam rolados: ");
				quantRolagem = sc.nextInt();
				for (int i = 0; i < quantRolagem; i++) {
					int D20 = ran.nextInt(12) + 1;
					System.out.println("O resultado da rolagem do dado " + (i + 1) + "°" + " é: " + D20);
				}
			}

			System.out.println("Deseja continuar?");
			String resposta = sc.next();

			if (resposta.equalsIgnoreCase("n")) {
				continuar = false;
			}
		}
	}
}
