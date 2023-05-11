package pooAtividades.Test.BancoAtividadeTest;

import java.util.Scanner;

import javax.swing.JOptionPane;

import pooAtividades.Domain.BancoAtividadeDomain.ContaBancaria;

public class BibliotecaTest01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ContaBancaria contabancaria = new ContaBancaria();;
		
		int numeroContaBancaria = Integer.parseInt((JOptionPane.showInputDialog("Informe o número da conta")));
		
		String nomeTitular = JOptionPane.showInputDialog("Informe o nome do titular");
		
		String respostaDepInicial = JOptionPane.showInputDialog("Deseja realizar um depósito inicial?");
		Character respostSOuN = respostaDepInicial.charAt(0);
		
		if(Character.toString(respostSOuN).equalsIgnoreCase("s")) {
			double depInicial = Double.parseDouble((JOptionPane.showInputDialog("Infome o valor do depósito inicial")));
			contabancaria = new ContaBancaria(numeroContaBancaria, nomeTitular, depInicial);
		}else {
			contabancaria = new ContaBancaria(numeroContaBancaria, nomeTitular);
		}
		
		double valorDep = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do depósito"));
		contabancaria.deposito(valorDep);
		JOptionPane.showMessageDialog(null, "Conta atualizada\n"+contabancaria);
		
		double valorSaq = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do saque"));
		contabancaria.saque(valorSaq);
		JOptionPane.showMessageDialog(null, "Conta Atualizada\n"+contabancaria);
		
		
	}
}
