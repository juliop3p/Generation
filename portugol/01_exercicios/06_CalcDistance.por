programa {
	/*
	 * 6. Construa um programa em c que, tendo como dados de entrada dois pontos 
	 * quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula
	 * que efetua tal cálculo é:
	 *       _____________
	 * d = \/ (x2 - x1)² + (y2 - y1)²
	*/

	inclua biblioteca Matematica --> mat;
	
	funcao inicio() {
		real x1, x2, y1, y2, distancia;
		
		escreva("Distância entre dois pontos\n");

		escreva("X1: ");
		leia(x1);

		escreva("Y1: ");
		leia(y1);

		escreva("X2: ");
		leia(x2);

		escreva("Y2: ");
		leia(y2);

		distancia = mat.arredondar(mat.raiz(mat.potencia((x2 - x1), 2.0) + mat.potencia((y2 - y1), 2.0), 2.0), 2);

		escreva("A distância entre esses pontos são: ", distancia);
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 514; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */