package lesson03;

import java.util.Scanner;

public class ConditionalIfElse {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int idade;
		String nome;
		
		System.out.print("Entre com sua idade: ");
		idade = scanf.nextInt();
		
		scanf.nextLine();
		
		System.out.println("Entre com o seu nome: ");
		nome = scanf.nextLine();
		
		System.out.printf("\nSeu nome: %s ", nome);
		System.out.printf("\nSua idade: %d", idade);
		
		if(idade >= 18) {
			System.out.println("\nVocê é maior de idade...");
		} else if(idade>=1 && idade < 18) {
			System.out.println("\nVocê é menor de idade...");
		} else {
			System.out.println("\nVocê entrou com uma idade inválida...");
		}
		

		scanf.close();
	}

}
