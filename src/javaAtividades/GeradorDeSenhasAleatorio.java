package javaAtividades;

import java.util.Scanner;
import java.security.SecureRandom;

public class GeradorDeSenhasAleatorio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String caracteres = "";

		System.out.println("informe o Tamanho da sua senha: ");
		int tamanho = sc.nextInt();

		sc.nextLine();

		System.out.println("Informe quais caracteres voc� deseja usar para a sua senha: ");
		System.out.println(
				"Exemplos.: Escolha um dos exemplos a seguir ou escolha os seus pr�prios caracteres (apenas informa o valor do exemplo): ");
		System.out.println("Ex.: (1): abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ ");
		System.out.println("Ex.: (2): abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890 ");
		System.out.println("Ex.: (3): 1234567890!@#$%^&*()_+123456879=/*-+.,�|<>~�`��{}[]�������� ");
		System.out.println("Ex.: (4): abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()_+123456879=/*-+.,�|<>~�`��{}[]�������� ");
		System.out.println("Ex.: (5): Selecione o n�mero 5 para fazer o seu pr�prio modelo. ");
		System.out.println("Voc� pode fazer o seu modelo de senha pr�pio.");
		char exemplos = sc.next().charAt(0);
		
		sc.nextLine();

		switch (exemplos) {
		case '1':
			caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			break;
		case '2':
			caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
			break;
		case '3':
			caracteres = "1234567890!@#$%^&*()_+123456879=/*-+.,�|<>~�`��{}[]��������";
			break;
		case '4':
			caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()_+123456879=/*-+.,�|<>~�`��{}[]��������";
			break;
		case '5':
			System.out.println("Informe o seu modelo de senha: ");
			caracteres = sc.nextLine();
			break;
		default:
			System.out.println("Valor n�o identificado, tentar novamente.");
			return;
		}
		
		

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
