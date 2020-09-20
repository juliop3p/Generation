programa {
	/*
	 * 4. Leia uma matriz 10 x 10 e escreva a localização (linha e a coluna) do maior valor.
	*/
	
	funcao inicio() {
		const inteiro LINHA = 10;
		const inteiro COLUNA = 10;
		inteiro valores[LINHA][COLUNA], maiorLinha = 0, maiorColuna = 0, maior;

		para(inteiro i=0; i<LINHA; i++) {
			para(inteiro j=0; j<COLUNA; j++) {
				escreva("Digite o valor [", i, "][", j, "]: ");
				leia(valores[i][j]);
			}
		}

		maior = valores[0][0];

		para(inteiro i=0; i<LINHA; i++) {
			para(inteiro j=0; j<COLUNA; j++) {
				se(valores[i][j] > maior) {
					maior = valores[i][j];
					maiorLinha = i;
					maiorColuna = j;
				}
			}
		}

		escreva("\nO maior valor foi: ", maior, " e a sua posição foi [", maiorLinha, "][", maiorColuna, "]!\n");
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 110; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */