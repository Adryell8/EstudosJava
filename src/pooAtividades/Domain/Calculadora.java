package pooAtividades.Domain;

import java.util.List;

public class Calculadora {

	public Calculadora() {

	}

	public double soma(List<Double> numeros) {
		double resultado = 0;
		for (double num : numeros) {
			resultado += num;
		}
		return resultado;
	}

	public double subtrai(List<Double> numeros) {
		double resultado = numeros.get(0);
		for (int i = 1; i < numeros.size(); i++) {
			resultado -= numeros.get(i);
		}
		return resultado;
	}

	public double multiplica(List<Double> numeros) {
		double resultado = 1;
		for (double num : numeros) {
			resultado *= num;
		}
		return resultado;

	}

	public double divide(List<Double> numeros) {
		double resultado = numeros.get(0);
		for (int i = 1; i < numeros.size(); i++) {
			resultado /= numeros.get(i);
		}
		return resultado;
	}

}