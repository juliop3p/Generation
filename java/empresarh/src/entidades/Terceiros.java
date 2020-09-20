package entidades;

public class Terceiros extends Funcionario {
	private double horasAdicionais;
	
	// Construtores	
	public Terceiros() {

	}
	
	public Terceiros(String nome, double horasAdicionais) {
		super(nome);
		this.horasAdicionais = horasAdicionais;
	}

	public Terceiros(String nome, int horasTrabalhadas, double valorPorHora, double horasAdicionais) {
		super(nome, horasTrabalhadas, valorPorHora);
		this.horasAdicionais = horasAdicionais;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + (horasAdicionais * this.getValorPorHora());
	}

	// Get's e Set's
	public double getHorasAdicionais() {
		return horasAdicionais;
	}

	public void setHorasAdicionais(double horasAdicionais) {
		this.horasAdicionais = horasAdicionais;
	}
	
}
