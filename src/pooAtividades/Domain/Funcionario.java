package pooAtividades.Domain;

public class Funcionario extends Pessoa {
	private double salario;
	
	public void imprime() {
		super.imprime();
		System.out.println("Sal�rio: "+this.salario);
	}// "Sobrecarga" do m�todo imprime()
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
