programa {
	/*
	 * 2. Leia um vetor de 40 posições. Contar e escrever quantos valores pares ele possui.
	 */
	funcao inicio() {
		const inteiro TAMANHO = 40;
		inteiro valores[TAMANHO], pares = 0;

		para(inteiro i=0; i<TAMANHO; i++) {
			escreva("Digite o ", (i+1), "° valor: ");
			leia(valores[i]);
		}

		para(inteiro i=0; i<TAMANHO; i++) {
			se(valores[i] % 2 == 0) {
				pares++;
			}
		}

		escreva("\nO vetor lido possuí ", pares, " valores pares.");
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 156; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */