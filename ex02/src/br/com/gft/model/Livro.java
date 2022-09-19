package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class Livro extends Produto implements Imposto{
	private String autor;
	private String tema;
	private int qtdPag;
	
	public Livro() {}
	
	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		super(nome,preco,qtd);
		this.autor = autor;
		this.tema = tema;
		this.qtdPag = qtdPag;
	}
	
	@Override
	public double calculaImposto() {
		if(tema == "educativo") {
			System.out.println("Livro educativo não tem imposto: " + this.getNome());
			return 0;
		}else {
			double imposto = 0.1*super.getPreco();
			System.out.println("R$ "+ imposto + " de impostos sobre o livro " + super.getNome() + ".");
			return imposto;
		}}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public int getQtdPag() {
		return qtdPag;
	}
	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}

	@Override
	public String toString() {
		return "Título: " + super.getNome() + ", preço: " + super.getPreco() + 
				" , quantidade: " + super.getQtd() + " em estoque." ;
	}
	
	

}
