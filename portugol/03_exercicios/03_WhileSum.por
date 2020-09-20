programa {
	/*
	 * 1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente 
	 * no final o total do somatório, a média e o total de valores lidos. O programa deve fazer 
	 * as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. Ou seja, 
	 * o programa deve parar quando o usuário fornecer um valor negativo.
	*/
	
	funcao inicio() {
		inteiro numero = 0, somatorio = 0, media, contador = 0;

		enquanto(numero >= 0) {
			escreva("Digite um valor: ");
			leia(numero);

			se(numero < 0) {
				pare;
			}

			somatorio += numero;
			contador++;
		}

		media = somatorio / contador;

		escreva("O somatório dos numeros registrados foi: ", somatorio, " e a média é de: ", media);
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 741; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */