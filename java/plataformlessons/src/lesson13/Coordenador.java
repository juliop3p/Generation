package lesson13;

public class Coordenador extends Pessoa {
	private String cursoCoordenado;
	
	public Coordenador(String nome, int matricula, String cursoCoordenador) {
		super(nome, matricula);
		this.cursoCoordenado = cursoCoordenador;
	}

	public String getCursoCoordenador() {
		return cursoCoordenado;
	}

	public void setCursoCoordenador(String cursoCoordenador) {
		this.cursoCoordenado = cursoCoordenador;
	}
	
}
