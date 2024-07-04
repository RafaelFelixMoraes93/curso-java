package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {

	/*
	 * Ler num1
	 * Ler num2
	 * + - * % /
	 * Regras
	 * Deve usar apenas os conhecimentos do módulo
	 * não pode usar estruturas como if ou switch   
	 */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite o primeiro número: ");
		double numero1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double numero2 = entrada.nextDouble();
		
		System.out.println("Digite a operação que deseja realizar[+, -, *, /, %].");
		String operacao = entrada.next();
		
		operacao.replace("+", "PLUS")
						.replace("-", "MINUS")
						.replace("*", "ASTERISK")
						.replace("/", "SLASH")
						.replace("%", "PERCENT");
		
		double resultado = operacao.equals("+") ? numero1 + numero2:
						   		operacao.equals("-") ? numero1 - numero2:
						   			operacao.equals("*") ? numero1 * numero2:
						   				operacao.equals("/") ? numero1 / numero2:
						   					operacao.equals("%") ? numero1 % numero2: 0;
		System.out.println("O resultado de " + numero1 + " " + operacao + " " + numero2 + " é: " + resultado);
		entrada.close();
	}
}
