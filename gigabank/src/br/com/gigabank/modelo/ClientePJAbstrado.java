package br.com.gigabank.modelo;

public  class ClientePJAbstrado extends ClienteAbstrado {

	private String CNPJ;
	private String segmento;
	private String nomeFanstasia;
	private String dataFundacao;

	public ClientePJAbstrado() {
		super();
	}

	public ClientePJAbstrado(String cNPJ, String segmento, String nomeFanstasia, String dataFundacao) {
		super();
		CNPJ = cNPJ;
		this.segmento = segmento;
		this.nomeFanstasia = nomeFanstasia;
		this.dataFundacao = dataFundacao;
	}
	
	@Override
	public boolean AutenticarSenha(String senha) {

		return false;

	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getSegmento() {
		return segmento;
	}

	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

	public String getNomeFanstasia() {
		return nomeFanstasia;
	}

	public void setNomeFanstasia(String nomeFanstasia) {
		this.nomeFanstasia = nomeFanstasia;
	}

	public String getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(String dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

}
