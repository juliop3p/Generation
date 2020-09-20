package POO_01;

public class Cliente {
	private String nome;
	private String rg;
	private String telefone;
	private String endere�o;
	
	public Cliente(String nome, String rg, String telefone, String endere�o) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.telefone = telefone;
		this.endere�o = endere�o;
	} 

	@Override
	public String toString() {
		return "Cliente { nome: " + nome + ", rg: " + rg + ", telefone: " + telefone + ", endere�o: " + endere�o + " }";
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

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	
}
