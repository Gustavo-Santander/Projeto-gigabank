package br.com.gigabank.modelo;

public class Diretor extends Funcionario {

	@Override
	public double getBonificacao() {

		// return getSalario() * 0.10 + 1500.0;
		return super.getBonificacao() + 1500.0;
	}

	public double VerSalario() {
		return this.salario;
	}

}
