package exercices_02;

import java.util.Scanner;

public class Exercice_4 {
	/*
	 *  4-	Faça um programa em que permita a entrada de um número qualquer e 
	 *  exiba se este número é par ou ímpar. Se for par exiba também a raiz 
	 *  quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		
		System.out.print("Digite um número: ");
		num = scan.nextInt();
		
		System.out.println("");
		
		if(num % 2 == 0) {
			System.out.printf("O número %d é Par e sua raiz quadrada é: %.1f", num, Math.sqrt(num));
		} else {
			System.out.printf("O número %d é Impar e elevado ao quadrada é: %.1f", num, Math.pow(num, 2));
		} 
		
		scan.close();
	}
}
