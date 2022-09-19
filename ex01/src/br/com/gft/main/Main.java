package br.com.gft.main;

import br.com.gft.model.Veiculo;

public class Main {

	public static void main(String[] args) {
		Veiculo carro = new Veiculo();
		System.out.println(carro.isLigado());
		
		carro.ligar();
		carro.abastecer(20);
		carro.acelerar();
		
		System.out.println(carro.isLigado() + "\nvelocidade: " + carro.getVelocidade() + " tanque: " + carro.getLitrosCombustivel());
		
		carro.frear();
		carro.desligar();
		
		System.out.println(carro.isLigado() + "\nvelocidade: " + carro.getVelocidade() + " tanque: " + carro.getLitrosCombustivel());
		
		System.out.println(carro.getCor());
		carro.pintar("preto");
		System.out.println(carro.getCor());
		
		carro.pintar("amarelo");
		System.out.println(carro.getCor());
		
		carro.ligar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		
		System.out.print("\nvelocidade: " + carro.getVelocidade());
		carro.frear();
		System.out.print("\nvelocidade: " + carro.getVelocidade());
		carro.frear();
		System.out.print("\nvelocidade: " + carro.getVelocidade());
		
		
		

	}

}
