programa {
	/*
	 * 4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
	 *	em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
	 *	diagonal, ou seja, diagonal principal.
	 */

	funcao inicio() {
		inteiro matriz[3][3], diagonalPrincipal = 0;

		para(inteiro i=0; i<3; i++) {
			para(inteiro j=0; j<3; j++) {
				limpa();
				escreva("Valor: [ ", i, " ] [ ", j, " ]: " );
				leia(matriz[i][j]);
			}
		}

		limpa();

		para(inteiro i=0; i<3; i++) {
			para(inteiro j=0; j<3; j++) {
				escreva(" [ ", matriz[i][j], " ]")
				
				se(i == j) {
					diagonalPrincipal += (matriz[i][j]);
				}
			}
			escreva("\n");
		}

		escreva("\n O valor da diagonal principal é: ", diagonalPrincipal, "\n\n");
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 453; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */