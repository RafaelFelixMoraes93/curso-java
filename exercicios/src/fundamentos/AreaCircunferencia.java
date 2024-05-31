package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		double raio = 3.4;
		final double PI = 3.1415; //Também está em MATH // final = CONSTANTE.
		
		double area = PI * raio * raio;		
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Área = " + area + " m2");
		
	}

}
