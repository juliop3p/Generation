package lesson02;

import java.util.Scanner;

public class InAndOut {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int a, b, soma;
		
		System.out.printf("Digite o A: ");
		a = scanf.nextInt();
		
		System.out.printf("Digite o B: ");
		b = scanf.nextInt();
		
		soma = a + b;
		
		System.out.printf("O resultado %d + %d = %d", a, b, soma);
		
		scanf.close();
	}
}
