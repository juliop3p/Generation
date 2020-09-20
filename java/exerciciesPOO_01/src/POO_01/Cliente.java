package POO_01;

public class Cliente {
	private String nome;
	private String rg;
	private String telefone;
	private String endereço;
	
	public Cliente(String nome, String rg, String telefone, String endereço) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.telefone = telefone;
		this.endereço = endereço;
	} 

	@Override
	public String toString() {
		return "Cliente { nome: " + nome + ", rg: " + rg + ", telefone: " + telefone + ", endereço: " + endereço + " }";
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

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	
}
