package fundamentos.operadores;

public class Aritmeticos {
	public static void main(String[] args) {
		
		System.out.println(2 + 3);
		var valorX = 34.56;
		double valorY = 2.2;
		
		System.out.println(valorX + valorY);
		
		int variavelA = 8;
		int varivaelB = 3;
		
		System.out.println(variavelA + varivaelB);
		System.out.println(variavelA - varivaelB);
		System.out.println(variavelA * variavelA);
		System.out.println(variavelA / varivaelB);
		System.out.println(variavelA / (double) varivaelB);
		System.out.println(variavelA / (float) varivaelB);
		
		System.out.println(8 % 3);
		System.out.println(variavelA % varivaelB);	
		
		System.out.println(valorY + valorY - variavelA * varivaelB);
		
	}

}
