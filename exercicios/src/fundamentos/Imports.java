package fundamentos;

import java.util.Date;

public class Imports {
	public static void main(String[] args) {
		java.lang.String b = "Boa tarde"; // java lang vem em todas as classes, não precisa importar.
		System.out.println(b);
		
		String s = "Bom dia!";
		System.out.println(s);
		
		Date d = new Date(); 
		// Clicar na lâmpada de erro e importar, é preciso verificar qual o import correto.
		// Também pode apertar ctrl + shift + o.
		System.out.println(d);
		
		// JButton botao = new JButton();
	}

}
