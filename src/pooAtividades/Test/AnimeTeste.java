package pooAtividades.Test;

import pooAtividades.Domain.Anime;


public class AnimeTeste {

	public static void main(String[] args) {
		Anime anime = new Anime();
		for(int ep: anime.getEps()) {
			System.out.println(ep + " ");
		}
	}

}
