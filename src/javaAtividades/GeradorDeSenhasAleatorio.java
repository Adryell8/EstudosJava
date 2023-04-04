package javaAtividades;

import java.util.Scanner;
import java.security.SecureRandom;

public class GeradorDeSenhasAleatorio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String caracteres = "";
		String senha = "";

		System.out.println("informe o Tamanho da sua senha: ");
		int tamanho = sc.nextInt();

		sc.nextLine();

		System.out.println("Informe quais caracteres você deseja usar para a sua senha: ");
		System.out.println("Exemplos.: Escolha um dos exemplos a seguir ou escolha os seus próprios caracteres (apenas informa o valor do exemplo): ");
			System.out.println("Ex.: (1): abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()_+123456879=/*-+.,°|<>~´`ºª{}[]§¨¬¹²³£¢ ");
		System.out.println("Ex.: (2): Selecione o número 5 para fazer o seu próprio modelo. ");
		System.out.println("Você também pode fazer o seu modelo de senha própio.");
		char exemplos = sc.next().charAt(0);

		sc.nextLine();

		switch (exemplos) {
		case '1':
			caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()_+123456879=/*-+.,°|<>~´`ºª{}[]§¨¬¹²³£¢";
			break;
		case '2':
			System.out.println("Informe o seu modelo de senha: ");
			caracteres = sc.nextLine();
			break;
		default:
			System.out.println("Valor não identificado, tentar novamente.");
			return;
		}

		while (!VerficaSenha(senha)) {

			senha = geradorSenha(tamanho, caracteres);

			if (!VerficaSenha(senha)) {

				System.out.println("A senha não é forte o sufiente.");
				System.out.println("Informe um novo tamanho: ");
				tamanho = sc.nextInt();
				sc.nextLine();
				System.out.println("Informe quais caracteres deseja, dessa vez escreva quais você deseja.");
				caracteres = sc.nextLine();
			} else {
				System.out.println("A senha gerada foi: " + senha);
			}
		}

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

	public static boolean VerficaSenha(String senha) {
		boolean isTemMaiuscula = false;
		boolean isTemMinuscula = false;
		boolean isTemNumero = false;
		boolean isTemEspecial = false;

		if (senha.length() < 8) {
			return false;
		}

		for (char c : senha.toCharArray()) {
			if (Character.isDigit(c)) {
				isTemNumero = true;
			} else if (Character.isLowerCase(c)) {
				isTemMinuscula = true;
			} else if (Character.isUpperCase(c)) {
				isTemMaiuscula = true;
			} else if (!Character.isLetterOrDigit(c)) {
				isTemEspecial = true;
			}

		}

		return isTemMaiuscula && isTemMinuscula && isTemNumero && isTemEspecial;
	}
}