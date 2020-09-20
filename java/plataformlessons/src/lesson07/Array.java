package lesson07;

import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		int[] arrayUm = { 12, 3, 5, 68, 9, 6, 73, 44, 456, 65, 321 };
		int[] arrayDois = { 43, 42, 4, 8, 55, 21, 2, 45 };
		
		float[] nota = new float[5];
		
		// Tamanho array
		if(arrayDois.length > 8) {
			System.out.println("Tamanho do Array Dois - Maior que 8!");
		} else {
			System.out.println("Tamanho do Array Dois - Menor que 8!");
		}
		
		System.out.println("\nTamanho do ArrayUm = " + arrayUm.length);
		
		// Utilização do for-each
		String[] cars = { "Volvo", "", "Ford", "Mazda" };
		
		for(String i : cars) {
			System.out.println(i);
		}
		
		// Populando um array
		for(int i=0; i<5; i++) {
			System.out.println("Entre com uma nota: ");
			nota[i] = scanf.nextFloat();
		}
		
		// Apresentando um Array
		for(int i=0; i<5; i++) {
			System.out.println("Nota " + (i + 1) + " = " + nota[i]);
		}
		
		scanf.close();
	}
}
