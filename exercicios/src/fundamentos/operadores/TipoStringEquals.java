package fundamentos.operadores;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1); //False
		System.out.println("2".equals(s1)); //True "compara o objeto"
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		System.out.println("2" == s2.trim()); //.TRIM retira os espaços em branco
		System.out.println("2".equals(s2.trim())); //True
		
		entrada.close();
	}

}
