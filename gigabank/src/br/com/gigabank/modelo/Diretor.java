package br.com.gigabank.modelo;

public class Diretor extends Funcionario {
	
public double getBonificacao() {
	
	return getSalario() * 0.3 + 3000.0;
	
}

}
