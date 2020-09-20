package entidades;

public class Aluno extends Pessoa {
	private String turma;
	private int[] notas = new int[2];
	
	public Aluno(String nome, String turma, int[] notas) {
		super(nome);
		this.turma = turma;
		this.notas = notas;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public int[] getNotas() {
		return notas;
	}

	public void setNotas(int[] notas) {
		this.notas = notas;
	}
	
}
