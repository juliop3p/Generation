package exercice_01;

public class Preguica extends Animal {
	
	public Preguica(String nome, int idade, String categoria, double peso) {
		super(nome, idade, categoria, peso);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Som Preguiça...");
	}

	@Override
	public void animalCorrendo() {
		System.out.println("Subindo em árvores...");
	}	
}
