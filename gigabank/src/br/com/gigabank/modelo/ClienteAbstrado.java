package br.com.gigabank.modelo;

public abstract class ClienteAbstrado implements AcessoInterno {

	private String nome;
	private String email;
	private String telefone;
	private Endereco endereco;
	private String dataAberturaConta;
	private String risco;
	private double renda;

	public ClienteAbstrado() {
		super();
	}

	public ClienteAbstrado(String nome, String email, String telefone, Endereco endereco, String dataAberturaConta,
			String risco, double renda) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
		this.dataAberturaConta = dataAberturaConta;
		this.risco = risco;
		this.renda = renda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDataAberturaConta() {
		return dataAberturaConta;
	}

	public void setDataAberturaConta(String dataAberturaConta) {
		this.dataAberturaConta = dataAberturaConta;
	}

	public String getRisco() {
		return risco;
	}

	public void setRisco(String risco) {
		this.risco = risco;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
