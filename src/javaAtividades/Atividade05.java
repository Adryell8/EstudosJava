package javaAtividades;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String animal;

		System.out.println(
				"Pense em um desses animais: macaco; le�o; peixe-morcego; peixe beta; bode; humano, tubar�o; pirarucu; kiwi; pato; pinguimn; cobra-coral;jacar�;tartaruga-de-couro");
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
			System.out.println("O animal que voc� pensou � uma aqu�tico?");
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
						System.out.println("Voc� pensou no peixe-morcego");
					}
				} else {
					System.out.println("Voc� pensou no pirarucu");
				}
			} else {
				System.out.println("O animal que voc� pensou � uma ave?");
				resposta = sc.nextLine().toLowerCase();
				if (resposta.equalsIgnoreCase("s")) {
					System.out.println("O animal que voc� pensou On�voro?");
					resposta = sc.nextLine().toLowerCase();
					if (resposta.equalsIgnoreCase("s")) {
						System.out.println("O animal que voc� pensou tem nome de fruta?");
						resposta = sc.nextLine().toLowerCase();
						if (resposta.equalsIgnoreCase("s")) {
							System.out.println("O animal que voc� pensou � a Kiwi");
						} else {
							System.out.println("O animal que voc� pensou � o pinguim");
						}
					} else {
						System.out.println("O animal que voc� pensou � um pato");
					}
				} else {
					System.out.println("O animal � um r�ptil?");
					resposta = sc.nextLine().toLowerCase();
					if (resposta.equalsIgnoreCase("s")) {
						System.out.println("O animal que voc� pensou vive em zona tropical?");
						resposta = sc.nextLine().toLowerCase();
						if (resposta.equalsIgnoreCase("s")) {
							System.out.println("O animal que voc� pensou � venenoso?");
							resposta = sc.nextLine().toLowerCase();
							if (resposta.equalsIgnoreCase("s")) {
								System.out.println("O animal que voc� pensou � a cobra-coral.");
							} else {
								System.out.println("O animal que voc� pensou � o jacar�.");
							}

						}else {
							System.out.println("O animal que voc� pensou � a tartaruca-de-couro.");
						}
					}else {
						System.out.println("Animal n�o identificado");
						return;
					}
				}
			}
		}
	}
}