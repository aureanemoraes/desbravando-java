package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.LivroFisico;
import livraria.Autor;

public class CadastroDeLivros {
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		autor.setEmail("rodrigo.turini@caelum.com.br");
		autor.setCpf("123.456.789.10");
		
		Livro livro = new LivroFisico(null);
		livro.setNome("Java 8 Pratico");
		livro.setDescricao("Novos recursos da linguagem");
		livro.setValor(59.90);
		livro.setIsbn("978-85-66250-46-6");
		
		livro.aplicaDescontoDe(0.1);
		livro.mostrarDetalhes();
		
		Ebook ebook = new Ebook();
		ebook.setNome("teste");
		ebook.mostrarDetalhes();
	}
}
