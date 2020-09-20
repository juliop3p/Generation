package exercices_03;

import java.util.Scanner;

public class Exercice_3 {
	/*
	 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos 
	 * de 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando 
	 * idade for =-99. (WHILE)
	 */
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int idade = 0, menos21 = 0, mais50 = 0;
		
		while(idade != -99) {
			System.out.print("Digite a sua idade: ");
			idade = scanf.nextInt();
			
			if(idade > 0 && idade < 21) {
				menos21++;
			} else if(idade > 50) {
				mais50++;
			}
			
		}
		
		System.out.printf("\n O sistema capturou %d pessoas com menos de 21 anos.", menos21);
		System.out.printf("\n O sistema capturou %d pessoas com mais de 50 anos.", mais50);
		
		scanf.close();
	}
}
