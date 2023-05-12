package pooAtividades.Domain.BancoAtividadeDomain;

public class ContaBancaria {
	private int numeroConta;
	private String titular;
	private double saldo;
	public ContaBancaria() {
		
	}
	public ContaBancaria(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public ContaBancaria(int numeroConta, String titular) {
		this.numeroConta = numeroConta;
		this.titular = titular;
	}
	public ContaBancaria(int numeroConta, String titular, double saldo) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void deposito(double valorDep) {
		this.saldo += valorDep;
	}
	public void saque(double valorSaq) {
		this.saldo -= valorSaq +5.00;
	}
	@Override
	public String toString() {
		return "Dados da conta: \nnumeroConta: " + numeroConta + "\ntitular: " + titular + "\nsaldo: " +String.format("%.2f", saldo);
	}
	
	
	
}
