package pooAtividades.Test;

import java.util.Scanner;

import pooAtividades.Domain.AtividadeTaxPayer.Individual;
import pooAtividades.Domain.AtividadeTaxPayer.TaxPayer;

public class TaxPayerTest01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Individual individual;
		System.out.println("Informe o seu nome: ");
		String name = input.nextLine();
		System.out.println("Informe quanto você recebe por ano: ");
		Double anualIncome = input.nextDouble();
		System.out.println("Informe os gastos com plano de saúde: ");
		Double healthExpenditures = input.nextDouble();
		individual = new Individual(name,anualIncome,healthExpenditures);
		
		System.out.println(individual);
		individual.tax();
		System.out.println(individual);

	}

}
