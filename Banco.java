package Desafio;

import java.util.List;

public abstract class Banco {
	private String nome;
	private List<econta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<econta> getContas() {
		return contas;
	}

	public void setContas(List<econta> contas) {
		this.contas = contas;
	}	 
}
