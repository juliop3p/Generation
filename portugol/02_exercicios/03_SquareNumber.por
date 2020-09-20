programa {
	/*
	 * 3) Desenvolva um sistema em que:
	 *	Leia 4 (quatro) números;
	 *	Calcule o quadrado de cada um;
	 *	Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
	 *	Caso contrário, imprima os valores lidos e seus respectivos quadrados.
	 */

	inclua biblioteca Matematica --> mat;
	 
	funcao inicio() {
		real n1, n2, n3, n4, n12, , n22, n32, n42;

		escreva("Digite o primeiro número: ");
		leia(n1);

		escreva("Digite o segundo número: ");
		leia(n2);

		escreva("Digite o terceiro número: ");
		leia(n3);

		escreva("Digite o quarto número: ");
		leia(n4);

		n12 = mat.potencia(n1, 2.0);
		n22 = mat.potencia(n2, 2.0);
		n32 = mat.potencia(n3, 2.0);
		n42 = mat.potencia(n4, 2.0);

		se (n32 >= 1000) {
			escreva("\nTerceiro quadrado é ", mat.potencia(n3, 2.0));
		} senao {
			escreva("\nprimeiro valor: ", n1, " na potencia ² é: ", n1)
			escreva("\nsegundo valor: ", n2, " na potencia ² é: ", n2)
			escreva("\nterceiro valor: ", n3, " na potencia ² é: ", n3)
			escreva("\nquarto valor: ", n4, " na potencia ² é: ", n4)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 494; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */