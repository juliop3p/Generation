programa {
	/*
	 * 4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
	 *	 número é par ou ímpar, e se é positivo ou negativo.
	*/
	funcao inicio() {
		inteiro numero;
		cadeia parOuImpar, positivoOuNegativo;

		escreva("Digite um número inteiro: ");
		leia(numero);

		se (numero % 2 == 0) {
			parOuImpar = "Par";
		} senao {
			parOuImpar = "Impar";
		}

		se (numero > -1) {
			positivoOuNegativo = "Positivo";
		} senao {
			positivoOuNegativo = "Negativo";
		}

		escreva("O número ", numero, " ele é ", parOuImpar, ", e também ", positivoOuNegativo, ".\n");
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 597; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */