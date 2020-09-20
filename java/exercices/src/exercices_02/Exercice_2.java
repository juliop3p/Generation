package exercices_02;

import java.util.Scanner;

public class Exercice_2 {
	/*
	 * 2. Faça um programa que entre com três números e coloque em ordem crescente.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1, num2, num3, aux;
		
		System.out.print("Digite o 1° número: ");
		num1 = scan.nextInt();
		
		System.out.print("Digite o 2° número: ");
		num2 = scan.nextInt();
		
		System.out.print("Digite o 3° número: ");
		num3 = scan.nextInt();
		
		if(num1 > num2) {
			aux = num1;
			num1 = num2;
			num2 = aux;
		} 
		
		if(num1 > num3) {
			aux = num1;
			num1 = num3;
			num3 = aux;
		}
		
		if(num2 > num3) {
			aux = num2;
			num2 = num3;
			num3 = aux;
		} 
		
		System.out.printf("Número 1: %d - Número 2: %d - Número 3: %d", num1, num2, num3);
		
		
		scan.close();
	}
}
