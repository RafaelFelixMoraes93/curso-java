package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length());// Converte para String com Wrapper
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length()); // Conversão para String com Integer direto
		
		System.out.println(("" + num2).length()); // Também é possivel, mas não é uma boa prática de programação
		
	}

}
