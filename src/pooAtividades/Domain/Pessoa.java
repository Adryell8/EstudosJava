package pooAtividades.Domain;

public class Pessoa {
	private String nome;
	private String cpf;
	private Endereco endereco;
	
	public void imprimePessoa() {
		System.out.println("Nome:"+this.nome);
		System.out.println("CPF:"+this.cpf);
		System.out.println("Endere�o: "+this.endereco.getRua()+" CEP: "+this.endereco.getCep()+" N�mero "+this.endereco.getNumero());
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
