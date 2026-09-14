package model.entities;

public class ContaCorrente extends Conta{
	
	public ContaCorrente() {
		super();
	}

	public ContaCorrente(Integer numero, Cliente titular) {
		super(numero, titular);
	}

	public ContaCorrente(Integer numero, Double saldo, Cliente titular) {
		super(numero, saldo, titular);
	}
	
}
