package controle;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		/*
		 * Sair do loop com entrada de dados.
		 */
		Scanner entrada = new Scanner(System.in);
		
		String saidaDoLoop = "Olá";
		
		while(!saidaDoLoop.equalsIgnoreCase("sair")) {
			System.out.println("Para sair digite 1.");
			System.out.println("Digite qualquer coisa!");
			saidaDoLoop = entrada.next();			
		}
		
		entrada.close();
	}

}
