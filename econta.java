package Desafio;

public interface econta {

	static int Agencia_padrao = 1;
	static int Sequencial = 1;
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, econta contaDestino);
	
	void ImprimirExtrato();
}