package br.com.gigabank.modelo;

public abstract class ContaAbstrada {

	private int numero;
	private int agencia;
	protected double saldo;
	private Cliente titular;

	private static int total;

	public ContaAbstrada() {
	}

	public ContaAbstrada(int numero, int agencia) {
		this.numero = numero;
		this.agencia = agencia;

	}

	public ContaAbstrada(int numero, int agencia, Cliente titular) {
		ContaAbstrada.total++;
		System.out.println("O total de Contas e :" + total);
		this.numero = numero;
		this.agencia = agencia;
		this.titular = titular;
	}

	public void depositar(double valor) {
		if (valor > 0)
			this.saldo += valor;
		return;
	}

	public abstract boolean sacar(double valor);

	public abstract  boolean transferir(double valor, ContaAbstrada destino);
	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return total;
	}

}
