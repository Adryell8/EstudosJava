package pooAtividades.Domain;

import java.util.Random;

public class JogoDaForca {
	private final String[] PALAVRAS = { "ABACAXI", "BANANA", "MELANCIA", "LARANJA", "MORANGO" };
	private final int MAX_TENTATIVAS = 10;

	public String selecionaPalavra() {
		Random ran = new Random();
		int indicePalavra = ran.nextInt(PALAVRAS.length);
		return PALAVRAS[indicePalavra];
	}

	public boolean verificaPalavra(String palavra, char[] palavraParcial, char letra) {
		boolean letraEncontrada = false;

		for (int i = 0; i < palavra.length(); i++) {
			if (palavra.charAt(i) == letra) {
				palavraParcial[i] = letra;
				letraEncontrada = true;
			}
		}
		return letraEncontrada;

	}

	public String[] getPalavras() {
		return PALAVRAS;
	}

	public int getMaxTentativas() {
		return MAX_TENTATIVAS;
	}

}
