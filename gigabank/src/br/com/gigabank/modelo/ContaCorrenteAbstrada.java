package br.com.gigabank.modelo;

public  class ContaCorrenteAbstrada extends ContaAbstrada {

	private double limite;
	private boolean especial;

	public ContaCorrenteAbstrada() {

	}

	public ContaCorrenteAbstrada(double limite, boolean especial) {
		super();
		this.limite = limite;
		this.especial = especial;
	}
    @Override
	public boolean sacar(double valor) {

		if (this.limite + getSaldo() >= valor && valor > 0) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
    @Override
	public boolean transferir(double valor, ContaAbstrada destino) {

		if (this.limite + getSaldo() >= valor && valor > 0) {
			this.saldo -= valor;
			destino.depositar(valor);
			return true;
		}
		return false;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

}
