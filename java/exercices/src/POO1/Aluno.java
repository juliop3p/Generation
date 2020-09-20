package POO1;

public class Aluno {
	String nome;
	char sexo;
	double n1, n2, n3, n4;
	
	@Override
	public String toString() {
		return "Média [nome=" + nome + ", sexo=" + sexo + ", nota 1 = " + n1 + ", nota 2= " + n2 + ", nota 3= " + n3 + ", nota 4= " + n4
				+ " media: " + this.calculaMedia() + "]";
	}

	public Aluno(String nome, char sexo, double n1, double n2, double n3, double n4) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.n4 = n4;
	}



	public double calculaMedia() {
		return (n1 + n2 + n3 + n4) / 4;
	}
}
