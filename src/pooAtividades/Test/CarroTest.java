package pooAtividades.Test;

import pooAtividades.Domain.Carro;
public class CarroTest {

	public static void main(String[] args) {
		Carro c1 = new Carro("BMW",280);
		Carro c2 = new Carro("Mercedes",275);
		
		Carro.setvelocidadeLimite(400);
		
		c1.imprime();
		c2.imprime();
	}

}
