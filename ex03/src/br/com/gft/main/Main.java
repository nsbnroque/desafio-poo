package br.com.gft.main;

import br.com.gft.model.*;

public class Main {

	public static void main(String[] args) {
		Mago mago = new Mago();
		Guerreiro guerreiro = new Guerreiro();
		
		System.out.println(mago.attack());
		System.out.println(mago.attack());
		System.out.println(guerreiro.attack());
		System.out.println(guerreiro.attack());
		
	
		
		System.out.println(Personagem.getQtdPersonagens());
		
		
		

	}

}
