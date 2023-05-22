package pooAtividades.Domain.EnumDomain;

public abstract class Funcionario extends Pessoa{
	protected String nome;
	protected double salario;
	
	@Override
	public void imprime() {
		
	}

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
		calculaBonus();
	} // Um método só pode ser abstrato quando a classe também é abstrata, mas uma classe abstrata pode ter métodos concretos e abstratos
	
	public abstract void calculaBonus(); // métodos abstratos não tem corpo e sempre é preciso prover uma "subclasse" para ele
	
}
