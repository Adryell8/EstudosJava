package pooAtividades.Test.AtividadeTaxPayerTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pooAtividades.Domain.AtividadeTaxPayer.Company;
import pooAtividades.Domain.AtividadeTaxPayer.Individual;
import pooAtividades.Domain.AtividadeTaxPayer.TaxPayer;

public class TestTaxPayer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Individual individual = new Individual();
		
		List<TaxPayer> listTaxPayer = new ArrayList<>();

		System.out.println("Enter the number of tax payer: ");
		int ansTaxPayers = input.nextInt();

		for (int i = 0; i < ansTaxPayers; i++) {
			System.out.println("Tax payer #" + (i + 1) + " data:");

			input.nextLine();

			System.out.println("Individual or company (i/c)");
			String isInvidualOrCompany = input.nextLine().toLowerCase();

			switch (isInvidualOrCompany) {
			case "i":
				System.out.println("Name:");
				String name = input.nextLine();

				System.out.println("Anual income: ");
				double anualIncome = input.nextDouble();
				
				System.out.println("Health expendidures: ");
				double healthExpendidures = input.nextDouble();

				individual = new Individual(name, anualIncome, healthExpendidures);
				
				listTaxPayer.add(individual);
				
				break;
			case "c":
				System.out.println("Name:");
				name = input.nextLine();

				System.out.println("Anual income: ");
				anualIncome = input.nextDouble();
				
				System.out.println("Number of employees: ");
				int numberOfEmployees = input.nextInt();

				listTaxPayer.add(new Company(name, anualIncome, numberOfEmployees));
				
				break;
			default:
				System.out.println("Invalid type");
				i--;
				break;
			}
		}
		double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID: ");
		for(TaxPayer tp : listTaxPayer) {
			double tax = tp.tax();
			System.out.println(tp.getName()+": $ "+String.format("%.2f", tax));
			sum += tax;
		}
		System.out.println();
		System.out.println("TOTAL TAXES: $"+ String.format("%.2f", sum));
	}
}
