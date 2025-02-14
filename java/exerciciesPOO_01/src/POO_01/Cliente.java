package POO_01;

public class Cliente {
	private String nome;
	private String rg;
	private String telefone;
	private String enderešo;
	
	public Cliente(String nome, String rg, String telefone, String enderešo) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.telefone = telefone;
		this.enderešo = enderešo;
	} 

	@Override
	public String toString() {
		return "Cliente { nome: " + nome + ", rg: " + rg + ", telefone: " + telefone + ", enderešo: " + enderešo + " }";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}
	
}
