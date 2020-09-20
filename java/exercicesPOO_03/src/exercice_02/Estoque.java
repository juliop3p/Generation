package exercice_02;

public class Estoque {
	private Long codItem;
	private String nomeItem;
	private int quantidade;
	private double valor;
	private double peso;
	
	public Estoque() {

	}
	
	public Estoque(Long codItem, String nomeItem, int quantidade, double valor, double peso) {
		this.codItem = codItem;
		this.nomeItem = nomeItem;
		this.quantidade = quantidade;
		this.valor = valor;
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Estoque { codItem: " + codItem + ", nomeItem: " + nomeItem + ", quantidade: " + quantidade + ", valor: "
				+ valor + ", peso: " + peso + " }";
	}

	public Long getCodItem() {
		return codItem;
	}

	public void setCodItem(Long codItem) {
		this.codItem = codItem;
	}

	public String getNomeItem() {
		return nomeItem;
	}

	public void setNomeItem(String nomeItem) {
		this.nomeItem = nomeItem;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}	
	
}
