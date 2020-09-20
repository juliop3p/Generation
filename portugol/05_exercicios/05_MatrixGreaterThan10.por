programa {
	/*
	 * 5. Leia uma matriz 6 x 6, conte e escreva quantos valores maiores que 10 ela possui.
	 */
	funcao inicio() {
		const inteiro LINHA = 6;
		const inteiro COLUNA = 6;
		inteiro valores[LINHA][COLUNA], maior = 0;

		para(inteiro i=0; i<LINHA; i++) {
			para(inteiro j=0; j<COLUNA; j++) {
				escreva("Digite o valor [", i, "][", j, "]: ");
				leia(valores[i][j]);
			}
		}

		para(inteiro i=0; i<LINHA; i++) {
			para(inteiro j=0; j<COLUNA; j++) {
				se(valores[i][j] > 10) {
					maior++;
				}
			}
		}

		escreva("\nA matriz possuí ", maior, " valores maior que 10.\n");
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 181; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */