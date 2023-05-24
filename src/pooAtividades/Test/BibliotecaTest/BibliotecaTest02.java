package pooAtividades.Test.BibliotecaTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import pooAtividades.Domain.BibliotecaDomain.Autor;
import pooAtividades.Domain.BibliotecaDomain.Livro;

public class BibliotecaTest02 {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Scanner input = new Scanner(System.in);
		Livro livro = new Livro();
		Autor autor = new Autor();

		System.out.println("Informe o nome do autor: ");
		String nomeAutor = input.nextLine();
		System.out.println("Informe o ano da nascimento do autor: ");
		Date dataNascimento = sdf.parse(input.nextLine());
		
		autor = new Autor(nomeAutor, dataNascimento);
		
		System.out.println("Informe quantos livros do autor "+ autor.getNomeAutor());
		int quantLivrosAutor = input.nextInt();
		
		input.nextLine();
		
		for (int i = 0; i < quantLivrosAutor; i++) {			
			System.out.println("Informe o nome do livro: "+ (i+1)+"°");
			String nomeLivro = input.nextLine();
			
			livro = new Livro(nomeLivro);
			autor.adicionaLivro(livro);
		}
		System.out.println(autor);
		
	}

}
