package br.com.gigabank.modelo;

public class TesteReferencia {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setNome("Maria");
		g1.AutenticarSenha("123456");
		g1.setSalario(3000.0);

		ControleBonificacao controle = new ControleBonificacao();

		Diretor d1 = new Diretor();
		d1.setNome("Carlos");
		d1.setSalario(2000.0);

		controle.Registrar(g1);
		controle.Registrar(d1);

		// polimorfismo
		/*
		 * Funcionario g2 =new Gerente(); g2.setNome("Andre"); g2.getBonificacao();
		 * System.out.println(g2.getNome());
		 */

	}

}
