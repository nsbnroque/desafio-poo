package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class VideoGame extends Produto implements Imposto {
	private String marca;
	private String modelo;
	private boolean isUsado;
		
	public VideoGame() {}

	public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}

	@Override
	public double calculaImposto() {
		if(isUsado) {
			double imposto = 0.25*super.getPreco();
			System.out.println("Imposto "+ super.getNome() +" "+ this.getModelo()+ " usado, R$ "+ imposto + ".");
			return imposto;
		} else {
			double imposto = 0.45*super.getPreco();
			System.out.println("Imposto "+ super.getNome() + " " +this.getModelo()+ ", R$ "+ imposto + ".");
			return imposto;
		}}
	
	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public boolean isUsado() {
		return isUsado;
	}



	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}

	@Override
	public String toString() {
		return "Video-Game: " + super.getNome() + " " + modelo + ", preço: " + super.getPreco() + 
				" , quantidade: " + super.getQtd() + " em estoque." ;
	}





}
