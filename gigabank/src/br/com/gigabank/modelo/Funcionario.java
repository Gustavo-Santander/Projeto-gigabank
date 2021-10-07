package br.com.gigabank.modelo;

public class Funcionario {

	private final double INDICE = 0.5;
	private String nome;
	private String CPF;
	protected double salario;
	private int tipo;
	// tipo 0 funcionario comum Tipo 2 = Gerente Tipo 3 = Diretor

	public Funcionario() {

	}

	public Funcionario(String nome, String cPF, double salario) {
		super();
		this.nome = nome;
		CPF = cPF;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	/*
	 * public double getBonus() { if (this.tipo == 0) return this.salario * 0.1;
	 * else if (this.tipo == 1) return this.salario * 0.15 + 1000.0; else if
	 * (this.tipo == 2) return this.salario * 0.3 + 3000.0; else return 0;
	 * 
	 * }
	 */

	public double getBonificacao() {
		return this.salario * INDICE;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return salario +getBonificacao();
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

}
