package pooAtividades.Domain.AtividadeTaxPayer;

public class Individual extends TaxPayer {
	private Double healthExpenditures;

	@Override
	public double tax() {
		
		double basicTax = 0.0;
		if(getAnualIncome() < 20000) {
			basicTax = getAnualIncome() * 0.15;
		}else {
			basicTax = getAnualIncome() * 0.25;
		}
		
		basicTax = basicTax - (getAnualIncome() * 0.5);
		
		if(basicTax < 0.0) {
			basicTax = 0.0;
		}
		
		return basicTax;
		
	}

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public String toString() {
		return "Individual [healthExpenditures=" + healthExpenditures + " anualIncome= " + anualIncome;
	}
	

}
