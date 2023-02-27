package Desafio;

import java.util.Scanner;

public class ContaTerminal {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;
		
		System.out.println("Por favor, digite o");
		System.out.print("número da Agência! ");
		agencia = leia.next();
		
		System.out.println("Informe o número: ");
		numero = leia.nextInt();
		
		System.out.println("Informe seu nome:");
		nomeCliente = leia.next();
		
		System.out.println("Informe seu saldo: ");
		saldo = leia.nextDouble();
		
		
		System.out.println("Olá " + nomeCliente + ",");
		System.out.print(" obrigado por criar ");
		System.out.println(" uma conta em nosso ");
		System.out.print(" banco, sua agência é ");
		System.out.print(agencia + ", conta ");
		System.out.println(numero + " e seu saldo ");
		System.out.print(saldo + " já está disponível ");
		System.out.print(" para o saque");
	}
}
