package pooAtividades.Test;

import javax.swing.JOptionPane;

import pooAtividades.Domain.Pessoa01;

public class PessoaTest{

	public static void main(String[] args) {

		Pessoa01 pessoa = new Pessoa01();
		String nome = JOptionPane.showInputDialog("Informe o seu nome");
		pessoa.setNome(nome);
		String sobreNome = JOptionPane.showInputDialog("Informe o seu sobrenome");
		pessoa.setSobreNome(sobreNome);
		int AnoDeNascimento = Integer.parseInt((JOptionPane.showInputDialog("Informe a sua data de nascimento")));
		pessoa.setAnoDeNascimento(AnoDeNascimento);

		JOptionPane.showMessageDialog(null, pessoa.JuntaNome() + ". Ano nascimento:" + pessoa.getAnoDeNascimento());
		JOptionPane.showMessageDialog(null, "Você tem: " + pessoa.QtdAnos());
	}

}
