package br.com.gigabank.modelo;

public class Gerente extends Funcionario {

	private String senha = "123mudar";

	public double getBonificacao() {
		
		return getSalario() * 0.15 + 1000.0;
		
	}
	
	
	public Boolean AutenticarSenha(String senha) {

		if (this.senha.equals(senha))
			return true;
		else
			return false;

	}

	public boolean MudarSenha(String senhaAntiga, String senhaNova) {
		if (this.senha.equals(senhaAntiga)) {
			this.senha = senhaNova;
			return true;
		}
		return false;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
