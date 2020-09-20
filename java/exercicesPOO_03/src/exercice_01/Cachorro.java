package exercice_01;

public class Cachorro extends Animal {
	
	public Cachorro(String nome, int idade, String categoria, double peso) {
		super(nome, idade, categoria, peso);
	}

	@Override
	public void emitirSom() {
		System.out.println("Som cachorro...");
	}

	@Override
	public void animalCorrendo() {
		System.out.println("Cachorro correndo...");
	}
	
}
