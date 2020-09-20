programa {
	/*
	 * 2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
	 *	que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
	 *	imprima a média aritmética dos lançamentos, contabilize e apresente também
	 *	quantas foram as ocorrências da maior pontuação.
	 */
	inclua biblioteca Util;
	funcao inicio() {
		const inteiro TAMANHO = 10;
		real valores[TAMANHO], totValores = 0.0, maior = 0.0, totMaiores = 0.0, acimaMedia = 0.0, media;
		

		para(inteiro i=0; i<TAMANHO; i++) {
			limpa();
			escreva("Digite a ", (i+1), "° valor: ");
			leia(valores[i]);
			totValores += (valores[i]);
		}

		media = totValores / TAMANHO;

		para(inteiro i=0; i<TAMANHO; i++) {
			se(valores[i] >= maior) {
				se(valores[i] == maior) {
					totMaiores++;
				} senao {
					totMaiores = 0.0;
				}

				maior = (valores[i]);
			}
		}

		limpa();
		escreva("Os valores contabilizados foram...\n");
		
		para(inteiro i=0; i<TAMANHO; i++) {
			escreva(valores[i], " - ");
		}

		escreva("\nA média aritmética é: ", media);
		escreva("\nO maior número foi: ", maior, " e ocorreu ", (totMaiores+1), " vezes.");
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 683; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {maior, 11, 43, 5}-{totMaiores, 11, 56, 10};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */