package br.com.casadocodigo.livraria.produtos;

import livraria.Autor;

public class Ebook extends Livro implements Promocional {
	private String waterMark;

	public Ebook(Autor autor) {
		super(autor);
	}
	
	public Ebook() {
		super();
	}
	
	public String getWaterMark() {
		return waterMark;
	}
	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}
	
	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		if (porcentagem > 0.15) {
			return false;
		}
		
		double desconto = this.getValor() * porcentagem;
		this.setValor(getValor() - desconto);
		
		System.out.println("Aplicando desconto ebook");
		
		return true;
	}
}
