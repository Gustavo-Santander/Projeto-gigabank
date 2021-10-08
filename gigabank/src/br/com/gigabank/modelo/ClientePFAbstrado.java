package br.com.gigabank.modelo;

public class ClientePFAbstrado extends ClienteAbstrado {

	private String nomeSocial;
	private String CPF;
	private String profissao;
	private String dataNascimento;
	private String RG;
	private boolean universitario;

	public ClientePFAbstrado() {
		super();
	}

	public ClientePFAbstrado(String nomeSocial, String cPF, String profissao, String dataNascimento, String rG,
			boolean universitario) {
		super();
		this.nomeSocial = nomeSocial;
		CPF = cPF;
		this.profissao = profissao;
		this.dataNascimento = dataNascimento;
		RG = rG;
		this.universitario = universitario;
	}

	@Override
	public boolean AutenticarSenha(String senha) {

		return false;

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

	public String getDatanascimento() {
		return dataNascimento;
	}

	public void setDatanascimento(String datanascimento) {
		this.dataNascimento = datanascimento;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public String getNomeSocial() {
		return nomeSocial;
	}

	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public boolean isUniversitario() {
		return universitario;
	}

	public void setUniversitario(boolean universitario) {
		this.universitario = universitario;
	}

}
