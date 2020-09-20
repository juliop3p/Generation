package lesson15;

public class TestePolimorfismo {

	public static void main(String[] args) {
		PessoaFisica fisica = new PessoaFisica("Juliana", 1, 123456789L);
		PessoaJuridica juridica = new PessoaJuridica("Cristiano", 2, 987654321L);
		Pessoa[] pessoas = new Pessoa[2];
		
		pessoas[0] = fisica;
		pessoas[1] = juridica;
		
		for(Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getNome());
		}

	}

}
