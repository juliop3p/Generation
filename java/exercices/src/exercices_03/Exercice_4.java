package exercices_03;

import java.util.Scanner;

public class Exercice_4 {
	/*
	 * Uma empresa desenvolveu uma pesquisa para saber as características psicológicas 
	 * dos indivíduos de uma região. Para tanto, a cada uma das pessoas era 
	 * perguntado: idade, sexo (1-feminino / 2-masculino), e as opções (1, se a pessoa 
	 * era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se 
	 * para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
     *
	 *	o número de pessoas calmas; 
	 *	o número de mulheres nervosas; 
	 *	o número de homens agressivos; 
	 *	o número de pessoas nervosas com mais de 40 anos; 
	 *	o número de pessoas calmas com menos de 18 anos.
     *
	 */
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int i = 0, calmas = 0, mulheresNervosas = 0, homensAgressivos = 0, nervosas40 = 0, calmas18 = 0;
		int idade, sexo, opcao;
		
		while(i < 150) {
			System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*-*");
			System.out.print("Digite a sua idade: ");
			idade = scanf.nextInt();
			
			System.out.print("1 - Feminino | 2 - Masculino: ");
			sexo = scanf.nextInt();
			
			System.out.print("1 - Calma | 2 - Nervosa | 3 - Agressiva: ");
			opcao = scanf.nextInt();
			
			calmas += (opcao == 1) ? 1 : 0;
			mulheresNervosas += (opcao == 2 && sexo == 1) ? 1 : 0;
			homensAgressivos += (opcao == 3 && sexo == 2) ? 1 : 0;
			nervosas40 += (opcao == 2 && idade > 40) ? 1 : 0;
			calmas18 += (opcao == 1 && idade < 18) ? 1 : 0;
			
			i++;
		}
		
		System.out.printf("\n%d pessoas calmas", calmas);
		System.out.printf("\n%d mulheres nervosas", mulheresNervosas);
		System.out.printf("\n%d homens agressivos", homensAgressivos);
		System.out.printf("\n%d pessoas nervosas com mais de 40 anos", nervosas40);
		System.out.printf("\n%d pessoas calmas com menos de 18 anos", calmas18);
		
		
		scanf.close();
	}
}
