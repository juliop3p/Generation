programa {
	/*
	 * 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
	 * dias e mostre-a expressa  apenas em dias.
	*/
	funcao inicio() {
		inteiro anos, meses, dias, idadeDias;

		escreva("\nQual a sua idade em anos? ");
		leia(anos);

		escreva("\nmeses? ");
		leia(meses);
		
		escreva("\ndias? ");
		leia(dias);

		idadeDias = (anos * 365) + (meses * 30) + dias;

		escreva("\nSua idade em dias é ", idadeDias);
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 368; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */