package POO_01;

public class ClienteTest {
	/*
	 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes 
	 * esta classe, em seguida crie um objeto cliente, defina as instancias deste 
	 * objeto e apresente as informações deste objeto no console.
	 */
	public static void main(String[] args) {
		Cliente client1 = new Cliente("Marcio", "11 99999-9999", "99.985.789-25", "Rua das goiabas n°20");
		
		System.out.println(client1.toString());
	}

}
