programa {
	/*
	 * 1. Leia um vetor de 20 posições e em seguida um valor X qualquer. Seu programa devera 
	 * fazer uma busca do valor de X no vetor lido e informar a posição em que foi encontrado ou 
	 * se não foi encontrado.
	*/
	
	funcao inicio() {
		const inteiro TAMANHO = 6;
		inteiro valores[TAMANHO], valor, posicao = 0;
		logico encontrado = falso;

		para(inteiro i=0; i<TAMANHO; i++) {
			escreva("Digite o ", (i+1), "° valor: ");
			leia(valores[i]);
		}

		escreva("Que valor você deseja encontrar: ");
		leia(valor);

		limpa();

		para(inteiro i=0; i<TAMANHO; i++) {
			se(valores[i] == valor) {
				escreva("\nO valor ", valor, " foi encontrado na posição: ", (i+1));
				encontrado = verdadeiro;
			}
		}

		se(encontrado == falso) {
			escreva("Valor não foi encontrado!");
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 532; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */