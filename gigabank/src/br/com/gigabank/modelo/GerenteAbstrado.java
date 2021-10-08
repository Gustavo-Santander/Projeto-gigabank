package br.com.gigabank.modelo;

public class GerenteAbstrado extends FuncionarioAbstrado implements AcessoInterno {

	private String senha = "123mudar";

	private String login = "teste@gmail.com.br";
	
	
	@Override
	public double getBonificacao() {

		return getSalario() + 1500;
	}

	@Override
	public boolean AutenticarSenha(String senha) {
		
		if (this.senha.equals(senha) && this.login.equals(login))
			return true;
			
			return false;
	}

}
