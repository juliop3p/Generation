package POO1;

public class AlunoTest {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Julio", 'M', 5, 6, 7, 8);
		Aluno aluno2 = new Aluno("Guilherme", 'M', 10, 9, 10, 9);
		Aluno aluno3 = new Aluno("Maria", 'F', 10, 9.5, 10, 7.5);
		Aluno aluno4 = new Aluno("Joaquina", 'F', 5, 4.5, 8, 8.5);
		
		System.out.println(aluno1.toString() + "\n");
		System.out.println(aluno2.toString() + "\n");
		System.out.println(aluno3.toString() + "\n");
		System.out.println(aluno4.toString() + "\n");

	}

}
