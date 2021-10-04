package br.com.gigabank.modelo;

public class Cliente {

	private String nome;
	private String CPF;
	private String profissao;
	
	
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

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	

	public Cliente() {
	}

	public Cliente(String nome, String cPF, String profissao) {
		this.nome = nome;
		CPF = cPF;
		this.profissao = profissao;
	}

}
