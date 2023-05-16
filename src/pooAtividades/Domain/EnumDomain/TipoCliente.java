package pooAtividades.Domain.EnumDomain;

public enum TipoCliente {
	PESSOA_FISICA(1, "Pessoa física"),
	PESSOA_JURIDA(2, "Pessoa jurídica");
	
	public final int VALOR;
	public final String NOME_RELATORIO;

	private TipoCliente(int valor, String NOME_RELATORIO) {
		this.VALOR = valor;
		this.NOME_RELATORIO = NOME_RELATORIO;
	}

	/*
	 * public int getValor() { return VALOR; }
	 */
	
}
