package pooAtividades.Domain.BancoAtividadeDomain;

import java.util.ArrayList;
import java.util.List;
import pooAtividades.Domain.BancoAtividadeDomain.ContaBancaria;

public class Usuario {
	private String nome;
	private String cpf;
	private String dataNascimento;

	private ArrayList<ContaBancaria> contasBancarias;

	public Usuario() {
	}

	public Usuario(String nome) {
		this.nome = nome;
	}

	public Usuario(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public Usuario(String nome, String cpf, String dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.contasBancarias = new ArrayList<ContaBancaria>();
	}

	public Usuario(String nome, String cpf, String dataNascimento, ArrayList<ContaBancaria> contasBancarias) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.contasBancarias = contasBancarias;
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

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public List<ContaBancaria> getContasBancarias() {
		return new ArrayList<ContaBancaria>(contasBancarias);
	}

	public void setContasBancarias(ArrayList<ContaBancaria> contasBancarias) {
		this.contasBancarias = contasBancarias;
	}

	public String listarContas() {
		StringBuilder sb = new StringBuilder();
		sb.append("Contas do usuário " + this.nome + ":\n");
		for (ContaBancaria conta : contasBancarias) {
			sb.append(conta.toString() + "\n");
		}
		return sb.toString();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome do titular: " + this.nome + "\n");
		sb.append("Data nascimento: " + this.dataNascimento + "\n");

		for (int i = 1; i < contasBancarias.size(); i++) {

			ContaBancaria conta = contasBancarias.get(i-1);
			sb.append(
					"Conta " + (i) + ": Número " + conta.getNumeroConta() + ", saldo: " + conta.getSaldo() + "\n");

		}
		return sb.toString();
	}
}
