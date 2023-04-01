package javaAtividades;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o valor depositado na sua conta poupança: ");
		double valorPoupanca = sc.nextDouble();

		double jurosPoupanca = 0.007;

		double valorReal = (valorPoupanca * jurosPoupanca) + valorPoupanca;

		System.out.println("O valor atual na sua conta é: " + valorReal+". O valor deposito foi: "+valorPoupanca+". O juros atual é: " + (jurosPoupanca*100));
	}

}
