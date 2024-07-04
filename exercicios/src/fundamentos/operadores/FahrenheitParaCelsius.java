package fundamentos.operadores;

import java.util.Scanner;

public class FahrenheitParaCelsius {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Olá este é um programa que converte Fahrenheit em Celsius.");
		double fahrenheit = entrada.nextDouble();
		fahrenheit = (fahrenheit - 32) * 5/9;
		System.out.println(fahrenheit);
		
		entrada.close();
	}

}
