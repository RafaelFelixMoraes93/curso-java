package fundamentos.operadores;

import java.util.Scanner;

public class FahrenheitParaCelsius {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Olá este é um programa que converte Fahrenheit em Celsius.");
		System.out.println("Digite o valor em fahrenheit: ");
		double fahrenheit = entrada.nextDouble();
		double celsius = (fahrenheit - 32) * 5/9;
		System.out.println("O valor de Celsius é " + celsius + "°C.");
		
		entrada.close();
	}

}
