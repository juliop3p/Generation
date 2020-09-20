package lesson13;

public class TestePessoa {
	public static void main(String[] args) {
		Pessoa jessica = new Pessoa("Jessica", 1);
		Funcionario pedro = new Funcionario("Pedro", 2, "T.I");
		Pessoa maria = new Funcionario("Maria", 3, "Informática - Desenvolvimento");
		Pessoa jose = new Coordenador("José", 4, "Ciência da computação");
		
		System.out.println(jessica.getNome() + " " + jessica.getMatricula());
		System.out.println(pedro.getNome() + " " + pedro.getMatricula() + " " + pedro.getDepartamento());
		System.out.println(maria.getNome() + " " + maria.getMatricula());
		System.out.println(jose.getNome() + " " + jose.getMatricula());
	}
}
