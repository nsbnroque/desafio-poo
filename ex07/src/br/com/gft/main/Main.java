package br.com.gft.main;

import br.com.gft.model.*;

public class Main {
	public static void main(String[] args) {
		Gerente gerente = new Gerente("João",55, 10000.0);
		Supervisor supervisor = new Supervisor("Pedro",45,5000.0);
		Vendedor vendedor = new Vendedor("Paulo", 35, 3000.0);
		
		System.out.println(gerente.bonificacao());
		System.out.println(supervisor.bonificacao());
		System.out.println(vendedor.bonificacao());
	}

}
