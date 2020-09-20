package lesson05;

import java.util.Scanner;

public class RepetionWhile {
	
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int idade;
		
		System.out.println("Entre com sua idade: ");
		idade = scanf.nextInt();
		
		while(idade >= 1) {
			System.out.printf("\nSua idade: %d", idade);
			
			if(idade >= 18) {
				System.out.println("\nVocê é de maior...");
			} else {
				System.out.println("\nVocê é de menor...");
			}
			
			System.out.println("\nEntre com sua idade: ");
			idade = scanf.nextInt();
		}
		
		scanf.close();
	}
}
