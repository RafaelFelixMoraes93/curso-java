package fundamentos.operadores;

public class Unario {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; //a = a + 1;
		a--; //a = a - 1;
		
		++b;//b = b + 1;
		--b;//b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio..."); // Isso é uma má prática, evitar usar.
		System.out.println(++a == b--); //True, b só recebe o decremento após comparação
		System.out.println(a == b); //False
		System.out.println(a);
		System.out.println(b);
		
	}

}
