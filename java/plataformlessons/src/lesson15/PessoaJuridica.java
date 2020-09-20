package lesson15;

public class PessoaJuridica extends Pessoa {
	private Long cnpj;

	public PessoaJuridica(String nome, int matricula, Long cnpj) {
		super(nome, matricula);
		this.cnpj = cnpj;
	}

	public Long getCnpj() {
		return cnpj;
	}

	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getNome() {
		return "Pessoa Jurídica: " + super.getNome() + " - CNPJ: " + this.getCnpj();
	}
}
