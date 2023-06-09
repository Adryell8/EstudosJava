package pooAtividades.Domain;

public class Pessoa {
	protected String nome;
	protected String cpf;
	protected Endereco endereco; // protected faz com que a classe seja como public, mas seja acessada apenas por suas subclasses ou classes no mesmo pacote
	
	public Pessoa(String nome) {
		this.nome = nome;
	}// todas as classes herdam de Object
	
	@Override
	public String toString() {
		return "Nome:"+this.nome+
				"\nCPF:"+this.cpf+
				"\nEndere�o: "+this.endereco.getRua()+
				" CEP: "+this.endereco.getCep()+
				" N�mero: "+this.endereco.getNumero();
	}
	
	public void imprime() {
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
