package pooAtividades.Domain;

public class Calculadora {
	
	public Calculadora() {
		
	}// Um construtor � criado automaticamente pelo Java, caso n�o seja definido um ele ir� criar um na compila��o o construtor � inicializado primeiro que os metodos
	
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
