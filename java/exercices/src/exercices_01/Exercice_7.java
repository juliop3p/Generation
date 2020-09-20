package exercices_01;

import java.util.Scanner;

public class Exercice_7 {
	/*
	 *  7. Um sistema de equações lineares do tipo: 
	 *	ax + by = c
	 *	dx + ey = f , pode ser resolvido segundo mostrado abaixo:
	 *		 
	 *	x = ce - bf / ae - bd
	 *	 y = af - cd / ae - bd
	 *	
	 *	Escreva um sistema que lê os coeficientes a,,b,c,d,e e f e calcula e mostra os
	 *	valores de x e y.
     *
     *
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a, b, c, d, e, f, x, y;
		
		System.out.print("Digite o A: ");
		a = scan.nextDouble();
		
		System.out.print("Digite o B: ");
		b = scan.nextDouble();
		
		System.out.print("Digite o C: ");
		c = scan.nextDouble();
		
		System.out.print("Digite o D ");
		d = scan.nextDouble();
		
		System.out.print("Digite o E: ");
		e = scan.nextDouble();
		
		System.out.print("Digite o F: ");
		f = scan.nextDouble();
		
		x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		y = ((a * f) - (c * d)) / ((a * e) - (b * d));

		System.out.printf("O Resultado é X: %.2f e Y: %.2f", x, y);
		
		scan.close();
	}
}
