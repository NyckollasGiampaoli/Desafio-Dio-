package Desafio;

public abstract class conta implements econta{
	 
	protected static int Agencia_padrao = 1;
	private static int Sequencial = 1;
	
	    protected int agencia;
		protected double saldo;
		protected int numero;
		protected String nome;
		protected int l;
		protected double valor;
	
			
		public conta(String nome2) {
			this.agencia = econta.Agencia_padrao;
			this.numero = Sequencial ++;
			this.setNome(nome2);
			this.setSaldo(saldo);
		}	
		
		public int getL() {
			return l;
		}
		
		public void setL(int l) {
			this.l = l;
		}
		
		public String getNome() {
			return nome;
		}


		public void setNome(String nome2) {
			this.nome = nome2;
		}

		public void sacar(double valor) {
			saldo -= valor;
		}
		
		public void depositar(double valor) {
			saldo += valor;
		}
		
		public void transferir(double valor, econta contaDestino) {
			this.sacar(valor);
			contaDestino.depositar(valor);
		}
		
		public int getAgencia() {
			return agencia;
		}

		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		
		public double getValor() {
			return valor;
		}
		public void setValor(double valor) {
			this.valor = valor;
		}

		protected void ImprimirInfosComuns() {
			System.out.println(String.format("\nNome: " + this.nome));
			System.out.println(String.format("\nAgência: " + this.agencia));
			System.out.println(String.format("\nNúmero: " + this.numero));
			System.out.println(String.format("\nValor: " + this.saldo));
			System.out.println(String.format("\nConta: " + this.getL()));
		}
}