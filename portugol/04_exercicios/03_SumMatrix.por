programa {
	/*
	 * 3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
	 * 
	 * a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
	 *	das matrizes N1 e N2;
	 *	
	 *	b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
	 *	posição das matrizes N1 e N2.
	*/

	funcao inicio() {
		const inteiro LINHA = 4, COLUNA = 6;
		inteiro N1[LINHA][COLUNA], N2[LINHA][COLUNA], M1[LINHA][COLUNA], M2[LINHA][COLUNA];

		para(inteiro i=0; i<LINHA; i++) {
			para(inteiro j=0; j<COLUNA; j++) {
				limpa();
				escreva("Digite o valor da N1\n");
				escreva("Valor: [ ", i, " ] [ ", j, " ]: " );
				leia(N1[i][j]);
				
				limpa();
				escreva("Digite o valor da N2\n");
				escreva("Valor: [ ", i, " ] [ ", j, " ]: " );
				leia(N2[i][j]);
			}
		}

		para(inteiro i=0; i<LINHA; i++) {
			para(inteiro j=0; j<COLUNA; j++) {
				M1[i][j] = N1[i][j] + N2[i][j];
				M2[i][j] = N1[i][j] - N2[i][j];
			}
		}

		limpa();

		escreva(" ### S O M A ### \n");
		para(inteiro i=0; i<LINHA; i++) {
			para(inteiro j=0; j<COLUNA; j++) {
				escreva(" [ ", N1[i][j], " ]");
			}

			escreva(" + ");

			para(inteiro j=0; j<COLUNA; j++) {
				escreva(" [ ", N2[i][j], " ]");
			}

			escreva(" = ");

			para(inteiro j=0; j<COLUNA; j++) {
				escreva(" [ ", M1[i][j], " ]");
			}
			escreva("\n");
		}

		escreva("\n### S U B T R A Ç Ã O ### \n");

		para(inteiro i=0; i<LINHA; i++) {
			para(inteiro j=0; j<COLUNA; j++) {
				escreva(" [ ", N1[i][j], " ]");
			}

			escreva(" - ");

			para(inteiro j=0; j<COLUNA; j++) {
				escreva(" [ ", N2[i][j], " ]");
			}

			escreva(" = ");

			para(inteiro j=0; j<COLUNA; j++) {
				escreva(" [ ", M2[i][j], " ]");
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
 * @POSICAO-CURSOR = 384; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */