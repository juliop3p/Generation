package exercice_01;

public class AnimalTeste {

	public static void main(String[] args) {
		Animal animal = new Animal("Elefante", 23, "Mam�feros", 6000);
		Cachorro cachorro = new Cachorro("Cachorro Bob", 10, "Mam�feros", 15);
		Preguica preguica = new Preguica("Pregui�a", 23, "Mam�feros", 6.5);
		
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
