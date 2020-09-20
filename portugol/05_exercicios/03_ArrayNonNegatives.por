programa {
	/*
	 * 3. Leia um vetor de 40 posições e atribua valor 0 para todos os elementos que 
	 * possuírem valores negativos.
	*/
	funcao inicio() {
		const inteiro TAMANHO = 40;
		inteiro valores[TAMANHO];

		para(inteiro i=0; i<TAMANHO; i++) {
			escreva("Digite o ", (i+1), "° valor: ");
			leia(valores[i]);
		}

		para(inteiro i=0; i<TAMANHO; i++) {
			se(valores[i] < 0) {
				valores[i] = 0;
			}
		}

		para(inteiro i=0; i<TAMANHO; i++) {
			escreva(valores[i], " - ");
		}

		escreva("FIM");

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 451; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */