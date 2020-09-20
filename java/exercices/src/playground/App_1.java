package playground;

import java.util.Scanner;

public class App_1 {
	public static void main(String[] args) {

		Scanner scanf = new Scanner(System.in);
		int opcao;
		
		System.out.print("Digite um número: ");
		opcao = scanf.nextInt();
		
		System.out.println(opcao == 1 ? "Masculino" : opcao == 2 ? "Feminino" : "Outro");
		
		scanf.close();
	}
}
