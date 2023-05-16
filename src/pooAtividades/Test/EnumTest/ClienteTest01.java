package pooAtividades.Test.EnumTest;

import pooAtividades.Domain.EnumDomain.Cliente;
import pooAtividades.Domain.EnumDomain.TipoCliente;
import pooAtividades.Domain.EnumDomain.TipoPagamento;

public class ClienteTest01 {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Lucas", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
		Cliente cliente2 = new Cliente("Dio", TipoCliente.PESSOA_JURIDA, TipoPagamento.DEBITO);
		Cliente cliente3 = new Cliente("Jonjo", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
		
		System.out.println(cliente);
		System.out.println(cliente2);
		System.out.println(cliente3);
		System.out.println(TipoPagamento.DEBITO.calcDesconto(150));
		System.out.println(TipoPagamento.CREDITO.calcDesconto(260));
	}

}
