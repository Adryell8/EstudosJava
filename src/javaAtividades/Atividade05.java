package javaAtividades;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String animal;

		System.out.println("Pense em um desses animais: macaco; le�o; pirarucu; peixe beta; bode; humano, tubar�o.");
		System.out.println("Voc� pensou em um mam�fero? (Responda apenas com s e n para sim e n�o.(s/n)");

		String resposta = sc.nextLine().toLowerCase();

		if (resposta.equalsIgnoreCase("s")) {
			System.out.println("Voc� pensou em � um b�pede?");
			resposta = sc.nextLine().toLowerCase();
			if (resposta.equalsIgnoreCase("s")) {
				System.out.println("Voc� pensou � on�voro?");
				resposta = sc.nextLine().toLowerCase();
				if (resposta.equalsIgnoreCase("s")) {
					System.out.println("O animal que voc� pensou � um humano");
				} else {
					System.out.println("O animal que voc� pensou foi uma macaco.");
				}
			} else {
				System.out.println("O animal que voc� pensou � quadr�pede?");
				resposta = sc.nextLine().toLowerCase();
				if (resposta.equalsIgnoreCase("s")) {
					System.out.println("Voc� pensou tem ele � carn�voro?");
					resposta = sc.nextLine().toLowerCase();
					if (resposta.equalsIgnoreCase("s")) {
						System.out.println("O animal que voc� pensou no le�o");
					} else {
						System.out.println("O animal que voc� pensou bode");
					}
				}
			}
		} else {
			System.out.println("O animal que voc� pensou � uma �guatico?");
			resposta = sc.nextLine().toLowerCase();
			if (resposta.equalsIgnoreCase("s")) {
				System.out.println("O animal que voc� pensou � um animal de �gua salgada?");
				resposta = sc.nextLine().toLowerCase();
				if (resposta.equalsIgnoreCase("s")) {
					System.out.println("O animal que voc� pensou � um animal carn�voro?");
					resposta = sc.nextLine().toLowerCase();
					if (resposta.equalsIgnoreCase("s")) {
						System.out.println("Voc� pensou no tubar�o");
					} else {
						System.out.println("Voc� pensou no pirarucu");
					}
				} else {
					System.out.println("Voc� pensou no peixe-beta");
				}
			}
		}
	}
}