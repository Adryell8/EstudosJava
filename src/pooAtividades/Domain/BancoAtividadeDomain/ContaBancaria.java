package pooAtividades.Domain.BancoAtividadeDomain;

import pooAtividades.Domain.BancoAtividadeDomain.Usuario;

public class ContaBancaria {
	private int numeroConta;
	private Usuario titular;
	private double saldo;

	public ContaBancaria() {

	}

	public ContaBancaria(int numeroConta) {
		this.numeroConta = numeroConta;
		this.titular = new Usuario();
	}

	public ContaBancaria(int numeroConta, Usuario titular) {
		this.numeroConta = numeroConta;
		this.titular = titular;
	}

	public ContaBancaria(int numeroConta, Usuario titular, double saldo) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public Usuario getTitular() {
		return titular;
	}

	public void setTitular(Usuario titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double valorDep, int numeroConta) {
	    if (this.numeroConta == numeroConta) {
	        saldo += valorDep;
	    }
	}

	public void saque(double valorSaq, int numeroConta) {
		if(this.numeroConta == numeroConta) {
		this.saldo -= valorSaq + 5.00;
		}
	}

	@Override
	public String toString() {
		return "ContaBancaria numeroConta=" + this.numeroConta + ", saldo=" + this.saldo;
	}
	
	
	
}
