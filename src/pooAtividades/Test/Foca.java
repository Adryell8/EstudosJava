package pooAtividades.Test;

import java.util.Scanner;

import pooAtividades.Domain.JogoDaForca;

public class Foca {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		JogoDaForca forca = new JogoDaForca();
		
		String palavra = forca.selecionaPalavra();
		char[] palavraParcial = new char[palavra.length()];
		
		int tentativa = 0;
		
		for (int i = 0; i < palavraParcial.length; i++) {
			palavraParcial[i] = '-'; 
		}
		
		while(tentativa < forca.getMaxTentativas()) {
			System.out.println("\nA palavra: "+String.valueOf(palavraParcial));
			System.out.println("Digite uma letra:");
			char letra = input.nextLine().toUpperCase().charAt(0);
			
			if(forca.verificaPalavra(palavra, palavraParcial, letra)) {
				if(String.valueOf(palavraParcial).equals(palavra)) {
					System.out.println("Você acertou! A palavra era: "+palavra+"!");
					break;
				}
			}else {
				tentativa++;
				System.out.println("A letra incorreta. Você possui: "+ (forca.getMaxTentativas() - tentativa)+" de tentivas");
			}
			
			if(tentativa == forca.getMaxTentativas()) {
				System.out.println("Você atingou o número máximo de tetnaivas, tente novamente.\nA palavra correta era: "+palavra);
			}
		}
		
	}

}
