package exercices_03;

import java.util.Scanner;

public class Exercice_6 {
	/*
	 * Escrever um programa que receba v�rios n�meros inteiros no teclado. 
	 * E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair 
	 * digitar 0(zero).(DO...WHILE)
	 */
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int numero = 0, soma = 0, total = 0, media;
		
		do {	
			System.out.print("Digite um n�mero: ");
			numero = scanf.nextInt();
			
			if(numero != 0 && numero % 3 == 0) {
				soma += numero;
				total++;
			}
			
		} while(numero != 0);
		
		media = soma / (total == 0 ? 1 : total);
		
		System.out.printf("\nA m�dia dos n�meros m�ltiplos de 3 �: %d", media);

		scanf.close();
	}
}
