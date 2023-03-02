package Desafio;

public interface conta {

	static int Agencia_padrao = 1;
	static int Sequencial = 1;
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, Iconta contaDestino);
	
	void ImprimirExtrato();
}
