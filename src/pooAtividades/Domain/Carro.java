package pooAtividades.Domain;

public class Carro {
	private String marca;
	private double velocidadeMaxima;
	private static double velocidadeLimite = 250;
	
	public Carro(String marca, double velocidadeMaxima) {
		this.marca = marca;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public void imprime() {
		System.out.println("----------------------------");
		System.out.println("Marca: "+this.marca);
		System.out.println("Velocidade máxima: "+this.velocidadeMaxima);
		System.out.println("Velocidade limte: "+this.velocidadeLimite);
	}
	
	public static void setvelocidadeLimite(double velocidadeLimite) {
		Carro.velocidadeLimite = velocidadeLimite;
	}
	
	public static double getvelocidadeLimite() {
		return Carro.velocidadeLimite;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public double getvelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setvelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	/*public double getvelocidadeLimite() {
		return velocidadeLimite;
	}*/
	
	/*public void setvelocidadeLimite(double velocidadeLimite) {
		this.velocidadeLimite = velocidadeLimite;
	}*/
}
