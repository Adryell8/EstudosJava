package javaAtividades;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o valor A: ");
		int a = sc.nextInt();
		System.out.println("Informe o valor B: ");
		int b = sc.nextInt();

		int troca = a;
		a = b;
		b = troca;

		System.out.println("O novo valor de A é: "+a+", o novo valor de B é: "+b );
	}

}
