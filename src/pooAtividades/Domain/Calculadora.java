package pooAtividades.Domain;

public class Calculadora {
	
	public Calculadora() {
		
	}// Um construtor é criado automaticamente pelo Java, caso não seja definido um ele irá criar um na compilação o construtor é inicializado primeiro que os metodos
	
	public double soma(double num1, double num2) {
		return num1 + num2;
	}

	public double subtrai(double num1, double num2) {
		return num1 - num2;
	}

	public double multiplica(double num1, double num2) {
		return num1 * num2;
	}

	public double divide(double num1, double num2) {
		return num1 / num2;
	}

}
