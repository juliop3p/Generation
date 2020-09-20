package exercices_03;

import java.util.Scanner;

public class Exercice_2 {
	/*
	 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
     *
	 */
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int numero, pares = 0, impares = 0;
		
		for(int i=0; i<10; i++) {
			System.out.printf("Digite o %d° número: ", i+1);
			numero = scanf.nextInt();
			
			if(numero % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		
		System.out.println(pares + " " + (pares > 1 ? "números pares..." : "número par"));
		System.out.println(impares + " " + (impares > 1 ? "números impares..." : "número impar"));
		
		scanf.close();
	}
}
