package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		/*
		 * Utilizar 3 strings (e  fazer a média dos últimos 3 salário)
		 * deve aceitar "." e ","
		 * Imprimir a média.
		 */
		String salario1String;
		String salario2String;
		String salario3String;
		double media;
		
		System.out.println("Digite o primeiro salário: ");
		salario1String = entrada.next();
		salario1String = salario1String.replace(",", ".");
		double salario1 = Double.parseDouble(salario1String); 
		
		System.out.println("Digite o segundo salário: ");
		salario2String = entrada.next();
		salario2String = salario2String.replace(",", ".");
		double salario2 = Double.parseDouble(salario2String);
		
		
		System.out.println("Digite o terceiro salário");
		salario3String = entrada.next();
		salario3String = salario3String.replace(",", ".");
		double salario3 = Double.parseDouble(salario3String);
		
		media = (salario1 + salario2 + salario3) / 3;
		
		System.out.println("A médio dos salários é: " + media);
		
		
		
		
		
		
		entrada.close();	
	}

}

