programa {
	/*
	 * 8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
	 * percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
	 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
	 * escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
	 * consumidor.
	*/
	funcao inicio() {
		real precoFabrica, percentagemDistribuidor, impostos, precoFinal;

		escreva("Digite o valor do custo do carro saindo da fábrica R$: ");
		leia(precoFabrica);

		percentagemDistribuidor = precoFabrica / 100 * 28;
		impostos = precoFabrica / 100 * 45;
		precoFinal = precoFabrica + percentagemDistribuidor + impostos;

		escreva("O valor final seria em torno de R$: ", precoFinal);
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 632; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */