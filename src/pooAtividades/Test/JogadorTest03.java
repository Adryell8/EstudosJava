package pooAtividades.Test;

import java.util.Scanner;

import pooAtividades.Domain.Jogador;
import pooAtividades.Domain.Time;

public class JogadorTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o jogador: ");
		Jogador jogador = new Jogador(sc.nextLine());
		System.out.println("Informe o time do jogador: ");
		Time time = new Time(sc.nextLine());
		Jogador[] jogadores = {jogador};
		
		jogador.setTime(time);
		time.setJogadores(jogadores);
		
		System.out.println("--- Jogador ---");
		jogador.imprime();
		
		System.out.println("--- Time ---");
		time.imprime();
		
	}
}
