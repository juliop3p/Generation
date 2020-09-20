programa {
	
	funcao inicio() {
		const inteiro TAMANHO = 3;
		inteiro mat[TAMANHO][2], i, j;

		para(i=0; i<TAMANHO; i++) {
			para(j=0; j<2; j++) {
				escreva(" Valor: [ ", i, " ] [ ", j, " ]: " );
				leia(mat[i][j]);
			}
		}

		limpa();

		para(i=0; i<TAMANHO; i++) {
			para(j=0; j<2; j++) {
				escreva("[ ", mat[i][j], " ]");
			}
			escreva("\n");
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 364; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */