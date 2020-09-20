package exercicesPOO_02;

public class Adminstrador extends Pessoa {

	private double ajudaDeCusto;

	public Adminstrador(double ajudaDeCusto) {
		super();
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public Adminstrador(String nome, double ajudaDeCusto) {
		super(nome);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public Adminstrador(String nome, String endereço, String telefone, double ajudaDeCusto) {
		super(nome, endereço, telefone);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
}
