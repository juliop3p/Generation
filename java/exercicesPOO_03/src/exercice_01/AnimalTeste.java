package exercice_01;

public class AnimalTeste {

	public static void main(String[] args) {
		Animal animal = new Animal("Elefante", 23, "Mamíferos", 6000);
		Cachorro cachorro = new Cachorro("Cachorro Bob", 10, "Mamíferos", 15);
		Preguica preguica = new Preguica("Preguiça", 23, "Mamíferos", 6.5);
		
		animal.emitirSom();
		animal.animalCorrendo();
		System.out.println("----------------------------------");
		cachorro.emitirSom();
		cachorro.animalCorrendo();
		System.out.println("----------------------------------");
		preguica.emitirSom();
		preguica.animalCorrendo();

	}

}
