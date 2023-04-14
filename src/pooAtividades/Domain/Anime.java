package pooAtividades.Domain;

public class Anime {

	private String nome;
	private String studio;
	private int eps;
	private String genero;
	
	public Anime(String nome, int eps, String genero) {
		this();
		this.nome = nome;
		this.eps = eps;
		this.genero = genero;
	}
	
	public Anime(String nome, int eps, String genero, String studio) {
		this(nome, eps, genero);
		this.studio = studio;
	}
	
	public Anime() {
		
	}
	
	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.eps);
		System.out.println(this.genero);
		System.out.println(this.studio);
	}

}
