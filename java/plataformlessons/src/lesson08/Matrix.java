package lesson08;

import java.util.Scanner;

public class Matrix {
	
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		
		System.out.println("Matriz M[3][3]\n");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.printf("Insira o elemento M[%d][%d]: ", (i+1), (j+1));
				matriz[i][j] = scanf.nextInt();
			}
		}
		
		System.out.println("\nA Matriz ficou: \n");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.printf("\t %d  ", matriz[i][j]);
			}
			System.out.println("");
		}
		
		scanf.close();
	}
}
