package br.com.gft.model;

public class Gerente extends Funcionario{
	@Override
	public double bonificacao(){
		return super.getSalario() + 10000;
	}

	public Gerente(String nome, int idade,double salario) {
		super(nome,idade,salario);
	}

}
