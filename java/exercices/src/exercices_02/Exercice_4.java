package exercices_02;

import java.util.Scanner;

public class Exercice_4 {
	/*
	 *  4-	Fa�a um programa em que permita a entrada de um n�mero qualquer e 
	 *  exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz 
	 *  quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		
		System.out.print("Digite um n�mero: ");
		num = scan.nextInt();
		
		System.out.println("");
		
		if(num % 2 == 0) {
			System.out.printf("O n�mero %d � Par e sua raiz quadrada �: %.1f", num, Math.sqrt(num));
		} else {
			System.out.printf("O n�mero %d � Impar e elevado ao quadrada �: %.1f", num, Math.pow(num, 2));
		} 
		
		scan.close();
	}
}
