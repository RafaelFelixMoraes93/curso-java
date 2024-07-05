package fundamentos.operadores;

import java.util.Scanner;

public class ElevacaoQuadradoECubo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Olá, este programa eleva o número escolhido ao quadrado e ao cubo.");
		System.out.println("Digite um número.");
		double numeroEscolhido = entrada.nextDouble();
		System.out.println("O número escolhido é: " + numeroEscolhido);
		System.out.println("Número escolhido ao quadrado: " + Math.pow(numeroEscolhido, 2));
		System.out.println("Número escolhido ao cubo: " + Math.pow(numeroEscolhido, 3));
		
		entrada.close();
	}

}