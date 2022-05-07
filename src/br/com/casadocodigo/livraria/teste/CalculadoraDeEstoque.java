package br.com.casadocodigo.livraria.teste;


public class CalculadoraDeEstoque {
	public static void main(String[] args) {

		double soma = 0;
	
		
		for (double i = 0; i < 35; i++) {
			soma += 59.90;
		}
		
		System.out.println("O total em estoque eh " + soma);
		
		if (soma < 150) {
			System.out.println("Seu estoque estah muito baixo!");
		} else if (soma >= 2000) {
			System.out.println("Seu estoque estah muito alto!");
		} else {
			System.out.println("Seu estoque estah bom!");
		}
	}
}
