package javaAtividades;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a cota��o atual: ");
		double cotacao = sc.nextDouble();
		System.out.println("Informe a o valor que voc� possui em dolar: ");
		double us = sc.nextDouble();

		double rs = us/cotacao;

		System.out.println("Voc� possui dolares: "+us+" o valor em reais �: "+rs+"R$");


	}

}