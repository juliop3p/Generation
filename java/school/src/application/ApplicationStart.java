package application;

import java.util.Scanner;

import entities.Aluno;

public class ApplicationStart {

	public static void main(String[] args) {
		
		Scanner scanf = new Scanner(System.in);
		Aluno alunoA = new Aluno();
		
		double mediaEscola;
		
		
		System.out.println("SISTEMA DE CONTROLE ESCOLA EM JAVA - POO");
		
		System.out.print("Digite seu nome: ");
		alunoA.nome = scanf.next().toUpperCase();
		
		System.out.print("Digite seu sexo [M/F]: ");
		alunoA.sexo = scanf.next().toUpperCase().charAt(0);
		
		for(int i=0; i<alunoA.notas.length; i++) {
			System.out.printf("Digite a %d° nota: ", (i+1));
			alunoA.notas[i] = scanf.nextDouble();
		}
		
		System.out.print("\nDigite a média da escola: ");
		mediaEscola = scanf.nextDouble();
		
		System.out.println("\n\n### RESULTADO FINAL ###");
		
		System.out.println(alunoA.toString());
		alunoA.aprovadoOuReprovado(alunoA.calculaMedia(), mediaEscola);
		
		scanf.close();
	}

}
