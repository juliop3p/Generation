package exercices_02;

import java.util.Scanner;

public class Exercice_1 {
	/*
	 * 1. Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.print("Digite o 1� numero: ");
		num1 = scan.nextInt();
		
		System.out.print("Digite o 2� numero: ");
		num2 = scan.nextInt();
		
		System.out.print("Digite o 3� numero: ");
		num3 = scan.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("\nO n�mero 1 � o maior!");
		} else if(num2 > num1 && num2 > num3) {
			System.out.println("\nO n�mero 2 � o maior!");
		} else {
			System.out.println("\nO n�mero 3 � o maior!");
		}
		
		scan.close();
	}

}
