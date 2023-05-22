package pooAtividades.Domain.EnumDomain;

public class Funcionario {
	protected String nome;
	protected Double salario;
	
	public Funcionario(String nome, Double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + "]";
	}
	
	
}
