package br.com.gft.model;

import java.util.List;
import java.util.Random;

public class Mago extends Personagem{
	private List<String> magia;

	public Mago() {
		super();
	}

	public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
		
	}

	public List<String> getMagia() {
		return magia;
	}

	public void setMagia(List<String> magia) {
		this.magia = magia;
	}
	
	
	@Override
	public void lvlUp() {
		super.setLevel(super.getLevel()+1);
		super.setVida(getVida()+100);
		super.setMana(getMana()+200);
		super.setInteligencia(getInteligencia()+2);
		super.setForca(getForca()+1);
	}
	
	public int attack() {
		Random random = new Random();
		return super.getInteligencia ()*super.getLevel() + random.nextInt(300);
	}
	
	public void aprenderMagia(String novaMagia) {
		magia.add(novaMagia);
	}
	
	

}
