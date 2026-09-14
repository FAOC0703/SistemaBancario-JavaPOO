package model.entities;

public class ContaPoupanca extends Conta{

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Integer numero, Cliente titular) {
		super(numero, titular);
	}

	public ContaPoupanca(Integer numero, Double saldo, Cliente titular) {
		super(numero, saldo, titular);
	}
	
}
