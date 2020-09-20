package exercices_01;

import java.util.Scanner;

public class Exercice_2 {
	/*
	 * 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e 
	 * mostre-a expressa em anos, meses e dias.
	 */
	public static void main(String[] args) {
		int anos, meses, dias, idadeDias;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Qual a sua idade em dias: ");
		idadeDias = scan.nextInt();
		
		anos = idadeDias / 365;
		meses = (idadeDias % 365) / 30;
		dias = (idadeDias % 365) % 30;
		
		System.out.printf("Você tem %d anos %d meses e %d dias vividos.", anos, meses, dias);
		
		scan.close();
	}
}
