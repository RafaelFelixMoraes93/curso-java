package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogico {	
	public static void main(String[] args) {		
		/*
		 * Trabalho na terça (V ou F)
		 * Trabalho na quinta (V ou F)
		 * Se 2 trabalhos V tv 50
		 * Se 1 trabalho V tv 32
		 * Ambos os casos a familia vai tomar sorvete no shopping + tv50
		 * Caso os 2 deem F, ficar em casa.
		 */		
		Scanner entrada = new Scanner(System.in);
		boolean trabalho1;
		boolean trabalho2;
		
		System.out.println("Trabalho da terça, digite 1 para SIM e 2 para NÃO: ");
		int trabalhoTerca = entrada.nextInt();
		if(trabalhoTerca == 1) {
			trabalho1 = true;
		}else {
			trabalho1 = false;
		}
		
		
		System.out.println("Trabalho da quinta, igite 1 para SIM e 2 para NÃO: ");
		int trabalhoQuinta = entrada.nextInt();
		if(trabalhoQuinta == 1) {
			trabalho2 = true;
		}else {
			trabalho2 = false;
		}
		
		
		if(trabalho1 && trabalho2 == true) {
			System.out.println("Familia irá comprar a TV de 50 e irá tomar sorvete no shopping.");
		}else if(trabalho1 || trabalho2 == true) {
			System.out.println("Familia irá comprar a TV de 32 e irá tomar sorvete no shopping.");
		}else if(trabalho1 == false && trabalho2 == false){
			System.out.println("Fammilia ficará em casa.");
		}		
		
		entrada.close();
	}
}