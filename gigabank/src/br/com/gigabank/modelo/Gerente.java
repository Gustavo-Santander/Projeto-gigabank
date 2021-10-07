package br.com.gigabank.modelo;

public class Gerente extends Funcionario {

	private String senha = "123mudar";

	private String login = "teste@gmail.com.br";
	
   
	public Boolean AutenticarSenha(String senha) {

		if (this.senha.equals(senha))
			return true;
		else
			return false;

	}
	 
	public boolean AutenticarSenha(String senha, String  login) {
		
		if (this.senha.equals(senha) && this.login.equals(login))
			return true;
			
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
	 @Override
	public double getBonificacao() {
		return super.getBonificacao() + 500.0;

	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

}
