package entidades;

import java.util.List;

public class ContaEmpresa extends ContaBancaria {
	private double limiteEmpresa;
	
	public ContaEmpresa() {}

	public ContaEmpresa(int numeroDaConta, double saldo, List<Integer> transacoes) {
		super(numeroDaConta, saldo, transacoes);
	}

	public double getLimiteEmpresa() {
		return limiteEmpresa;
	}

	public void setLimiteEmpresa(double limiteEmpresa) {
		this.limiteEmpresa = limiteEmpresa;
	}

	public void emprestimoEmpresarial(double valorEmprestimo) {
		this.limiteEmpresa = this.getSaldo() / 2;
		
		if(this.limiteEmpresa <= valorEmprestimo) {
			this.credite(valorEmprestimo);
			System.out.println("Emprestimo sucedido!");
		} else {
			System.out.println("Saldo insuficiente.");
		}

	}
}