package exercices_04;

import java.util.Scanner;

public class Exercice_3 {
	/*
	 *  3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
	 */
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		final int LINHA = 3;
		final int COLUNA = 3;
		int[][] matriz = new int[LINHA][COLUNA];
		int maior = 0;
		
		for(int i=0; i<LINHA; i++) {
			for(int j=0; j<COLUNA; j++) {
				System.out.printf("Digite o valor [%d][%d]: ", (i+1), (j+1));
				matriz[i][j] = scanf.nextInt();
			}
		}
		
		for(int i=0; i<LINHA; i++) {
			for(int j=0; j<COLUNA; j++) {
				maior += matriz[i][j] > 10 ? 1 : 0;
			}
		}
		
		for(int i=0; i<LINHA; i++) {
			for(int j=0; j<COLUNA; j++) {
				System.out.printf("\t %d", matriz[i][j]);
			}
			System.out.println();
		}
		
		System.out.printf(maior > 1 ? "\nHouve %d valores maior que 10" : "\nHouve %d valor maior que 10", maior);
		

		scanf.close();
	}
}
