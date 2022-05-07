package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.exception.AutorNuloExceptionTeste;
import livraria.Autor;

public abstract class Livro implements Produto {
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;
	
	public Livro(Autor autor) {
		if(autor == null) {
			throw new AutorNuloExceptionTeste("O autor do livro não pode ser nulo");
		}
//		this();
		this.autor = autor;
	}
	
	public Livro() {
		this.isbn = "000-00-00000-00-0";
	}
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public double getValor() {
		return valor;
	}



	public void setValor(double valor) {
		this.valor = valor;
	}



	public String getIsbn() {
		return isbn;
	}



	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}



	public Autor getAutor() {
		return autor;
	}



	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public void mostrarDetalhes() {
		String mensagem = "Mostrando detalhes do livro ";
		System.out.println(mensagem);
		System.out.println(nome);
		System.out.println(descricao);
		System.out.println(valor);
		System.out.println(isbn);
		if (this.temAutor()) {
			autor.mostrarDetalhes();
		}
		
		System.out.println("--");
	}

	boolean temAutor() {
		return this.autor != null;
	}
	
	public abstract boolean aplicaDescontoDe(double porcentagem);
}
