package br.com.gigabank.modelo;

public class ControleBonificacao {
	
	
	private static double  soma;
	
	/*
	 * public void Registrar(Gerente g) {
	 * 
	 * double bn = g.getBonificacao(); this.soma += bn;
	 * System.out.println(this.soma); }
	 * 
	 * public void Registrar(Diretor d) {
	 * 
	 * double bn = d.getBonificacao(); this.soma += bn;
	 * 
	 * System.out.println(this.soma);
	 * 
	 * }
	 */
	public double getSoma() {
		return soma;
	}
	public void Registrar(Funcionario f) {
		 
		 double bn = f.getBonificacao(); this.soma += bn;
		 System.out.println(this.getSoma()); 
		 
	}
}



