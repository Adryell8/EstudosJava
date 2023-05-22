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
	} // Um m�todo s� pode ser abstrato quando a classe tamb�m � abstrata, mas uma classe abstrata pode ter m�todos concretos e abstratos
	
	public abstract void calculaBonus(); // m�todos abstratos n�o tem corpo e sempre � preciso prover uma "subclasse" para ele
	
}
