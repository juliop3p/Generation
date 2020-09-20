package lesson06;

import java.util.Scanner;

public class RepetionDoWhile {
	
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int idade;
		
		System.out.print("\nEntre com sua idade: ");
		idade = scanf.nextInt();
		
		do {		
			System.out.printf("\nSua idade: %d", idade);
			
			if(idade >= 18) {
				System.out.println("\nVocê é de maior...");
			} else {
				System.out.println("\nVocê é de menor...");
			}
			
			System.out.print("\nEntre com sua idade: ");
			idade = scanf.nextInt();
		} while(idade >= 1);
		
		scanf.close();
	}
}
