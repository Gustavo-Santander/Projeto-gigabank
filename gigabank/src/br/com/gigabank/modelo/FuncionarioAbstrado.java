package br.com.gigabank.modelo;

public abstract class FuncionarioAbstrado {

	private String nome;
	private double salario;
	private int tipo;

	public FuncionarioAbstrado() {
		super();
	}

	public FuncionarioAbstrado(String nome, double salario, int tipo) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.tipo = tipo;
	}

	public abstract double getBonificacao();
		
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

}
