package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.LivroFisico;
import livraria.Autor;

public class RegrasDeDesconto {
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		autor.setEmail("rodrigo.turini@caelum.com.br");
		autor.setCpf("123.456.789.10");
		
		Livro livro = new LivroFisico(autor);
		livro.setValor(59.90);
		
		System.out.println("Valor atual: " + livro.getValor());
		
		if (!livro.aplicaDescontoDe(0.3)) {
			System.out.println("Desconto não pode ser maior do que 30%");
		} else {
			System.out.println("Valor com desconto: " + livro.getValor());
		}
		
		Autor autorEbook = new Autor();
		autorEbook.setNome("Rodrigo Turini");
		autorEbook.setEmail("rodrigo.turini@caelum.com.br");
		autorEbook.setCpf("123.456.789.10");
		
		Ebook ebook = new Ebook(autor);
		ebook.setValor(59.90);
		
		System.out.println("Valor atual: " + ebook.getValor());
		
		if (!ebook.aplicaDescontoDe(0.15)) {
			System.out.println("Desconto não pode ser maior do que 15%");
		} else {
			System.out.println("Valor com desconto: " + ebook.getValor());
		}
	}
}
