package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		double a = 4.5; //Declaração + inicialização
		System.out.println(a);
		
		//Var define qual será o tipo da variável a partir do dado recebido.
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto"; //Obrigatório inicializar quando é VAR.
		System.out.println(c);
		c = "Outro texto";
		System.out.println(c);
		
		double d;//Declaração
		d = 123.65;// Inicialização de valor.
		System.out.println(d);
		
		var e = 123.45;
		System.out.println(e);
		
		var f = 12; //Inteiro.
		// f = 12.01; // Não é possivel, pois é inteiro.
	}

}
