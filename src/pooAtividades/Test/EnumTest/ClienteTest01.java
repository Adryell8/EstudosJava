package pooAtividades.Test.EnumTest;

import pooAtividades.Domain.EnumDomain.Cliente;
import pooAtividades.Domain.EnumDomain.TipoCliente;

public class ClienteTest01 {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Lucas", TipoCliente.PESSOA_FISICA);
		Cliente cliente2 = new Cliente("Lucas", TipoCliente.PESSOA_JURIDA);
		Cliente cliente3 = new Cliente("Lucas", TipoCliente.PESSOA_FISICA);
		
		System.out.println(cliente);
		System.out.println(cliente2);
		System.out.println(cliente3);
	}

}
