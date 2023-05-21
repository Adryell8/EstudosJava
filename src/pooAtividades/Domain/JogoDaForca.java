package pooAtividades.Domain;

import java.util.Random;

public class JogoDaForca {
	private static final String[] PALAVRAS = {"ABACAXI", "BANANA", "MELANCIA", "LARANJA", "MORANGO"};
	
	public String selecionaPalavra() {
		Random ran = new Random();
		int indicePalavra = ran.nextInt(PALAVRAS.length);
		return PALAVRAS[indicePalavra];
	}
	
	private boolean verificaPalavra(String palavra, char[] palavraParcial, char letra) {
		boolean letraEncontrada = false;
		
		for (int i = 0; i < palavra.length(); i++) {
			if(palavra.charAt(i) == letra) {
				palavraParcial[i] = letra;
				letraEncontrada = true;
			}
		}
		return letraEncontrada;

	}
	
}
