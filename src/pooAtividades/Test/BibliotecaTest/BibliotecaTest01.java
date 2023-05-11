package pooAtividades.Test.BibliotecaTest;

import javax.swing.JOptionPane;

import pooAtividades.Domain.BibliotecaDomain.Autor;
import pooAtividades.Domain.BibliotecaDomain.Livro;


public class BibliotecaTest01 {

	public static void main(String[] args) {
		Livro livro;
		Autor autor;
		
		String nomeAutor = JOptionPane.showInputDialog("Informe o nome do autor: ");
		int anoNascimentoAutor = Integer.parseInt( JOptionPane.showInputDialog("Informe o ano de nascimento do autor")); 
		autor = new Autor(nomeAutor, anoNascimentoAutor);
		JOptionPane.showMessageDialog(null, autor);
		
		String nomeLivro = JOptionPane.showInputDialog("Informe o nome do livro a ser cadastrado");
		int anoLancamentoLivro = Integer.parseInt( JOptionPane.showInputDialog("Informe o ano de lançamento do livro")); 
		
	}

}
