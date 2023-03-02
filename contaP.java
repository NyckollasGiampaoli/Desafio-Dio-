package Desafio;

public class contaP extends conta {
	
	
	public contaP(String nome, int l, double saldo) {
		super(nome);	
	}

	
    public void ImprimirExtrato() {
		System.out.println("*** Extrato conta poupança ***");
		super.ImprimirInfosComuns();
    }
}
