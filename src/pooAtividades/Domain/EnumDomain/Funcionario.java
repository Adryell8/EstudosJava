package pooAtividades.Domain.EnumDomain;

public abstract class Funcionario {
	protected String nome;
	protected double salario;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
		calculaBonus();
	} // Um m�todo s� pode ser abstrato quando a classe tamb�m � abstrata, mas uma classe abstrata pode ter m�todos concretos e abstratos
	
	public abstract void calculaBonus();
	
	
	
}
