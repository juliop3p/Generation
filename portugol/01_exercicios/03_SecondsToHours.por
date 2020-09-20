programa {
	/*
	 * 3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica 
	 * expressa em segundos e mostre-o expresso em horas, minutos e segundos.
	*/
	funcao inicio() {
		inteiro horas, minutos, segundos, duracaoEvento;

		escreva("Digite a duração do evento em segundos: ");
		leia(duracaoEvento);

		horas = duracaoEvento / 3600;
		minutos = (duracaoEvento / 60) - (horas * 60);
		segundos = duracaoEvento - ((horas * 3600) + (minutos * 60));

		escreva(horas, " Horas ", minutos, " minutos ", segundos, " segundos.");
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 493; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */