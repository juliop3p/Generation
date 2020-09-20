programa {

	inclua biblioteca  Matematica --> mat;
	
	funcao inicio() {
		cadeia nome;
		real n1, n2, n3, media;

		escreva("Digite seu nome: ");
		leia(nome);

		escreva("Digite sua primeira nota: ");
		leia(n1);

		escreva("Digite sua segunda nota: ");
		leia(n2);

		escreva("Digite sua terceira nota: ");
		leia(n3);

		media = (n1 + n2 + n3) / 3;

		limpa();

		se(media >= 7) {
			escreva("Aluno(a): ", nome, ", parabéns você foi aprovado(a), com nota: ", mat.arredondar(media, 2));
		} senao se (media >= 4 e media < 7) {
			escreva("Aluno(a): ", nome, ", ficou de exame, com nota: ", mat.arredondar(media, 2));
		} senao {
			escreva("Aluno(a): ", nome, ", que pena, você foi reprovado(a), com nota: ", mat.arredondar(media, 2));
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 652; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */