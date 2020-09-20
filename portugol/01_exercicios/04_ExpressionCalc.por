programa {
	/*
	 * 4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: 
	 * D = R + S / 2
	 * , onde
	 * R = (A + B)²
	 * S = (B + C)²
	*/
	funcao inicio() {
		real A, B, C, D, R, S;

		escreva("Digite o A: ");
		leia(A);

		escreva("Digite o B: ");
		leia(B);

		escreva("Digite o C: ");
		leia(C);

		R = (A + B) * (A + B);
		S = (B + C) * (B + C);
		D = (R + S) / 2;

		escreva("O Resultado da expressão é: ", D);
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 471; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */