package Desafio;

import java.util.Scanner;

public class Main {

	static Scanner leia = new Scanner(System.in);
	protected static  double saldo;
	
	public static void main(String[] args) {
		
		
		System.out.println("Informe o nome: ");
		String nome = leia.next();	
       
		
		System.out.println("Informe qual conta deseja usar: 1(Conta Corrente) ");
		System.out.println(" ou 2(Conta Poupança)");
		int l = leia.nextInt();
		if (l == 1) {
			System.out.println("Conta Corrente");
			contaC cc = new contaC(nome, l, saldo);
			contaP cp = new contaP(nome, l, saldo);
			cc.l = l;
			
			System.out.println("Informe o quanto de dinheiro você tem: ");
			 cc.saldo = leia.nextDouble();
			
			System.out.print("Escreva uma dessas opções: TRANSFERIR, SACAR ");
			System.out.print("ou DEPOSITAR: ");
			String opcao = leia.next().toUpperCase();	

			
			switch(opcao) {
			case "TRANSFERIR":
				
				System.out.println("Transferir valor.");
				System.out.println("Informe quanto deseja transferir: ");
				
				cc.valor = leia.nextDouble();
				
				System.out.print("Informe qual das contas deseja transferir ");
				System.out.print(" Este valor: \n1(Conta Corrente) ou 2 (Conta ");
				System.out.println(" Poupança)");
				int n = leia.nextInt();
				
				if(n == l) {	
					System.out.println("Não é possível transferir dinheiro ");
					System.out.println(" na sua própria conta");
				    
					cc.ImprimirExtrato();
				    break;
				    
				}else if (n != l && n < 3 && n > 0) {
					System.out.println("Transferindo dinheiro da conta...");
				    cc.transferir(cc.valor, cp);
				    cc.ImprimirExtrato();
				    break;
				    
				}else {
					 System.out.println("Opção Inválida");
				 break;
				 
				}
			case "SACAR":
				System.out.println("Sacar valor.");
				System.out.println("Informe quanto deseja sacar: ");
				
				cc.valor = leia.nextDouble();
				System.out.println("Conta Corrente.");
			    cc.sacar(cc.valor);
				cc.ImprimirExtrato();
				break;
				
			case "DEPOSITAR":
				System.out.println("Depositar valor.");
				System.out.println("Informe quanto deseja depositar: ");
				
				cc.valor = leia.nextDouble();
				cc.depositar(cc.valor);
				cc.ImprimirExtrato();
				break;
				    
	
				}
			}else if (l == 2) {
			System.out.println("Conta Poupança");
			contaP cp = new contaP(nome, l, saldo);
			contaC cc = new contaC(nome, l, saldo);
			cp.l = l;
			System.out.println("Informe o quanto de dinheiro você tem: ");
			 cp.saldo = leia.nextDouble();
			
			System.out.print("Escreva uma dessas opções: TRANSFERIR, SACAR ");
			System.out.print("ou DEPOSITAR: ");
			String opcao = leia.next().toUpperCase();	

			
			switch(opcao) {
			case "TRANSFERIR":
				
				System.out.println("Transefir valor.");
				System.out.println("Informe quanto deseja transferir: ");
				
				cp.valor = leia.nextDouble();
				
				System.out.print("Informe qual das contas deseja transferir ");
				System.out.print(" Este valor: \n1(Conta Corrente) ou 2 (Conta ");
				System.out.println(" Poupança)");
				int n = leia.nextInt();
				
				if(n == l) {	
					System.out.println("Não é possível transferir dinheiro ");
					System.out.println(" na sua própria conta");
				    
					cp.ImprimirExtrato();
				    break;
				    
				}if(n != l && n < 3 && n > 0) {
					System.out.println("Transferindo dinheiro...");
				    cp.transferir(cp.valor, cc);
	
				    cp.ImprimirExtrato();
				    break;
				    
				}else {
					 System.out.println("Opção Inválida");
				 break;
				 
				}
			case "SACAR":
				System.out.println("Sacar valor.");
				System.out.println("Informe quanto deseja sacar: ");
				
				cp.valor = leia.nextDouble();
				
					System.out.println("Sacando dinheiro...");
				    cp.sacar(cp.valor);
				    cp.ImprimirExtrato();
				    break;
				
			case "DEPOSITAR":
				System.out.println("Depositar valor.");
				System.out.println("Informe quanto deseja depositar: ");
				
				cp.valor = leia.nextDouble();
			    cp.depositar(cp.valor);
				cp.ImprimirExtrato();
			    break;
					    
				default: 
					System.out.println("Opção Inválida");
					break;
				}
			}else {
				System.out.println("Opção Inválida");
		}
	}
}