package javaAtividades;

import java.util.Scanner;

public class ConversorDeMedidasSimples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String tipoConversao;
		int tipoConversaoMassa;
		double valorConvertido;
		double valorParaConverter;
		int tipoConversaoComprimento;
		int tipoConversaoTemp;

		System.out.println("Qual tipo de convers�o voc� deseja?");
		System.out.println(
				"Comprimento (C); Peso(P); Temperatura(T). Digite apenas a letra do tipo de convers�o que voc� deseja.");
		tipoConversao = sc.nextLine();

		if (tipoConversao.equalsIgnoreCase("p")) {
			System.out.println("O tipo de convers�o que voc� deseja fazer?");
			System.out.println("Kg -> g (Digite 1) ou g -> Kg (Digite 2)");
			tipoConversaoMassa = sc.nextInt();
			sc.nextLine();
			System.out.println("Digite o valor a ser convetido: ");
			valorParaConverter = sc.nextDouble();
			if (tipoConversaoMassa == 1) {
				valorConvertido = valorParaConverter * 1000;
				System.out.println("O valor: " + valorParaConverter + "Kg" + ", convertido para grama � igual a: "
						+ valorConvertido + "g");
			} else if (tipoConversaoMassa == 2) {
				valorConvertido = valorParaConverter / 1000;
				System.out.println("O valor: " + valorParaConverter + "g" + ", convertido para Kg � igual a: "
						+ valorConvertido + "Kg");
			}
		} else if (tipoConversao.equalsIgnoreCase("c")) {
			System.out.println("O tipo de convers�o que voc� deseka fazer?");
			System.out.println("Km -> m (Digite 1); m -> Km (Digite 2)");
			tipoConversaoComprimento = sc.nextInt();
			System.out.println("Digite o valor a ser convetido: ");
			valorParaConverter = sc.nextDouble();
			if (tipoConversaoComprimento == 1) {
				valorConvertido = valorParaConverter * 1000;
				System.out.println("O valor: " + valorParaConverter + "Km" + ", convertido para metro � igual a: "
						+ valorConvertido + "m");
			} else if (tipoConversaoComprimento == 2) {
				valorConvertido = valorParaConverter / 1000;
				System.out.println("O valor: " + valorParaConverter + "m" + ", convertido para Km � igual a: "
						+ valorConvertido + "Km");
			}
		} else if (tipoConversao.equalsIgnoreCase("t")) {
			System.out.println("O tipo de convers�o que voc� deseja fazer?");
			System.out.println("C -> F (Digite 1) ou F -> C (Digite 2)");
			tipoConversaoTemp = sc.nextInt();
			sc.nextLine();
			System.out.println("Digite o valor a ser convetido: ");
			valorParaConverter = sc.nextDouble();
			if (tipoConversaoTemp == 1) {
				valorConvertido = valorParaConverter * 1.8 + 32;
				System.out.println("O valor: " + valorParaConverter + "C" + ", convertido para Fahrenheit � igual a: "
						+ valorConvertido + "F");
			} else if (tipoConversaoTemp == 2) {
				valorConvertido = (valorParaConverter - 32) / 1.8;
				System.out.println("O valor: " + valorParaConverter + "F" + ", convertido para Celsius � igual a: "
						+ valorConvertido + "C");
			}
		}

	}

}
