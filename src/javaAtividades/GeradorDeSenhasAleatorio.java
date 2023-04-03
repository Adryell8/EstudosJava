package javaAtividades;

import java.util.Scanner;
import java.security.SecureRandom;
import java.util.Random;

public class GeradorDeSenhasAleatorio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("informe o Tamanho da sua senha: ");
		int tamanho = sc.nextInt();

		sc.nextLine();

		System.out.println("Informe quais caracteres você deseja usar para a sua senha: ");
		System.out.println(
				"Exemplos.: abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()_+123456879=/*-+.,°|<>~´`ºª{}[]§¨¬¹²³£¢");
		String caracteres = sc.nextLine();

		String senha = geradorSenha(tamanho, caracteres);
		System.out.println("A senha gerada foi: " + senha);
	}

	private static String geradorSenha(int tamanho, String caracteres) {
		SecureRandom rand = new SecureRandom();

		StringBuilder senha = new StringBuilder();

		for (int i = 0; i < tamanho; i++) {
			int index = rand.nextInt(caracteres.length());
			senha.append(caracteres.charAt(index));
		}

		return senha.toString();
	}
}
