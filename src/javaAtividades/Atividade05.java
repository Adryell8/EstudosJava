package javaAtividades;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String animal = "";

		System.out.println(
				"Pense em um desses animais: canguru; le�o; peixe-morcego; peixe beta; bode; humano, tubar�o; pirarucu; kiwi; pato; pinguimn; cobra-coral;jacar�;tartaruga-de-couro");
		System.out.println("Voc� pensou em um mam�fero? (Responda apenas com s e n para sim e n�o.(s/n)");

		String resposta = sc.nextLine().toLowerCase();

		if (resposta.equalsIgnoreCase("s")) {
			System.out.println("Voc� pensou em � um b�pede?");
			resposta = sc.nextLine().toLowerCase();
			if (resposta.equalsIgnoreCase("s")) {
				System.out.println("Voc� pensou � on�voro?");
				resposta = sc.nextLine().toLowerCase();
				if (resposta.equalsIgnoreCase("s")) {
					animal = "humano";
				} else {
					animal = "canguru";
				}
			} else {
				System.out.println("O animal que voc� pensou � quadr�pede?");
				resposta = sc.nextLine().toLowerCase();
				if (resposta.equalsIgnoreCase("s")) {
					System.out.println("Voc� pensou tem ele � carn�voro?");
					resposta = sc.nextLine().toLowerCase();
					if (resposta.equalsIgnoreCase("s")) {
						animal = "le�o";
					} else {
						animal = "bode";
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
						animal = "tubar�o";
					} else {
						animal = "peixe-morcego";
					}
				} else {
					animal = "pirarucu";
				}
			} else {
				System.out.println("O animal que voc� pensou � uma ave?");
				resposta = sc.nextLine().toLowerCase();
				if (resposta.equalsIgnoreCase("s")) {
					System.out.println("O animal que voc� pensou n�o � On�voro?");
					resposta = sc.nextLine().toLowerCase();
					if (resposta.equalsIgnoreCase("s")) {
						System.out.println("O animal que voc� pensou tem nome de fruta?");
						resposta = sc.nextLine().toLowerCase();
						if (resposta.equalsIgnoreCase("s")) {
							animal = "kiwi";
						} else {
							animal = "pinguim";
						}
					} else {
						animal = "pato";
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
								animal = "cobra-coral";
							} else {
								animal = "jacar�";
							}

						} else {
							animal = "tartaruca-de-couro.";
						}
					} else {
						System.out.println("Animal n�o identificado");
						return;
					}
				}
			}
		}
		System.out.println("O animal que voc� pensou foi no: " + animal + ".");
	}
}