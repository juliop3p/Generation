package POO_03;

public class ProdutoEletronico {
	private String nome;
	private String descricao;
	private int quantidade;
	private double valor;
	private boolean novo;
	private boolean parcela;
	
	public ProdutoEletronico(String nome, String descricao, int quantidade, double valor, boolean novo,
			boolean parcela) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.valor = valor;
		this.novo = novo;
		this.parcela = parcela;
	}

	@Override
	public String toString() {
		return "ProdutoEletronico { nome: " + nome + ", descricao: " + descricao + ", quantidade: " + quantidade
				+ ", valor: " + valor + ", novo: " + novo + ", parcela: " + parcela + " }";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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

	public boolean isNovo() {
		return novo;
	}

	public void setNovo(boolean novo) {
		this.novo = novo;
	}

	public boolean isParcela() {
		return parcela;
	}

	public void setParcela(boolean parcela) {
		this.parcela = parcela;
	}
	
}
