package exercices_01;

import java.util.Scanner;

public class Exercice_1 {
	/*
	 * 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, 
	 * meses e dias e mostre-a expressa apenas em dias.
	 */
	public static void main(String[] args) {
		int anos, meses, dias, idadeDias;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Qual a sua idade em anos: ");
		anos = scan.nextInt();
		
		System.out.print("meses: ");
		meses = scan.nextInt();
		
		System.out.print("dias: ");
		dias = scan.nextInt();
		
		idadeDias = (anos * 365) + (meses * 30) + dias;
		
		System.out.println("Sua idade em dias: " + idadeDias);
		
		scan.close();
	}
}
