package entidades;

import java.util.List;

public class ContaEspecial extends ContaCorrente {
	
	private double limite;

	public ContaEspecial() {}

	public ContaEspecial(int numeroDaConta, double saldo, List<Integer> transacoes) {
		super(numeroDaConta, saldo, transacoes);
	}

	public ContaEspecial(double limite) {
		super();
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void calculaJuros() {
		double juros = this.getSaldo() * 0.02;
		this.credite(this.getSaldo() + juros);
		
		System.out.printf("Você lucrou R$ %.2f com base na taxa Selic\n", juros);
	}

}
