package pooAtividades.Test;

import java.util.Scanner;

import pooAtividades.Domain.Jogador;
import pooAtividades.Domain.Time;

public class JogadorTest02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o nome do jogador: ");
		Jogador jogador1 = new Jogador(sc.nextLine());
		System.out.println("Informe o time do jogador: ");
		Time time = new Time(sc.nextLine());
		
		jogador1.setTime(time); // Time está sendo "setado" em jogador por meio de jogador1
		jogador1.imprime();
		
	}

}
