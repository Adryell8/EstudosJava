package pooAtividades.Domain.JogoDaForcaDomain;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class JogoDaForca {
	private List<Palavra> palavras = new ArrayList<>();
	private final int MAX_TENTATIVAS = 10;

	public static List<Palavra> carregaPalavraFrutas(){
		List<Palavra> palavras = new ArrayList<>();
		
		palavras.add(new TipoFruta("banana"));
		palavras.add(new TipoFruta("kiwi"));
		palavras.add(new TipoFruta("laranja"));
		
		return palavras;
	}
	
	public static List<Palavra> carregaPalavraCarro(){
		List<Palavra> palavras = new ArrayList<>();
		
		palavras.add(new TipoCarro("ferrari"));
		palavras.add(new TipoCarro("bmw"));
		palavras.add(new TipoCarro("ford"));
		
		return palavras;
	}
	
	public static List<Palavra> carregaPalavra(){
		List<Palavra> palavras = new ArrayList<>();
		
		carregaPalavraCarro();
		
		carregaPalavraFrutas();
		
		palavras.add(new Palavra("casa"));
        palavras.add(new Palavra("computador"));
        palavras.add(new Palavra("telefone"));
		
		return palavras;
	}
	
	public void adicionarPalavra(Palavra palavra) {
        palavras.add(palavra);
    }
	
	public Palavra selecionaPalavra() {
		
		if (palavras.isEmpty()) {
	        throw new IllegalStateException("Lista de palavras vazia. Adicione palavras antes de selecionar uma.");
	    }
		
		Random ran = new Random();
		int indicePalavra = ran.nextInt(palavras.size());
		return palavras.get(indicePalavra);
	}

	public boolean verificaPalavra(Palavra palavra, char[] palavraParcial, char letra) {
		boolean letraEncontrada = false;
		String palavraCompleta = palavra.getPalavra();

		for (int i = 0; i < palavraCompleta.length(); i++) {
			if (palavraCompleta.charAt(i) == letra) {
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
