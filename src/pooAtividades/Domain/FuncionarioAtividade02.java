package pooAtividades.Domain;

public class FuncionarioAtividade02 {
	public double Salario;
	public double tax;
	public String nome;

	public double netSalary() {
		return this.Salario - this.tax;
	}

	public void IncrementoSalario(double porcentagem) {
		Salario += this.Salario * porcentagem / 100;
	}

	public void Relatorio() {
		System.out.println("Nome: " + this.nome);
		System.out.println("O salario atual é: " + this.Salario + "R$");
		System.out.println("O imposto foi de: " + this.tax);
	}
}