package playground;

import java.util.Scanner;

public class App_2 {
	public static void main(String[] args) {

		Scanner scanf = new Scanner(System.in);
		final int LINHA = 3;
		final int COLUNA = 3;
		int[][] matriz = new int[LINHA][COLUNA];
		int soma = 0;
		
		for(int i=0; i<LINHA; i++) {
			for(int j=0; j<COLUNA; j++) {
				System.out.printf("Digite o valor [%d][%d]: ", (i+1), (j+1));
				matriz[i][j] = scanf.nextInt();
				
				if(i == j)
				{
					soma = soma + matriz[i][j];
				}
			}
		}
		
		System.out.printf("A soma da diagonal principal é %d: ", soma);
		
		scanf.close();
	}
}
