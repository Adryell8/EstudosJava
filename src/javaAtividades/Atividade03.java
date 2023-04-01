package javaAtividades;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o valor do custo:");
		double custo = sc.nextDouble();
		System.out.println("Informe o percentual de venda: ");
		double percentualDeVenda = sc.nextDouble();

		double ganho = (percentualDeVenda/100) * custo;

		System.out.println("O valor ganho com o percentual informado: " + percentualDeVenda+ "%"+ ", para o custo: "+custo+"R$"+", o ganho será igual a: "+ganho+"R$");

	}

}
