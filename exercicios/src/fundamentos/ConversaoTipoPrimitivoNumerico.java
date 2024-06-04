package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1; // Conversão implicita.
		System.out.println(a);
		
		
		// float b = 1.0; // Necessario realizar conversão.
		float b = (float) 1.0123456789; // Perda de informação, Explícita (CAST)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; // Caso pegue um valor maior que 127, ele volta a -127 e cada número até adicionado, não é uma boa prática).
		System.out.println(d);
		
		double e = 1.9999999999999;
		int f = (int) e; // Perda de informação, Explícita (CAST)
		System.out.println(f);
		/*
		 * Sempre verificar se há necessidade de otimizar
		 * As vezes é muito mais eficiente usar um INT ao inves de um BYTE
		 * Ou Double ao inves de INT
		 * Sempre necessário verificar qual se adequa melhor.
		 */
	}

}
