package pooAtividades.Domain.JogoDaForcaDomain;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class JogoDaForca {
	private List<Palavra> palavras = new ArrayList<>();
	private final int MAX_TENTATIVAS = 10;

	public static List<Palavra> carregaPalavraFrutas(){
		List<Palavra> palavras = new ArrayList<>();
		
		palavras.add(new TipoFruta("Banana"));
		palavras.add(new TipoFruta("Kiwi"));
		palavras.add(new TipoFruta("Laranja"));
		
		return palavras;
	}
	
	public static List<Palavra> carregaPalavraCarro(){
		List<Palavra> palavras = new ArrayList<>();
		
		palavras.add(new TipoCarro("Ferrari"));
		palavras.add(new TipoCarro("BMW"));
		palavras.add(new TipoCarro("Ford"));
		
		return palavras;
	}
	
	public static List<Palavra> carregaPalavra(){
		List<Palavra> palavras = new ArrayList<>();
		
		palavras.add(new TipoCarro("Ferrari"));
		palavras.add(new TipoCarro("BMW"));
		palavras.add(new TipoCarro("Ford"));
		
		palavras.add(new TipoFruta("Banana"));
		palavras.add(new TipoFruta("Kiwi"));
		palavras.add(new TipoFruta("Laranja"));
		
		palavras.add(new Palavra("Casa"));
        palavras.add(new Palavra("Computador"));
        palavras.add(new Palavra("Telefone"));
		
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
