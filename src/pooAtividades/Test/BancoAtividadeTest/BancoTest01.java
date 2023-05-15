package pooAtividades.Test.BancoAtividadeTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import pooAtividades.Domain.BancoAtividadeDomain.ContaBancaria;
import pooAtividades.Domain.BancoAtividadeDomain.Usuario;

public class BancoTest01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ContaBancaria contabancaria = new ContaBancaria();
		Usuario usuario = new Usuario();

		String dataNascimento = JOptionPane
				.showInputDialog("Informe a sua data de nascimento no seguinte modelo: DD/MM/AAAA");
		String nomeTitular = JOptionPane.showInputDialog("Informe o nome do titular");
		String cpf = JOptionPane.showInputDialog("Informe o seu CPF");
		
		int numeroContaBancaria = 0;
		ArrayList<ContaBancaria> contasBancarias = new ArrayList<>();
		for (int i = 0; i < 2; i++) {
			numeroContaBancaria = Integer
					.parseInt((JOptionPane.showInputDialog("Informe o n�mero da " + (i + 1) + "�" + " conta")));
			contasBancarias.add(new ContaBancaria(numeroContaBancaria));
		}

		usuario = new Usuario(nomeTitular, cpf, dataNascimento, contasBancarias);

		String mensagemContaBancaria = "";

		for (int i = 0; i < contasBancarias.size(); i++) {
			ContaBancaria contabancariaFor = contasBancarias.get(i);
			mensagemContaBancaria += "Conta " + (i + 1) + ": n�mero " + contabancariaFor.getNumeroConta();
		}

		JOptionPane.showMessageDialog(null, mensagemContaBancaria, "Informa��es da conta", JOptionPane.INFORMATION_MESSAGE);

		String respostaDepInicial = JOptionPane
				.showInputDialog("Deseja realizar um dep�sito inicial? Informe com Sim ou N�o");

		if (respostaDepInicial.charAt(0) == 's' || respostaDepInicial.charAt(0) == 'S' || respostaDepInicial == "Sim"
		        || respostaDepInicial == "sim") {
		     mensagemContaBancaria = "";
		    for (int i = 0; i < contasBancarias.size(); i++) {
		        ContaBancaria conta = contasBancarias.get(i);
		        mensagemContaBancaria += (i-1) + ". Conta " + (i - 1) + ": n�mero " + conta.getNumeroConta() + "\n";
		    }
		    int opcaoConta = Integer.parseInt(JOptionPane.showInputDialog(mensagemContaBancaria + "\nInforme o n�mero da conta na qual deseja fazer o dep�sito inicial"));
		    double depInicial = Double.parseDouble((JOptionPane.showInputDialog("Infome o valor do dep�sito inicial")));
		    contasBancarias.get(contasBancarias.indexOf(opcaoConta)+1).deposito(depInicial, opcaoConta);
		} else {
		    contasBancarias.add(new ContaBancaria(numeroContaBancaria, usuario));
		}
		
		
		mensagemContaBancaria = "";
		for (int i = 1; i < contasBancarias.size(); i++) {
		    ContaBancaria conta = contasBancarias.get(i-1);
		    mensagemContaBancaria += (i-1) + ". Conta " + (i-1) + ": n�mero " + conta.getNumeroConta() + "\n";
		}
		
		int opcaoContaDep = Integer.parseInt(JOptionPane.showInputDialog(mensagemContaBancaria + "\nInforme o n�mero da conta na qual deseja fazer o dep�sito"));
		double valorDeposito = Double.parseDouble((JOptionPane.showInputDialog("Informe o valor do dep�sito")));
		contasBancarias.get(contasBancarias.indexOf(opcaoContaDep)+1).deposito(valorDeposito, opcaoContaDep);		
		JOptionPane.showMessageDialog(null, "Conta Atualizada\n" + usuario);
		
		mensagemContaBancaria = "";
		for(int i = 1; i < contasBancarias.size();i++) {
			ContaBancaria conta = contasBancarias.get(i-1);
			mensagemContaBancaria += (i-1) + ". Conta "+ (i-1) + ": N�mero "+conta.getNumeroConta()+"\n";
		}
		int opcaoContaSaq = Integer.parseInt(JOptionPane.showInputDialog(mensagemContaBancaria+"\nInforme o n�mero da conta na qual deseja fazer o saque"));
		double valorSaq = Double.parseDouble(JOptionPane.showInputDialog("Infomre o valor do saque"));
		contasBancarias.get(contasBancarias.indexOf(opcaoContaSaq)+1).saque(valorSaq, opcaoContaSaq);
		JOptionPane.showMessageDialog(null, "Conta Atualizada\n" + usuario);
	}
}
