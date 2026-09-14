package model.entities;

public abstract class Conta {
	
	private Integer numero;
	private Double saldo;
	private Cliente titular;
	
	public Conta() {}

	public Conta(Integer numero, Cliente titular) {
		this.numero = numero;
		this.titular = titular;
	}
	
	public Conta(Integer numero, Double saldo, Cliente titular) {
		this.numero = numero;
		this.saldo = saldo;
		this.titular = titular;
	}

	public Integer getNumero() {
		return numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Cliente getTitular() {
		return titular;
	}
	
	public void depositar(double quantia) {
		saldo += quantia;
	}
	
	public void sacar(double quantia) {
		saldo -= quantia;
	}

}
