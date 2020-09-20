programa {
	/*
	 * 1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
	 *	atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
	*/
	
	funcao inicio() {
		const inteiro TAMANHO = 5;
		real pontuacao[TAMANHO], maior = 0.0;

		para(inteiro i=0; i<TAMANHO; i++) {
			escreva("Digite a ", (i+1), "° nota: ");
			leia(pontuacao[i]);
		}

		para(inteiro i=0; i<TAMANHO; i++) {
			
			se(pontuacao[i] > maior) {
				maior = (pontuacao[i]);
			}
		}

		escreva("A maior pontuação foi: ", maior);
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 387; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
