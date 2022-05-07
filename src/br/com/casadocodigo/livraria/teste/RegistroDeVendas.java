package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.LivroFisico;
import livraria.Autor;

public class RegistroDeVendas {
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Aureane");
		
		LivroFisico livroFisico = new LivroFisico(autor);
		livroFisico.setNome("Livro físico");
		livroFisico.setValor(59.90);
		
		if(livroFisico.aplicaDescontoDe10Porcento()) {
			System.out.println("Valor agora é: " + livroFisico.getValor());
		}
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Ebook");
		ebook.setValor(29.90);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(livroFisico);
		carrinho.adiciona(ebook);
		
		System.out.println("Total " + carrinho.getTotal());
	}
}
