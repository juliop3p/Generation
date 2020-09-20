package POO_02;

public class Aviao {
	private String modelo;
	private String compania;
	private int quantidadeDeAssentos;
	private boolean temPrimeiraClasse;
	private boolean particular;
	
	public Aviao(String modelo, String compania, int quantidadeDeAssentos, boolean temPrimeiraClasse,
			boolean particular) {
		super();
		this.modelo = modelo;
		this.compania = compania;
		this.quantidadeDeAssentos = quantidadeDeAssentos;
		this.temPrimeiraClasse = temPrimeiraClasse;
		this.particular = particular;
	}

	@Override
	public String toString() {
		return "Aviao { modelo: " + modelo + ", compania: " + compania + ", quantidadeDeAssentos: "
				+ quantidadeDeAssentos + ", temPrimeiraClasse: " + temPrimeiraClasse + ", particular: " + particular
				+ " }";
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public int getQuantidadeDeAssentos() {
		return quantidadeDeAssentos;
	}

	public void setQuantidadeDeAssentos(int quantidadeDeAssentos) {
		this.quantidadeDeAssentos = quantidadeDeAssentos;
	}

	public boolean isTemPrimeiraClasse() {
		return temPrimeiraClasse;
	}

	public void setTemPrimeiraClasse(boolean temPrimeiraClasse) {
		this.temPrimeiraClasse = temPrimeiraClasse;
	}

	public boolean isParticular() {
		return particular;
	}

	public void setParticular(boolean particular) {
		this.particular = particular;
	}	
	
}
