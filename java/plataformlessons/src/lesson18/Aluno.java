package lesson18;

public class Aluno {
	private String nome;
	private String curso;
	private double nota;
	
	public Aluno(String nome, String curso, double nota) {
		this.nome = nome;
		this.curso = curso;
		this.nota = nota;
	}
	
	public String toString() {
		return this.nome;
	}
}
