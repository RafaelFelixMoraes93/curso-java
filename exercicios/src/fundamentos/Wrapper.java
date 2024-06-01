package fundamentos;

import java.util.Scanner;

public class Wrapper {
	public static void main(String[] args) {
		//Wrapper converte um primitivo em objeto.
		Scanner entrada = new Scanner(System.in);
		
		// byte
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;
		Integer k = Integer.parseInt("1000");
		Long l = 100000L;
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(k.doubleValue());
		System.out.println(l.toString().length());
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c= '#'; // char
		System.out.println(c + "...");
		
		
		entrada.close();
	}
}
