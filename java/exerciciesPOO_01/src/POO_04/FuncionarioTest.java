package POO_04;

public class FuncionarioTest {
	/*
	 * 4) Crie uma classe funcionário e apresente os atributos e métodos 
	 * referentes esta classe, em seguida crie um objeto funcionário, 
	 * defina as instancias deste objeto e apresente as informações deste objeto no console.
	 */
	public static void main(String[] args) {
		Funcionario func1 = new Funcionario("Godofredo", 'M', 1, "T.I", 5000);
		
		System.out.println(func1.toString());
	}
}
