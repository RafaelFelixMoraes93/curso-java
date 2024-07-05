package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a média: ");
		double media = entrada.nextDouble();
		
		if(media <= 10 && media >= 7.0) {
			System.out.println("Aprovado!");
			System.out.println("Parabéns!");
		}else if(media >= 5.0 && media <= 6.9) {
			System.out.println("Recuperação!");
			System.out.println("Melhore!");
		}else if(media >= 0.0 && media <= 4.9) {
			System.out.println("Reprovado!");
			System.out.println("Melhore no próximo ano!");
		}
		
		
		entrada.close();
	}

}
