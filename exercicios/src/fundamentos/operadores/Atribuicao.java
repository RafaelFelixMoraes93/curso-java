package fundamentos.operadores;

public class Atribuicao {
	public static void main(String[] args) {
		
		int a = 3; // Literal
		int b = a; // Recebe outra variável
		int c = a +b; // Recebe 2 operandos
		
		System.out.println(c);
		
		c += b; //c = c + b;
		c -= a; //c = c - a;
		c *= b; //c = c * b;
		c /= a; //c = c / a;
		c %= 2; //c = c % 2; 0 ou 1
		
		System.out.println(c);
		
		c++; // Incremento unário
		c--; // Decremento unário
	}

}
