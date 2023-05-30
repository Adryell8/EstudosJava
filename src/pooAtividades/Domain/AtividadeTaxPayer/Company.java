package pooAtividades.Domain.AtividadeTaxPayer;

public class Company extends TaxPayer{
	private int numberOfEmplyees;

	@Override
	public double tax() {
		return 0;
	}

	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, int numberOfEmplyees) {
		super(name, anualIncome);
		this.numberOfEmplyees = numberOfEmplyees;
	}

	public int getNumberOfEmplyees() {
		return numberOfEmplyees;
	}

	public void setNumberOfEmplyees(int numberOfEmplyees) {
		this.numberOfEmplyees = numberOfEmplyees;
	}

	@Override
	public String toString() {
		return "Company [numberOfEmplyees=" + numberOfEmplyees + "]";
	}
	
	
}
