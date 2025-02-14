package entidades;

import java.util.List;

public class ContaPoupanca extends ContaBancaria {
	private double juros = 0.02;
	private double corrMonetaria;
	private int mesAniversario;
	
	public ContaPoupanca() {}
	
	public ContaPoupanca(int numeroDaConta, double saldo, List<Integer> transacoes) {
		super(numeroDaConta, saldo, transacoes);
	}
	
	public ContaPoupanca(double juros, double corrMonetaria, int mesAniversario) {
		this.juros = juros;
		this.corrMonetaria = corrMonetaria;
		this.mesAniversario = mesAniversario;
	}
	
	public double getJuros() {
		return juros;
	}
	
	public void setJuros(double juros) {
		this.juros = juros;
	}
	
	public double getCorrMonetaria() {
		return corrMonetaria;
	}
	
	public void setCorrMonetaria(double corrMonetaria) {
		this.corrMonetaria = corrMonetaria;
	}
	
	public int getMesAniversario() {
		return mesAniversario;
	}
	
	public void setMesAniversario(int mesAniversario) {
		this.mesAniversario = mesAniversario;
	}
	
	public void aniversarioMes() {
		this.credite(getSaldo()*(this.juros));
		System.out.println("Anivers�rio da sua conta poupan�a.");
	}
}
