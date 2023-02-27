package Desafio;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		String [] candidatosSelecionados = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
		for(String candidato: candidatosSelecionados) {
			LigarCandidatos(candidato);
		}
		}

	static void LigarCandidatos(String candidatos) {
		int tentativas = 1;
		boolean continuar = true;
		boolean atendeu = false;
	do {
		atendeu = atender();
		continuar = !atendeu;
		if (continuar) {
			tentativas ++;
			
		}else {
			System.out.print("\nContato realizado ");
			System.out.print(" com sucesso!");
			
		}
		if (atendeu) {
			System.out.print("CONSEGUIMOS CONTATO COM A ");
			
			System.out.println(candidatos +" NA "); 
			System.out.println(tentativas + " TENTATIVA");  
		}else {
			System.out.println("NÃO CONSEGUIMOS CONTATO COM "); 
			System.out.println(candidatos);
		}
		
	}while(continuar && tentativas<3);
	}
	static boolean atender() {
		return new Random().nextInt(3)==1;	
	}
	static void ImprimirSelecionados() {
		
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
		System.out.print ("Imprimindo a lista de ");
		System.out.println (" candidatos informados");

		for(int indice = 0; indice < candidatos.length; indice ++) {
	    	System.out.print("\nO candidato n° " + indice);
	    	System.out.print(" é " + candidatos[indice]);

	}
	}
	
	static void seleçaoCandidato () {
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","PEDRO","MARIA","JOAO","PEDRA"};
	
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		
		while (candidatosSelecionados < 5) {
			
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = ValorPretendido();
			
			System.out.print("O candidato " + candidato);
			System.out.print(" solicitou este valor de ");
			System.out.print(" salário" + salarioPretendido);
			if (salarioBase > salarioPretendido) {
				System.out.println("O candidato foi selecionado");
				candidatosSelecionados ++;
		}else {
			System.out.println("O candidato NÃO foi selecionado");
		}
		candidatoAtual ++;
		
		}
	}
	 static double ValorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}

	static void AnalisarCandidato(double salarial) {
	
					double salarioBase = 1500.0;
					if (salarioBase > 2000) {
						System.out.print("\nLIGAR PARA O CANDIDATO.");	
					} else if (salarioBase == 2000) {
						System.out.print (" \nLIGAR PARA O CANDIDATO, ");
				         System.out.print("COM CONTRA PROPOSTA.");
					} else {
						System.out.print("\nAGUARDANDO RESULTADO ");
				        System.out.print("DOS DEMAIS CANDIDATOS.");	
					}		  
				     }
	}