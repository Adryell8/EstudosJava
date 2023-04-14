package pooAtividades.Domain;

public class Anime {

	private String nome;
	// private String studio;
	private int[] eps;
	// private String genero;

	{
		eps = new int[100];
		for (int i = 0; i < eps.length; i++) {
			eps[i] = i + 1;
		}
	}

	public Anime(String nome) {
		this.nome = nome;
	}

	public Anime() {
		for (int ep : this.eps) {
			System.out.println(ep + " ");
		}
	}

	/**
	 * public Anime(String nome, int eps, String genero) { this(); this.nome = nome;
	 * this.eps = eps; this.genero = genero; }
	 * 
	 * public Anime(String nome, int eps, String genero, String studio) { this(nome,
	 * eps, genero); this.studio = studio; }
	 * 
	 * public Anime() {
	 * 
	 * }
	 * 
	 * public void imprime() { System.out.println(this.nome);
	 * System.out.println(this.eps); System.out.println(this.genero);
	 * System.out.println(this.studio); }
	 */

	public String getNome() {
		return nome;
	}

	public int[] getEps() {
		return eps;
	}

}
