package pooAtividades.Domain;

public class Funcionario extends Pessoa {
	private double salario;
	
	public Funcionario(String nome) {
		super(nome);
	}
	
	public Funcionario(String nome, double salario) {
		super(nome);
		this.salario = salario;
	}
	
	public void imprime() {
		super.imprime();
		System.out.println("Salário: "+this.salario);
	}// "Sobrecarga" do método imprime()
	
	
	public void relatorioPagamento() {
		System.out.println("Eu: "+this.nome+", recebi o salário de: "+this.salario);
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
