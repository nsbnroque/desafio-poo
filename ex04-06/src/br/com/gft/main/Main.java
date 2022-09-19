package br.com.gft.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

import br.com.gft.model.*;

public class Main {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa("João",15));
		pessoas.add(new Pessoa("Leandro",21));
		pessoas.add(new Pessoa("Paulo",17));
		pessoas.add(new Pessoa("Jessica",18));
		
		String maxIdade = pessoas.stream()
						.max(Comparator.comparing(Pessoa::getIdade))
						.get().getNome();

		System.out.println(maxIdade);
		
		System.out.println(pessoas.size());
		
		pessoas.removeIf(x -> x.getIdade()<18);
		
		System.out.println(pessoas.size());
		
		String filtro = "Jessica";
		
		try {
		
		Pessoa pessoa = pessoas.stream().filter(x -> filtro.equals(x.getNome()))
		.findAny().get();
		
		System.out.println(pessoa.getIdade());
		} catch (NoSuchElementException e) {
			System.out.println("A pessoa " + filtro + " não está na lista.");
		}
		
		
	}

}
