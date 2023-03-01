package Desafio;

import java.util.List;

public abstract class Banco {
	private String nome;
	private List<Iconta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Iconta> getContas() {
		return contas;
	}

	public void setContas(List<Iconta> contas) {
		this.contas = contas;
	}	 
}