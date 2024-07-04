package fundamentos.operadores;

import java.util.Scanner;

public class CelsiusParaFahrenheit {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Olá este é um programa que converte Celsius em Fahrenheit.");
		System.out.println("Digite o valor em Celsius.");
		double celsius = entrada.nextDouble();
		double fahrenheit = (celsius * 9/5) + 32;
		System.out.println("A temperatura em fahrenheit é: " + fahrenheit + "°F.");
		
		entrada.close();
	}

}
