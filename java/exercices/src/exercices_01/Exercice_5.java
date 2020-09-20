package exercices_01;

import java.util.Scanner;

public class Exercice_5 {
	/*
	 *  5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
	 *	aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
	 *	respectivamente.
     *
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float n1, n2, n3, media;
		
		System.out.print("Digite a 1° nota: ");
		n1 = scan.nextFloat();
		
		System.out.print("Digite a 2° nota: ");
		n2 = scan.nextFloat();
		
		System.out.print("Digite a 3° nota: ");
		n3 = scan.nextFloat();
		
		media = (n1 + n2 + n3) / 3;

		System.out.printf("\nA sua média é: %.1f", media);
		
		scan.close();
	}
}
