package exercicesPOO_02;

public class TesteOperario {

	public static void main(String[] args) {
		Operario operarioA = new Operario("Godofredo", "Rua das maravilhas", "21 98754-8551", 3000, 15);

		System.out.printf("O operario %s recebeu %.2f de comissão", operarioA.getNome(), operarioA.salarioOperario());
	}

}
