programa {
	/*
	 * 6) Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes
	 *	categorias:
	 *	Infantil A = 5 a 7 anos
	 *	Infantil B = 8 a 11 anos
	 *	Juvenil A = 12 a 13 anos
	 *	Juvenil B = 14 a 17 anos
	 *	Adultos = Maiores de 18 anos
	*/
	funcao inicio() {
		inteiro idade;

		escreva("Digite sua idade: ");
		leia(idade);

		se (idade > 4 e idade < 8) {
			escreva("Infantil A");
		} senao se (idade > 7 e idade < 12) {
			escreva("Infantil B");
		} senao se (idade > 11 e idade < 14) {
			escreva("Juvenil A");
		} senao se (idade > 13 e idade < 18) {
			escreva("Juvenil B");
		} senao se (idade > 17) {
			escreva("Maiores de 18 anos.")
		} senao {
			escreva("Sem clasificação");
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 293; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */