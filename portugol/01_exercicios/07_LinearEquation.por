programa {
	/*
	 * 7. Um sistema de equações lineares do tipo: 
	 * ax + by = c
	 * dx + ey = f , pode ser resolvido segundo mostrado abaixo:
	 * 
	 * x = ce - bf / ae - bd
	 * y = af - cd / ae - bd
	 * 
	 * Escreva um sistema que lê os coeficientes a,,b,c,d,e e f e calcula e mostra os
	 * valores de x e y.
	*/

	inclua biblioteca Matematica --> mat;
	
	funcao inicio() {
		real a, b, c, d, ee, f, x, y;

		escreva("A: ");
		leia(a);

		escreva("B: ");
		leia(b);

		escreva("C: ");
		leia(c);

		escreva("D: ");
		leia(d);

		escreva("E: ");
		leia(ee);

		escreva("F: ");
		leia(f);

		x = mat.arredondar(((c * ee) - (b * f)) / ((a * ee) - (b * d)), 2);
		y = mat.arredondar(((a * f) - (c * d)) / ((a * ee) - (b * d)), 2);

		escreva("\nO Resultado é X: ", x, " e Y: ", y, "\n");
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 354; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */