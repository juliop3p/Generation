package aplicacao;

import entidades.Aluno;
import entidades.Pessoa;
import entidades.Professor;

public class Cadastro {
	public static void main(String[] args) {
		
		System.out.println("SISTEMA DE CADASTRO:");
		
		Pessoa fulano = new Pessoa("João");
		Pessoa ciclano = new Pessoa("Maria", 'F', 1970);
		Aluno alunoAtual = new Aluno("Josefina", "9A", new int[3]);
		Pessoa pessoaAtual = new Pessoa("Malaquias");
		
		Professor novoProfessor = new Professor("Luiza", "Modulo II");
		
		System.out.println("Professor(a): " + novoProfessor.getNome() + " da Turma: " + novoProfessor.getMateriaLecionada());
		
	}
}