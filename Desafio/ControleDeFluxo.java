package Desafio;
 
import java.util.Scanner;
import java.util.InputMismatchException;

public class ControleDeFluxo {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) throws ParametrosInvalidosException {
		
		int par1 = 0;
		int par2 = 0;
		
		try {
			System.out.print("Digite o primeiro valor: ");
			 par1 = leia.nextInt();
			System.out.print("\nDigite o segundo valor: ");
		     par2 = leia.nextInt();
		
		     contar(par1, par2);
		     
		}catch (Exception e) {
			e.getMessage();
			throw new ParametrosInvalidosException();
		}
	}
	
	static void contar(int par1, int par2) throws ParametrosInvalidosException {
		if (par2 > par1) {
			
			int cont = par2 - par1;
			for(int i = 1; i <= cont; i ++) {
			System.out.println("Imprimindo o número " + i);
			}
	
		}else {
			
			throw new ParametrosInvalidosException();
		}
   }
}
