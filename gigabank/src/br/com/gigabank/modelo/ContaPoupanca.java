package br.com.gigabank.modelo;

public class ContaPoupanca extends Conta {
	
	private String rendimento;

	public String getRendimento() {
		return rendimento;
	}

	public void setRendimento(String rendimento) {
		this.rendimento = rendimento;
	}

	public ContaPoupanca() {
		
	}
	
	public ContaPoupanca(String rendimento) {
		super();
		this.rendimento = rendimento;
	}

	

}
