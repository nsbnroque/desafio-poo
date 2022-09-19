package br.com.gft.model;

public class Vendedor extends Funcionario{
	@Override
	public double bonificacao(){
		return super.getSalario() + 3000;
	}

	public Vendedor(String nome, int idade,double salario) {
		super(nome,idade,salario);
	}

}
