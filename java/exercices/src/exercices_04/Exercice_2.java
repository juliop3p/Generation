package exercices_04;

import java.util.Scanner;

public class Exercice_2 {
	/*
	 *  2- Faça um programa que receba 6 números inteiros e mostre: 
	 * 
	 *	• Os números pares digitados;  
	 *	• A soma dos números pares digitados; 
	 *	• Os números ímpares digitados; 
	 *	• A quantidade de números ímpares digitados.
     *
	 */
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		final int TAMANHO = 6;
		int[] vetor = new int[TAMANHO];
		int somaPares = 0, impares = 0;
		
		for(int i=0; i<TAMANHO; i++) {
			System.out.printf("Digite o %d° número: ", (i+1));
			vetor[i] = scanf.nextInt();
		}
		
		System.out.print("\n\nPARES: ");
		for(int i=0; i<TAMANHO; i++) {
			if(vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + " ");
				somaPares += vetor[i];
			}
		}
		
		System.out.print("\nIMPARES: ");
		for(int i=0; i<TAMANHO; i++) {
			if(vetor[i] % 2 != 0) {
				System.out.print(vetor[i] + " ");
				impares++;
			}
		}
		
		System.out.printf("\nA soma dos números pares ficou %d", somaPares);
		System.out.printf("\nA quantidade de números impares foi %d", impares);
		scanf.close();
	}
}
