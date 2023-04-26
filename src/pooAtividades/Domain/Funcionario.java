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
		System.out.println("Sal�rio: "+this.salario);
	}// "Sobrecarga" do m�todo imprime()
	
	
	public void relatorioPagamento() {
		System.out.println("Eu: "+this.nome+", recebi o sal�rio de: "+this.salario);
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
