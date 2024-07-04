package fundamentos.operadores;

import java.util.Scanner;

public class IndiceDeMassaCorporal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Este é um programa que calcula o IMC.");
		System.out.println("Digite o seu peso.");
		double peso = entrada.nextDouble();
		System.out.println("Digite a sua altura, exemplo: 1,80 ");
		String altura = entrada.next().replace(",", ".");
		Double alturaConvertida = Double.parseDouble(altura);
		
		double imc = peso / (alturaConvertida * alturaConvertida);
		System.out.println("Seu IMC é: " + imc + ".");
		
		if(imc <= 16.9) {
			System.out.println("Você está muito abaixo do peso.");
			}else if(imc >=17 && imc <= 18.4) {
				System.out.println("Você está abaixo do peso.");
				}else if(imc >= 18.5 && imc <= 24.9) {
					System.out.println("Seu peso está normal.");
					}else if(imc >= 25 && imc <=29.9) {
						System.out.println("Você está acima do peso.");
						}else if(imc >= 30 && imc <=34.9) {
							System.out.println("Você está com obesidade grau I");
							}else if(imc >= 35 && imc <= 40) {
								System.out.println("Você está com obesidade grau II");
								}else if(imc >40) {
									System.out.println("Você está com obesidade grau III");
								}
		
		entrada.close();
	}
}
