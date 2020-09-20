package exercice_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loja {
	/*
	 * Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
	 *	trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
	 *	programa deverá atender as seguintes funcionalidades:
	 *	
	 *	Armazenar dados da List
	 *	Remover dados da list;
	 *	Atualizar dados da list.
	 *	Apresentar todos os dados da list.
	 */
	public static void main(String[] args) {
		List<Estoque> estoque = new ArrayList<Estoque>();
		Scanner scanf = new Scanner(System.in);
		
		int opcao = 1;
		Long codItem = 1L;
		String nomeItem;
		int quantidade;
		double valor;
		double peso;
		
		System.out.println("### APLICAÇÃO ESTOQUE ###");
		
		while(opcao != 0) {
			System.out.println("\n\n1 - ADICIONAR PRODUTO NO ESTOQUE");
			System.out.println("2 - REMOVER DADO DO ESTOQUE");
			System.out.println("3 - ATUALIZAR DADO DO ESTOQUE");
			System.out.println("4 - MOSTRAR ESTOQUE");
			System.out.printf("escolha sua opcao: ");
			opcao = scanf.nextInt();
			
			if(opcao == 1) {
				System.out.print("Digite o nome do item: ");
				nomeItem = scanf.next();
				
				System.out.print("Digite a quantidade do item: ");
				quantidade = scanf.nextInt();
				
				System.out.print("Digite o valor do item R$: ");
				valor = scanf.nextDouble();
				
				System.out.print("Digite o peso do item Kg: ");
				peso = scanf.nextDouble();
				
				estoque.add(new Estoque(codItem++, nomeItem, quantidade, valor, peso));
			} else if(opcao == 2) {
				System.out.println("Digite o código do item que deseja remover");
				Long id = scanf.nextLong();
				
				for(Estoque item : estoque) {
					if(item.getCodItem() == id) {
						estoque.remove(item);
						System.out.print("\nItem removido com sucesso!");
					}
				}
			} else if(opcao == 3) {
				System.out.println("Digite o código do item que deseja atualizar");
				Long id = scanf.nextLong();
				
				for(Estoque item : estoque) {
					if(item.getCodItem() == id) {
						System.out.print("Digite o nome do item: ");
						item.setNomeItem(scanf.next());
						
						System.out.print("Digite a quantidade do item: ");
						item.setQuantidade(scanf.nextInt());
						
						System.out.print("Digite o valor do item R$: ");
						item.setValor(scanf.nextDouble());
						
						System.out.print("Digite o peso do item Kg: ");
						item.setPeso(scanf.nextDouble());
					}
				}
			} else if(opcao == 4) {
				for(Estoque item : estoque) {
					System.out.println(item.toString());
				}
			} else {
				System.out.println("OPCÃO INVÁLIDA!");
				opcao = 0;
			}
		}
	}
}
