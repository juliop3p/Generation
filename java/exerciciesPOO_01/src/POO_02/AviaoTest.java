package POO_02;

public class AviaoTest {
	/*
	 * 2) Crie uma classe avião e apresente os atributos e métodos 
	 * referentes esta classe, em seguida crie um objeto avião, defina 
	 * as instâncias deste objeto e apresente as informações deste objeto no console.
	 */
	public static void main(String[] args) {
		Aviao aviaoA = new Aviao("Boeing 737", "GOL", 235, true, false); 

		System.out.println(aviaoA.toString());
	}

}
