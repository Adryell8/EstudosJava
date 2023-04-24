package javaAtividades;

import java.util.Scanner;

public class Atividade11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] A = new int[2];
		int[] B = new int[3];
		int[] C = new int[5];
		for (int i = 0; i < A.length; i++) {
			System.out.println("Informe os valores de A: ");
			A[i] = input.nextInt();
		}
		for (int i = 0; i < B.length; i++) {
			System.out.println("Informe os valores de B: ");
			B[i] = input.nextInt();
		}
		for (int i = 0; i < A.length; i++) {
			C[i] = A[i];
		}
		for (int i = 2; i < C.length; i++) {
			C[i] = B[i - 2];
		}
		for (int i = 0; i < C.length; i++) {
			System.out.println(C[i]);
		}
	}
}
