package exercicesPOO_02;

public class Operario extends Pessoa {
	
	private double valorProducao;
	private double comissao;
	
	public Operario(double valorProducao, double comissao) {
		super();
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public Operario(String nome, double valorProducao, double comissao) {
		super(nome);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public Operario(String nome, String endereço, String telefone, double valorProducao, double comissao) {
		super(nome, endereço, telefone);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	
	public double salarioOperario() {
		return valorProducao + (valorProducao / 100 * comissao);
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
}
