package model.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.entities.Cliente;
import model.entities.Conta;

public class Banco {

	private List<Cliente> clientes = new ArrayList<>();
	private List<Conta> contas = new ArrayList<>();
	
	public Banco() {}

	public List<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	public List<Conta> getContas() {
		return contas;
	}
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	public void cadastrarClientes(String nome, String cpf, Date dataNascimento) {
		Cliente cl = new Cliente(nome, cpf, dataNascimento);
		clientes.add(cl);
	}
	
	
}
