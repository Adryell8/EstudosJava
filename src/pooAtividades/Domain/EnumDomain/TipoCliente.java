package pooAtividades.Domain.EnumDomain;

import java.io.ObjectInputStream.GetField;

public enum TipoCliente {
	PESSOA_FISICA(1, "Pessoa física"),
	PESSOA_JURIDA(2, "Pessoa jurídica");
	
	public final int VALOR;
	private String NOME_RELATORIO;

	private TipoCliente(int valor, String NOME_RELATORIO) {
		this.VALOR = valor;
		this.NOME_RELATORIO = NOME_RELATORIO;
	}
	
	public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
		for(TipoCliente tipo : values()) {
			if(tipo.getNomeRelatorio().equals(nomeRelatorio)) {
				return tipo;
			}
		}
		return null;
	}

	public String getNomeRelatorio() {
		return NOME_RELATORIO;
	}
	
	/*
	 * public int getValor() { return VALOR; }
	 */
	
}
