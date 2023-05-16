package pooAtividades.Domain.EnumDomain;

public enum TipoCliente {
	PESSOA_FISICA(1),
	PESSOA_JURIDA(2);
	
	public final int VALOR;

	private TipoCliente(int valor) {
		this.VALOR = valor;
	}

	/*
	 * public int getValor() { return VALOR; }
	 */
	
}
