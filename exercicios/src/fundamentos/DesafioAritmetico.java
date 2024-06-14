package fundamentos;

public class DesafioAritmetico {
	public static void main(String[] args) {
		/*
		 * Math.pow(variavel, valor do expoente);
		 * 
		 *  /  parte1			parte2   \
		 *  I [6*(3+2)]² - /[1-5]*(2-7)\ I 
		 *  I --------	   I-----------I I parte3
		 *  I	 3*2	   \	2	   / I
		 *  \							 /
		 *  ------------------------------
		 *  			10³ parte4
		 *  resultado
		 */ 
		
		double parteUm = 3+2 * 6;
		parteUm = Math.pow(parteUm, 2);
		parteUm = parteUm / 3*2;
		System.out.println(parteUm); // teste parte1
		
		
		double parteDois =(1-5)*(2-7) / 2;
		parteDois = Math.pow(parteDois, 2);
		System.out.println(parteDois); // teste parte2
		
		double parteTres = parteUm - parteDois;
		parteTres = Math.pow(parteTres, 3);
		
		double parteQuatro = Math.pow(10, 3);
		
		double resultado = parteTres / parteQuatro;
		System.out.println(resultado); // resultado final
	}

}
