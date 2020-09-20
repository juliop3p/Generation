package exercices_01;

import java.util.Scanner;

public class Exercice_8 {
	/*
	 *  8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
	 *	percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que a 
	 *	percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o 
	 *	custo de fábrica de um carro e escreva o custo ao consumidor.
     *
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double precoFabrica, percentagemDistribuidor, impostos, precoFinal;
		
		System.out.print("Digite o valor do custo do carro saindo da fábrica R$: ");
		precoFabrica = scan.nextDouble();
		
		percentagemDistribuidor = precoFabrica / 100 * 28;
		impostos = precoFabrica / 100 * 45;
		precoFinal = precoFabrica + percentagemDistribuidor + impostos;

		System.out.printf("O valor final seria em torno de R$: %.2f", precoFinal);
		
		scan.close();
	}
}
