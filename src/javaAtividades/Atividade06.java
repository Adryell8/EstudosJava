package javaAtividades;

import java.util.Random;
import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
    	Random rd = new Random();
    	int numeroSecreto = rd.nextInt(100) + 1;
    	int tentativa = 0;
    	int numeroTentativas = 0;
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Bem-vindo ao jogo de adivinhação");
    	System.out.println("Informe o número para adivinhar entre 1-100: ");
    	while(tentativa != numeroSecreto) {
    		System.out.println("Infome outro valor:");
    		tentativa = sc.nextInt();
    		numeroTentativas ++;
    		if(tentativa == numeroSecreto) {
    			System.out.println("Parabéns, você acertou o número: "+numeroSecreto+". Você tentou um total de: "+numeroTentativas);
    			break;
    		}else if (tentativa < numeroSecreto){
    			System.out.println("O valor informado é muito baixo.");
    		}else if(tentativa > numeroSecreto) {
    			System.out.println("O valor informado é muito alto.");
    		}
    	}
    }
}
