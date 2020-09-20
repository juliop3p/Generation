programa {
	/*
	 * 6. Faça um programa que carregue uma matriz 2 x 2, calcule e mostre uma matriz 
	 * resultante que será a matriz digitada multiplica pelo maior elemento da matriz;
	*/
	funcao inicio() {
		const inteiro LINHA = 2;
		const inteiro COLUNA = 2;
		inteiro valores[LINHA][COLUNA], multipla[LINHA][COLUNA], maior = 0;

		para(inteiro i=0; i<LINHA; i++) {
			para(inteiro j=0; j<COLUNA; j++) {
				escreva("Digite o valor [", i, "][", j, "]: ");
				leia(valores[i][j]);
			}
		}

		para(inteiro i=0; i<LINHA; i++) {
			para(inteiro j=0; j<COLUNA; j++) {
				se(valores[i][j] > maior) {
					maior = valores[i][j];
				}
			}
		}

		para(inteiro i=0; i<LINHA; i++) {
			para(inteiro j=0; j<COLUNA; j++) {
				multipla[i][j] = valores[i][j] * maior;
			}
		}

		limpa();

		para(inteiro i=0; i<LINHA; i++) {
			para(inteiro j=0; j<COLUNA; j++) {
				escreva("[", valores[i][j], "]");
			}

			escreva(" => ");

			para(inteiro j=0; j<COLUNA; j++) {
				escreva(" [", multipla[i][j], "]");
			}
			escreva("\n")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 765; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */