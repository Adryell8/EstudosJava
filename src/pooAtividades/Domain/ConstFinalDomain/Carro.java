package pooAtividades.Domain.ConstFinalDomain;

public class Carro {
	private String nome;
	public static final double VELOCIDADE_MAXIMA;
	public final Comprador COMPRADDOR = new Comprador(); // não é possível sobrescrever um método final e não é possível usar herança em uma classe final
	
	static {
		VELOCIDADE_MAXIMA = 400;
	}
	
	public final void imprime() {
		System.out.println(nome);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
