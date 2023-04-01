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
    	System.out.println("Bem-vindo ao jogo de adivinha��o");
    	System.out.println("Informe o n�mero para adivinhar entre 1-100: ");
    	while(tentativa != numeroSecreto) {
    		System.out.println("Infome outro valor:");
    		tentativa = sc.nextInt();
    		numeroTentativas ++;
    		if(tentativa == numeroSecreto) {
    			System.out.println("Parab�ns, voc� acertou o n�mero: "+numeroSecreto+". Voc� tentou um total de: "+numeroTentativas);
    			break;
    		}else if (tentativa < numeroSecreto){
    			System.out.println("O valor informado � muito baixo.");
    		}else if(tentativa > numeroSecreto) {
    			System.out.println("O valor informado � muito alto.");
    		}
    	}
    }
}
