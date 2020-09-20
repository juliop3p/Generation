package exercicesPOO_02;

public class Vendedor extends Pessoa {
/*
 * 6. Implemente a classe Vendedor como subclasse da classe Pessoa. 
 * Um determinado vendedor tem como atributos da classe Pessoa e 
 * tamb�m os atributos pr�prios como valorVendas (correspondente 
 * ao valor monet�rio dos artigos vendidos) e o atributo comissao 
 * (porcentagem do valorVendas que ser� adicionado ao vencimento base do Vendedor).
 */
	private double valorVendas;
	private double comissao;
	
	public Vendedor(double valorVendas, double comissao) {
		super();
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}

	public Vendedor(String nome, double valorVendas, double comissao) {
		super(nome);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}

	public Vendedor(String nome, String endere�o, String telefone, double valorVendas, double comissao) {
		super(nome, endere�o, telefone);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}
	
	public double salarioVendedor() {
		return valorVendas + (valorVendas / 100 * comissao);
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
}
