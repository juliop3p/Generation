package exercices_01;

import java.util.Scanner;

public class Exercice_4 {
	/*
	 * 4. Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a seguinte express�o: 
	 *	D = R + S / 2
	 *	, onde
	 *	R = (A + B)²
	 *	S = (B + C)²
     *
	 */
	public static void main(String[] args) {
		double A, B, C, D, R, S;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o A: ");
		A = scan.nextInt();
		
		System.out.print("Digite o B: ");
		B = scan.nextInt();
		
		System.out.print("Digite o C: ");
		C = scan.nextInt();
		
		R = Math.pow((A + B), 2);
		S = Math.pow((B + C), 2);
		D = (R + S) / 2; 

		System.out.println("O resultado da expressão é: " + D);
		
		scan.close();
	}
}
