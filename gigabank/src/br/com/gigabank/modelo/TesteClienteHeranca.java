package br.com.gigabank.modelo;

public class TesteClienteHeranca {

	public static void main(String[] args) {

		ClientePF cliente1 = new ClientePF();
		ClientePJ cliente2 = new ClientePJ();

		Endereco endCliente1 = new Endereco("Rua", "Emilio", "492", "Parque Fernanda", "São Paulo", "SP", "21000-000","");
		Endereco endCliente2 = new Endereco("Av", "Salvador", "", "Floriano", "520", "São Paulo", "SP", "20000-000");

		cliente1.setCPF("057.769.430-86");
		cliente1.setNome("Jose Das Couves");
		cliente1.setEndereco(endCliente1);
		cliente1.setDataNascimento("05/05/1995");
		cliente1.setProfissao("Agricultor");
		cliente1.setUniversitario(false);

		cliente2.setCNPJ("10.375.986/0001-38");
		cliente2.setNome("Pais e Filho JJA");
		cliente2.setNomeFanstasia("Pais e Filho Comercio EIRELI");
		cliente2.setEndereco(endCliente2);
		cliente2.setSegmento("Comercial");
		cliente2.setDataFundacao("01/01/2001");

		Conta conta1 = new Conta(123456, 447, cliente1);
		Conta conta2 = new Conta(55897, 334, cliente2);

		System.out.println(conta1.getTitular().getNome());
		System.out.println(conta2.getTitular().getNome());

	}

}