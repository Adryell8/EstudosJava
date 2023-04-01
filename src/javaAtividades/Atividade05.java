package javaAtividades;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String animal;

		System.out.println(
				"Pense em um desses animais: macaco; leão; peixe-morcego; peixe beta; bode; humano, tubarão; pirarucu; kiwi; pato; pinguimn; cobra-coral;jacaré;tartaruga-de-couro");
		System.out.println("Você pensou em um mamífero? (Responda apenas com s e n para sim e não.(s/n)");

		String resposta = sc.nextLine().toLowerCase();

		if (resposta.equalsIgnoreCase("s")) {
			System.out.println("Você pensou em é um bípede?");
			resposta = sc.nextLine().toLowerCase();
			if (resposta.equalsIgnoreCase("s")) {
				System.out.println("Você pensou é onívoro?");
				resposta = sc.nextLine().toLowerCase();
				if (resposta.equalsIgnoreCase("s")) {
					System.out.println("O animal que você pensou é um humano");
				} else {
					System.out.println("O animal que você pensou foi uma macaco.");
				}
			} else {
				System.out.println("O animal que você pensou é quadrúpede?");
				resposta = sc.nextLine().toLowerCase();
				if (resposta.equalsIgnoreCase("s")) {
					System.out.println("Você pensou tem ele é carnívoro?");
					resposta = sc.nextLine().toLowerCase();
					if (resposta.equalsIgnoreCase("s")) {
						System.out.println("O animal que você pensou no leão");
					} else {
						System.out.println("O animal que você pensou bode");
					}
				}
			}
		} else {
			System.out.println("O animal que você pensou é uma aquático?");
			resposta = sc.nextLine().toLowerCase();
			if (resposta.equalsIgnoreCase("s")) {
				System.out.println("O animal que você pensou é um animal de água salgada?");
				resposta = sc.nextLine().toLowerCase();
				if (resposta.equalsIgnoreCase("s")) {
					System.out.println("O animal que você pensou é um animal carnívoro?");
					resposta = sc.nextLine().toLowerCase();
					if (resposta.equalsIgnoreCase("s")) {
						System.out.println("Você pensou no tubarão");
					} else {
						System.out.println("Você pensou no peixe-morcego");
					}
				} else {
					System.out.println("Você pensou no pirarucu");
				}
			} else {
				System.out.println("O animal que você pensou é uma ave?");
				resposta = sc.nextLine().toLowerCase();
				if (resposta.equalsIgnoreCase("s")) {
					System.out.println("O animal que você pensou Onívoro?");
					resposta = sc.nextLine().toLowerCase();
					if (resposta.equalsIgnoreCase("s")) {
						System.out.println("O animal que você pensou tem nome de fruta?");
						resposta = sc.nextLine().toLowerCase();
						if (resposta.equalsIgnoreCase("s")) {
							System.out.println("O animal que você pensou é a Kiwi");
						} else {
							System.out.println("O animal que você pensou é o pinguim");
						}
					} else {
						System.out.println("O animal que você pensou é um pato");
					}
				} else {
					System.out.println("O animal é um réptil?");
					resposta = sc.nextLine().toLowerCase();
					if (resposta.equalsIgnoreCase("s")) {
						System.out.println("O animal que você pensou vive em zona tropical?");
						resposta = sc.nextLine().toLowerCase();
						if (resposta.equalsIgnoreCase("s")) {
							System.out.println("O animal que você pensou é venenoso?");
							resposta = sc.nextLine().toLowerCase();
							if (resposta.equalsIgnoreCase("s")) {
								System.out.println("O animal que você pensou é a cobra-coral.");
							} else {
								System.out.println("O animal que você pensou é o jacaré.");
							}

						}else {
							System.out.println("O animal que você pensou é a tartaruca-de-couro.");
						}
					}else {
						System.out.println("Animal não identificado");
						return;
					}
				}
			}
		}
	}
}