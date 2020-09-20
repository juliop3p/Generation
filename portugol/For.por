programa {
	
	funcao inicio() {
		inteiro x, tab, res;

		escreva("Entre com o valor da tabuada: ");
		leia(tab);

		para(x = 1; x<11; x++) {
			res = tab * x;
			escreva(tab, " x ", x, " = ", res, "\n");
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 213; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {res, 4, 18, 3}-{tab, 4, 13, 3}-{x, 4, 10, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */