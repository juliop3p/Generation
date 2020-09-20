package exercices_01;

import java.util.Scanner;

public class Exercice_6 {
	/*
	 *  6. Construa um programa em c que, tendo como dados de entrada dois pontos 
	 *	quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é:
	 *	      _______________________
	 *	d = \/ (x2 - x1)² + (y2 - y1)²
     *
     *
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x1, x2, y1, y2, distancia;
		
		System.out.print("Digite o X1: ");
		x1 = scan.nextDouble();
		
		System.out.print("Digite o X2: ");
		x2 = scan.nextDouble();
		
		System.out.print("Digite o Y1: ");
		y1 = scan.nextDouble();
		
		System.out.print("Digite o Y2: ");
		y2 = scan.nextDouble();
		
		
		distancia = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));

		System.out.printf("\nA distância entre os pontos é: %.1f", distancia);
		
		scan.close();
	}
}
