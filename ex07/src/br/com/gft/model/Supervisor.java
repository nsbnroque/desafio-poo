package br.com.gft.model;

public class Supervisor extends Funcionario{
	@Override
	public double bonificacao(){
		return super.getSalario() + 5000;
	}

	public Supervisor(String nome, int idade,double salario) {
		super(nome,idade,salario);
		
	}
	
	
}
