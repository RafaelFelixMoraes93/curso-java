package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.toUpperCase();// apenas s.toUpperCase não altera o valor da variável.
		
		s = s.replace("X", "Senhora"); // Substituir.
		
		s = s.concat("!!!");//Concatenar.
		
		System.out.println(s);
		
		String x = "Rafa".toUpperCase();
		System.out.println(x);
		System.out.println("Rafa".toUpperCase().
				length());// Pode-se usar varios pontos de notação para chamadas.
		
		String y = "Bom dia X".replace("X", "Gui");
		System.out.println(y);
		
		y = y.toLowerCase();
		System.out.println(y);
		
		//Tipos primitivos não tem o operador ponto de notação "."
		// int a = 3;
		// a.   não tem comportamento.
	}

}
