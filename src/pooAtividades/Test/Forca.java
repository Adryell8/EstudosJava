package pooAtividades.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import pooAtividades.Domain.JogoDaForcaDomain.JogoDaForca;
import pooAtividades.Domain.JogoDaForcaDomain.Palavra;

public class Forca {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		JogoDaForca forca = new JogoDaForca();
		
		List<Palavra> palavras = new ArrayList<>();
		
		System.out.println("Informa qual tipo de forca você deseja:\n1: Frutas\n2: Carro\n3: Qualquer tipo");
		int opc = input.nextInt();
		input.nextLine();
		
		switch (opc) {
		case 1:
			palavras = JogoDaForca.carregaPalavraFrutas();
			break;
		case 2:
			palavras = JogoDaForca.carregaPalavraCarro();
			break;
		case 3:
			palavras = JogoDaForca.carregaPalavra();
			break;
		default:
			System.out.println("Opção inválida.");
			break;
		}
		
		forca.setPalavras(palavras);
		
		
		Palavra palavra = forca.getPalavras().get(new Random().nextInt(forca.getPalavras().size()));
		String palavraSelecionada = palavra.getPalavra();
		char[] palavraParcial = new char[palavraSelecionada.length()];
		
		int tentativa = 0;
		
		for (int i = 0; i < palavraParcial.length; i++) {
			palavraParcial[i] = '-'; 
		}
		
		while(tentativa < forca.getMaxTentativas()) {
			System.out.println("\nA palavra: "+String.valueOf(palavraParcial));
			System.out.println("Digite uma letra:");
			String entradaLetra = input.nextLine().toLowerCase();
            char letra = entradaLetra.toLowerCase().charAt(0);
			
			if(forca.verificaPalavra(palavra, palavraParcial, letra)) {
				if(String.valueOf(palavraParcial).equals(palavraSelecionada)) {
					System.out.println("Você acertou! A palavra era: "+palavra.getPalavra()+"!");
					break;
				}
			}else {
				tentativa++;
				System.out.println("A letra incorreta. Você possui: "+ (forca.getMaxTentativas() - tentativa)+" de tentivas");
			}
			
			if(tentativa == forca.getMaxTentativas()) {
				System.out.println("Você atingou o número máximo de tentativas, tente novamente.\nA palavra correta era: "+palavra.getPalavra());
			}
		}
		
	}

}
