package entidades;

public class Funcionario {
	private String nome;
	private int horasTrabalhadas;
	private double valorPorHora;
	
	
	// Construtores	
	public Funcionario() {

	}
	
	public Funcionario(String nome) {
		this.nome = nome;
	}
	
	public Funcionario(String nome, int horasTrabalhadas, double valorPorHora) {
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorPorHora = valorPorHora;
	}
	
	public double pagamento() {
		double pagamento = horasTrabalhadas * valorPorHora;
		return pagamento;
	}

	// Get's e Set's	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	
}
