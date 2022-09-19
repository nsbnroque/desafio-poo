package br.com.gft.model;

import java.util.List;
import java.util.stream.Collectors;

public class Loja {
	private String nome;
	private String cnpj;
	private List<Livro> livros;
	private List<VideoGame> videoGames;
	
	public Loja() {}
	
	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<VideoGame> getVideoGames() {
		return videoGames;
	}

	public void setVideoGames(List<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}
	
	public void listaLivros() {
		if(livros.isEmpty()) {
			System.out.println("A loja não tem livros no seu estoque.");
		} else {
			String result = livros.stream().map(Livro::toString).collect(Collectors.joining("\n"));
			System.out.println("--------------------------------------------------------------------" + 
					"\nA loja " + this.getNome() + " possui estes livros para venda: \n" 
					 + result);
	        }
		}
	
	
	public void listaVideoGames() {
		if(videoGames.isEmpty()) {
			System.out.println("A loja não tem video games no seu estoque.");
		} else {
			String result = videoGames.stream().map(VideoGame::toString).collect(Collectors.joining("\n"));
			System.out.println("--------------------------------------------------------------------" + 
								"\nA loja " + this.getNome() + " possui estes video-games para venda: \n" 
								 + result);
		}
	}
	
	public double calculaPatrimonio() {
		
		double patrimonioLivros = livros.stream()
				  .mapToDouble(x -> x.getPreco()*x.getQtd())
				  .reduce(0, Double::sum);
		
		double patrimonioGames = videoGames.stream()
				.mapToDouble(x -> x.getPreco()*x.getQtd())
				.reduce(0, Double::sum);
		
		double patrimonio = patrimonioLivros + patrimonioGames;
		System.out.println("O patrimonio da loja " + this.getNome() + " é de: " + patrimonio);
		return patrimonio;
	}


	

}
