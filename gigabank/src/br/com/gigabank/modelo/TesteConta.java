package br.com.gigabank.modelo;

public class TesteConta {
	public static void main(String[] args) {

		Cliente jose = new Cliente("Jose", "663.112.778-59", "Desenvolvedor");
		Cliente carlos = new Cliente("Carlos", "836.304.478-48", "Scrum Master");

		Conta c1 = new Conta();
		c1.setNumero(4567);
		c1.setTitular(jose);

		Conta c2 = new Conta(13334, 0224);
		// c2.saldo = 100.0;

		Conta c3 = new Conta(4455, 123, carlos);

		c3.depositar(200);
		System.out.println(c3.getSaldo());

		if (c3.sacar(100))
			System.out.println("Saque efetuado com sucesso");
		else
			System.out.println("Nao foi possivel sacar o valor verifique a sua conta?");

		c3.transferir(50, c1);

		System.out.println("Saldo Conta Destino " + c1.getTitular().getNome() + " : " + c1.getSaldo());
		System.out.println("Saldo Conta Origem  " + c3.getTitular().getNome() + " : " + c3.getSaldo());

		System.out.println(c3.getTotal());
		
		Conta c4  = new Conta(4567,1234,jose);
		System.out.println(c4.getTotal());
	}

}
