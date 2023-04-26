package pooAtividades.Test;

import pooAtividades.Domain.Endereco;
import pooAtividades.Domain.Funcionario;
import pooAtividades.Domain.Pessoa;

public class HerancaTest01 {

	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		endereco.setRua("Rua 3");
		endereco.setNumero(123);
		endereco.setCep("098765-902");
		Pessoa pessoa = new Pessoa("Lucas Pessoa");
		pessoa.setCpf("1111111");
		pessoa.setEndereco(endereco);
		pessoa.imprime();
		
		Funcionario funcionario = new Funcionario("Lucas Funcionario");
		funcionario.setCpf("2222222");
		funcionario.setEndereco(endereco);
		funcionario.setSalario(2000000);
		System.out.println("----------");
		funcionario.imprime();
		funcionario.relatorioPagamento();
	}

}
