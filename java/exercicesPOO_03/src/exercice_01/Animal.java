package exercice_01;

public class Animal {
	private String nome;
	private int idade;
	private String categoria;
	private double peso;
	
	public Animal() {
	}

	public Animal(String nome, int idade, String categoria, double peso) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.categoria = categoria;
		this.peso = peso;
	}
	
	public void emitirSom() {
		System.out.println("Som animal...");
	}
	
	public void animalCorrendo() {
		System.out.println("Animal correndo...");
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}	
	
}
