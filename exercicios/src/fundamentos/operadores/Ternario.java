package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		
		//Em operadores ternarios, podemos trabalhar com multiplos na mesma condição
		//Mas não é uma boa prática de programação
		//É preferivel usar outras estruturas.
		double media = 7.6;
		String resultadoRecuperacao = media >= 5.0 ? "em recuperação!" : "reprovado";
		String resultado = media >= 7.0 ? "Aprovado!" : resultadoRecuperacao;
		
		System.out.println("O aluno está: " + resultado);
		
		
	}

}
