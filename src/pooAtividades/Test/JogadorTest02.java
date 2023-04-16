package pooAtividades.Test;

import pooAtividades.Domain.Jogador;
import pooAtividades.Domain.Time;

public class JogadorTest02 {

	public static void main(String[] args) {

		Jogador jogador1 = new Jogador("Ney");
		Time time = new Time("PSG");
		
		jogador1.setTime(time);
		jogador1.imprime();
		
	}

}
