package POO_02;

public class AviaoTest {
	/*
	 * 2) Crie uma classe avi�o e apresente os atributos e m�todos 
	 * referentes esta classe, em seguida crie um objeto avi�o, defina 
	 * as inst�ncias deste objeto e apresente as informa��es deste objeto no console.
	 */
	public static void main(String[] args) {
		Aviao aviaoA = new Aviao("Boeing 737", "GOL", 235, true, false); 

		System.out.println(aviaoA.toString());
	}

}
