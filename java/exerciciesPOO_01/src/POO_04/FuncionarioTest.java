package POO_04;

public class FuncionarioTest {
	/*
	 * 4) Crie uma classe funcion�rio e apresente os atributos e m�todos 
	 * referentes esta classe, em seguida crie um objeto funcion�rio, 
	 * defina as instancias deste objeto e apresente as informa��es deste objeto no console.
	 */
	public static void main(String[] args) {
		Funcionario func1 = new Funcionario("Godofredo", 'M', 1, "T.I", 5000);
		
		System.out.println(func1.toString());
	}
}
