package pooAtividades.Domain.AtividadeTaxPayer;

public class Company extends TaxPayer{
	private int numberOfEmplyees;

	@Override
	public double tax() {
		double basicTax = 0.16;
		if(this.numberOfEmplyees > 10) {
			basicTax = 0.14;
			return getAnualIncome() * basicTax;
		}else {
			return getAnualIncome() * basicTax;
		}
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
