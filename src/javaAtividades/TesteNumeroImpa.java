package javaAtividades;

public class TesteNumeroImpa {

	public static void main(String[] args) {
		int x = 1;
		int soma = 0;
		while (x <= 100) {
			if (x % 3 == 0 && x % 2 != 0) {
				soma = soma + x;
				System.out.println("A soma dos impares" + x + " + " + x + ": " + soma);
			}
			x++;
		}
		System.out.println("A soma de todos os números impares entre 1 e 100 é igual a: " + soma);
	}
}
