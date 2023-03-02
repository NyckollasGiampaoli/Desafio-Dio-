package Desafio;

public class contaC extends conta {

	 
	public contaC(String nome, int l, double saldo) {
			super(nome);
		}

	public void ImprimirExtrato() {
		System.out.println("*** Extrato conta corrente ***");
		super.ImprimirInfosComuns();
	}

}