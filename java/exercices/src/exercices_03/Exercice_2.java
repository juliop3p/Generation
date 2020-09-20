package exercices_03;

import java.util.Scanner;

public class Exercice_2 {
	/*
	 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
     *
	 */
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int numero, pares = 0, impares = 0;
		
		for(int i=0; i<10; i++) {
			System.out.printf("Digite o %d� n�mero: ", i+1);
			numero = scanf.nextInt();
			
			if(numero % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		
		System.out.println(pares + " " + (pares > 1 ? "n�meros pares..." : "n�mero par"));
		System.out.println(impares + " " + (impares > 1 ? "n�meros impares..." : "n�mero impar"));
		
		scanf.close();
	}
}
