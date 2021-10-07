package br.com.gigabank.modelo;

public class ContaCorrente extends Conta {

	private double limite;
	private boolean especial;

	public ContaCorrente() {

	}

	public ContaCorrente(double limite, boolean especial) {
		super();
		this.limite = limite;
		this.especial = especial;
	}

	@Override
	public boolean sacar(double valor) {

		if (this.limite +  getSaldo()  >= valor && valor > 0)
		{
		this.saldo  -= valor;
		super.sacar(valor);
		return true;
		}
		return false;
	}
		public boolean sacar2(double valor) {

			if (this.limite +  getSaldo()  >= valor && valor > 0)
			{
			this.saldo  -= valor;
			super.sacar(valor);
			return true;
			}
			return false;
			
	}

	@Override
	public boolean transferir(double valor, Conta destino) {

		if (this.limite +  getSaldo()  >= valor && valor > 0)
		{
			this.saldo  -= valor;
			super.transferir(valor, destino);
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
