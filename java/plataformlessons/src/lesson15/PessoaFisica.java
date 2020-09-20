package lesson15;

public class PessoaFisica extends Pessoa {
	private Long cpf;

	public PessoaFisica(String nome, int matricula, Long cpf) {
		super(nome, matricula);
		this.cpf = cpf;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return "Pessoa física: " + super.getNome() + " - CPF: " + this.getCpf();
	}

}
