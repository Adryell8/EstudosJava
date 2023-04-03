package javaAtividades;

import java.util.Scanner;
import java.util.Random;

public class GeradorDeSenhasAleatorio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamanho = 0;

		System.out.println("informe o Tamanho da sua senha: ");
		tamanho = sc.nextInt();
		String senha = geradorSenha(tamanho);
		System.out.println("A senha gerada foi: " + senha);
	}

	private static String geradorSenha(int tamanho) {

		String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()_+123456879";

		Random rand = new Random();

		StringBuilder senha = new StringBuilder();

		for (int i = 0; i < tamanho; i++) {
			int index = rand.nextInt(caracteres.length());
			senha.append(caracteres.charAt(index));
		}

		return senha.toString();
	}

}
