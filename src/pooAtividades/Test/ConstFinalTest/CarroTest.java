package pooAtividades.Test.ConstFinalTest;

import pooAtividades.Domain.ConstFinalDomain.Carro;
import pooAtividades.Domain.ConstFinalDomain.Ferrari;

public class CarroTest {

	public static void main(String[] args) {
		Carro carro = new Carro();
		
		System.out.println(Carro.VELOCIDADE_MAXIMA);
		System.out.println(carro.COMPRADDOR);
		carro.COMPRADDOR.setNome("Lucas");
		System.out.println(carro.COMPRADDOR);
		
		
		Ferrari ferrari = new Ferrari();
		ferrari.setNome("Enzo");
		ferrari.imprime();
		//Foguete.VELOCIDADE_MAXIMA = 50.000;
	}

}
