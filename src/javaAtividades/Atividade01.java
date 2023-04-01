package javaAtividades;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a cotação atual: ");
		double cotacao = sc.nextDouble();
		System.out.println("Informe a o valor que você possui em dolar: ");
		double us = sc.nextDouble();

		double rs = us/cotacao;

		System.out.println("Você possui dolares: "+us+" o valor em reais é: "+rs+"R$");


	}

}