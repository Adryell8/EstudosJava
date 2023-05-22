package pooAtividades.Domain.JogoDaForcaDomain;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class JogoDaForca {
	private List<Palavra> palavras = new ArrayList<>();
	private final int MAX_TENTATIVAS = 10;

	public Palavra selecionaPalavra() {
		Random ran = new Random();
		int indicePalavra = ran.nextInt(palavras.size());
		return palavras.get(indicePalavra);
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

	public List<Palavra> getPalavras() {
		return palavras;
	}
	public void setPalavras(List<Palavra> palavras) {
		this.palavras = palavras;
	}

	public int getMaxTentativas() {
		return MAX_TENTATIVAS;
	}

}
