package pooAtividades.Domain.EnumDomain;

public abstract class Funcionario {
	protected String nome;
	protected double salario;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
		calculaBonus();
	} // Um método só pode ser abstrato quando a classe também é abstrata, mas uma classe abstrata pode ter métodos concretos e abstratos
	
	public abstract void calculaBonus();
	
	
	
}
