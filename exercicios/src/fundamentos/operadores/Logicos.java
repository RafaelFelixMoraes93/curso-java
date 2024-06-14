package fundamentos.operadores;

public class Logicos {
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!condicao1);
		System.out.println(!condicao2);
		System.out.println();
		
		System.out.println("Tabela da verdade E (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
		//System.out.println(false && true); Código morto
		//System.out.println(false && false); Código morto
		System.out.println();
		
		System.out.println("Tabela verdade OU (OR)");
		//System.out.println(true || true); Código morto
		//System.out.println(true || false); Código morto
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println();
		
		System.out.println("Tabela verdade OU Exclusivo (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		System.out.println();
		
		System.out.println("Tabela verdade NOT");
		System.out.println(!true);
		System.out.println(!false);
		System.out.println();
	}
}
