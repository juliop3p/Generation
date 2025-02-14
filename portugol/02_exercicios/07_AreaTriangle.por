programa {
	/*
	 * 7) Receber valores de base e altura de um triângulo e verificar se são valores válidos
	 *	 (positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
	 */

	inclua biblioteca Matematica --> mat;
	
	funcao inicio() {
		real base, altura, area;

		escreva("Digite a base: ");
		leia(base);

		escreva("Digite a altura: ");
		leia(altura);

		se (base > 0 e altura > 0) {
			area = mat.arredondar(base * altura / 2, 2);
			escreva("A área do triangulo é ", area);
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 513; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */