package pooAtividades.Test;

import java.util.Scanner;

import pooAtividades.Domain.FuncionarioAtividade02;

public class FuncionarioTest02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		FuncionarioAtividade02 func = new FuncionarioAtividade02();

		System.out.println("Informe seu nome: ");
		func.nome = input.nextLine();

		System.out.println("Informe o seu salario atual: ");
		func.Salario = input.nextDouble();

		System.out.println("Informe o imposto: ");
		func.tax = input.nextDouble();

		System.out.println("O seu salario final com desconto é: " + func.netSalary());

		System.out.println("Informe a porcentagem de incremento de salario: ");
		double porcentagem = input.nextDouble();

		func.IncrementoSalario(porcentagem);
		func.Relatorio();

	}

}