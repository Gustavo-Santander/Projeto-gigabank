package br.com.gigabank.modelo;

public  class ContaPoupançaAbstrada extends ContaAbstrada {

	private String rendimento;

	@Override
	public boolean sacar(double valor) {

		if (this.saldo + getSaldo() >= valor && valor > 0) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	@Override
	public boolean transferir(double valor, ContaAbstrada destino) {

		if (this.saldo + getSaldo() >= valor && valor > 0) {
			this.saldo -= valor;
			destino.depositar(valor);
			return true;
		}
		return false;
	}

	public ContaPoupançaAbstrada() {
		super();
	}

	public ContaPoupançaAbstrada(String rendimento) {
		super();
		this.rendimento = rendimento;
	}

	public String getRendimento() {
		return rendimento;
	}

	public void setRendimento(String rendimento) {
		this.rendimento = rendimento;
	}

}
