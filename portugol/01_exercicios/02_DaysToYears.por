programa {
	/*
	 * 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
	 * expressa  em anos, meses e dias.
	*/
	funcao inicio() {
		inteiro anos, meses, dias, idadeDias;

		escreva("Qual a sua idade em dias? ");
		leia(idadeDias);

		anos = idadeDias / 365;
		meses = (idadeDias - (anos * 365)) / 30;
		dias = idadeDias - ((anos * 365) + (meses * 30));

		escreva(anos, " anos, ", meses, " meses, ", dias, " dias.");
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 448; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */