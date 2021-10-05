package br.com.gigabank.modelo;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario("ze da silva", "661.637.490-49", 300.0);
		f1.setTipo(2);
		// System.out.println(f1.getBonus());

		Gerente g1 = new Gerente();
		g1.setNome("Gustavo Xavier");
		g1.setSalario(3000.0);

		if (g1.AutenticarSenha("123mudar"))
			System.out.println("Bem-Vindo(a) " + g1.getNome());
		else
			System.out.println("Verifique a senha!");

		if (g1.MudarSenha("123mudar", "1234"))
			System.out.println("Senha Alterada com Sucesso");
		else
			System.out.println("Senha nao Alterada com Sucesso");
		
		Diretor d1 = new Diretor();
		
		d1.setSalario(500.0);
		System.out.println(d1.getBonificacao());
		
		g1.setSalario(1000.0);
		System.out.println(g1.getBonificacao());
		
		
	}

}
