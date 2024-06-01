package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2)); // Mostrar letra especifica.
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s);
		
		s = "Bom dia";
		System.out.println(s + "!!!");
		
		System.out.println(s.startsWith("Bom")); // True
		System.out.println(s.startsWith("bom")); // False
		System.out.println(s.toLowerCase().startsWith("bom")); // True
		// .endWith
		// .length

		System.out.println(s.equalsIgnoreCase(s)); // Ignora letras maiusculas e minusculas
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 1234.987;
		System.out.printf("O senhor: %s %s tem %d e ganha R$%.2f.",
				nome, sobrenome, idade, salario);
		
		System.out.println();
		String frase = String.format("O senhor: %s %s tem %d e ganha R$%.2f.",
				nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));
	}

}
