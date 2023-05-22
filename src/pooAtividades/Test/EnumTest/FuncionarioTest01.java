package pooAtividades.Test.EnumTest;

import pooAtividades.Domain.EnumDomain.Desenvolvedor;
import pooAtividades.Domain.EnumDomain.Gerente;

public class FuncionarioTest01 {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("Lucas", 10000);
		Desenvolvedor desenvolvedor = new Desenvolvedor("Julia", 1599);
		System.out.println(gerente);
		System.out.println(desenvolvedor);
		
		
	}

}
