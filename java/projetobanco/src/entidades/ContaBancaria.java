package entidades;

import java.util.List;

public abstract class ContaBancaria {
	private int numeroDaConta;
	private double saldo;
	private List<Integer> transacoes;
	
	
	public ContaBancaria() {}

	public ContaBancaria(int numeroDaConta, double saldo, List<Integer> transacoes) {
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;
		this.transacoes = transacoes;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public List<Integer> getTransacoes() {
		return transacoes;
	}

	public void setTransacoes(List<Integer> transacoes) {

		this.transacoes = transacoes;
	}

	public void emiteExtrato() {
		System.out.printf("Seu Saldo é R$ %.2f\n" , this.saldo);
	}
	
	public void credite(double valorCreditado) {
		
		this.saldo += valorCreditado;
		System.out.printf("Valor %.2f creditado!\n", valorCreditado);

	}
	
	public void debite(double valorDebitado) {
		if(this.saldo > valorDebitado) {
			this.saldo -= valorDebitado;
			System.out.printf("Valor %.2f debitado!\n", valorDebitado);
		} else {
			System.out.println("Saldo insuficiente!");	
		}
	}
	
}
