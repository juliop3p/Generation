package playground;

import java.util.Scanner;

public class App_4 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		String[] vtimes = { "Corinthians", "Palmeiras", "Santos", "São Paulo" };
		int time = 1, condicao;
		int[] vpontos = new int[4]; 
		int[] posicao = new int[4];
		
		
		for(int i=0; i<4; i++) {
			vpontos[i] = 0;
		}
		
		// Entrada
		for(int i=0; i<3; i++) {
			System.out.print("\nLista: 1 - Corinthians | 2 - Palmeiras | 3 - Santos | 4 - São Paulo: ");
			time = scanf.nextInt();
			
			System.out.print("1 - Vitória | 2 - Empate | 3 - Perdeu: ");
			condicao = scanf.nextInt();
			
			vpontos[time-1] += condicao == 1 ? 3 : condicao == 2 ? 1 : 0; 
		}
		
		System.out.println("\n\n\n\n\n\n\n\n");
		
		for(int i=0; i<4; i++) {
			for(int j=1; j<4; j++) {
				if(vpontos[i] > vpontos[j]) {
					posicao[i] = j;
				}
			}
		}
		
		for(int i=0; i<4; i++) {
			System.out.println(posicao[i]);
		}
		
		while(time != 0) {
			int pontos = 0;
			String posicaoTabela = "1° Posição da tabela";
			
			System.out.print("\nVeja os pontos: 0 - Sair | 1 - Corinthians | 2 - Palmeiras | 3 - Santos | 4 - São Paulo: ");
			time = scanf.nextInt();
			
			if(time == 0 || time > 4) {
				break;
			}
			
			pontos = vpontos[time-1];
			
			if(pontos < vpontos[0]) {
				posicaoTabela = "2° Posição da tabela";
			}
			
			if(pontos < vpontos[1]) {
				posicaoTabela = "3° Posição da tabela";
			}
			
			if(pontos < vpontos[2]) {
				posicaoTabela = "4° Posição da tabela";
			}
			
			if(pontos < vpontos[3]) {
				posicaoTabela = "4° Posição da tabela";
			}
			
			System.out.printf("\nO time %s é %s com %d pontos", vtimes[time-1], posicaoTabela, pontos);
			                               
		}
		
		scanf.close();
	}
}
