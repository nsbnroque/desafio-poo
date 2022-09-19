package br.com.gft.model;

import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem {
	private List<String> habilidade;

	public Guerreiro() {
		super();
	}

	public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
	}

	public List<String> getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(List<String> habilidade) {
		this.habilidade = habilidade;
	}
	
	@Override
	public void lvlUp() {
		super.setLevel(super.getLevel()+1);
		super.setVida(getVida()+200);
		super.setMana(getMana()+100);
		super.setInteligencia(getInteligencia()+1);
		super.setForca(getForca()+2);
	}
	
	public int attack() {
		Random random = new Random();
		return super.getForca()*super.getLevel() + random.nextInt(300);
	}
	
	public void aprenderHabilidade(String novaHabilidade) {
		habilidade.add(novaHabilidade);
	}
	
	
}
