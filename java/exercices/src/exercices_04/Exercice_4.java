package exercices_04;

import java.util.Scanner;

public class Exercice_4 {
	/*
	 *  4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. 
	 *  Ofereça ao usuário um menu de opções:
	 *  
	 *	(1) somar as duas matrizes 
	 *	(2) subtrair a primeira matriz da segunda 
	 *	(3) adicionar uma constante as duas matrizes
	 *	(4) imprimir as matrizes 
	 *	Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na 
	 *	terceira opção o valor da constante deve ser lido e o resultado da adição 
	 *	da constante deve ser armazenado na própria matriz.
     *
	 */
	final static int LINHA = 2;
	final static int COLUNA = 2;
	
	public static void mostraMatriz(double[][] matriz) {
		for(int i=0; i<LINHA; i++) {
			for(int j=0; j<COLUNA; j++) {
				System.out.printf("\t %.1f", matriz[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);

		double[][] matrizX = new double[LINHA][COLUNA];
		double[][] matrizY = new double[LINHA][COLUNA];
		double[][] matrizZ = new double[LINHA][COLUNA];
		
		int opcao;
		
		// Entrada		
		for(int i=0; i<LINHA; i++) {
			for(int j=0; j<COLUNA; j++) {
				System.out.printf("Digite o valor M1 [%d][%d]: ", (i+1), (j+1));
				matrizX[i][j] = scanf.nextInt();
				System.out.printf("Digite o valor M2 [%d][%d]: ", (i+1), (j+1));
				matrizY[i][j] = scanf.nextInt();
			}
		}
		
		System.out.println("\n1 - SOMAR | 2 - SUBTRAIR | 3 - ADICIONAS CONST | 4 - IMPRIMIR");
		opcao = scanf.nextInt();

		// Processamento
		if(opcao == 1 || opcao == 2) {
			for(int i=0; i<LINHA; i++) {
				for(int j=0; j<COLUNA; j++) {
					matrizZ[i][j] = (opcao == 1) ? (matrizX[i][j] + matrizY[i][j]) : (matrizX[i][j] - matrizY[i][j]);
				}
			}
		} else if(opcao == 3) {
			// Entrada
			System.out.print("\nDigite o valor da constante: ");
			final double CONSTANTE = scanf.nextDouble();
			
			for(int i=0; i<LINHA; i++) {
				for(int j=0; j<COLUNA; j++) {
					matrizX[i][j] += CONSTANTE;
					matrizY[i][j] += CONSTANTE;
				}
			}
		} 
		
		// Saída		
		if(opcao != 1 && opcao != 2) {
			System.out.println("Matriz 1");
			mostraMatriz(matrizX);
			System.out.println("Matriz 2");
			mostraMatriz(matrizY);			
		} else {
			System.out.printf("Matriz 3 (%s):\n", (opcao == 1) ? "soma" : "subtração");
			mostraMatriz(matrizZ);	
		}

		scanf.close();
	}
}
