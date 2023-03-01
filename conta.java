package Desafio;

public interface conta {

	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, Iconta contaDestino);
	
	void ImprimirExtrato();
}