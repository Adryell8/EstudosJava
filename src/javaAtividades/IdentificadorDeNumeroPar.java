package javaAtividades;

public class IdentificadorDeNumeroPar {

	public static void main(String[] args) {
		int valor = 1, contadorPar = 0, somaPar = 0;

		while (valor <= 5) {
			if (valor % 2 == 0) {
				contadorPar = contadorPar + 1;
				somaPar = somaPar + valor;
			}
			valor++;
		}
		System.out.println("qtde de pares é: " + contadorPar);
		System.out.println("Soma de pares: " + somaPar);

	}

}
