programa {
	/*
	 * 2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
	 * 	horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
	 *	por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
	 *	armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
	 *	trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
	 *	excedente.
	 */
	inclua biblioteca Matematica --> mat;
	
	funcao inicio() {
		cadeia C;
		real N, E = 0.0, salarioTotal, salarioExcedente = 0.0;
		const real HORA_LIMITE = 50.0, VALOR_HORA = 10.0, VALOR_EXTRA = 20.0;  

		escreva("Digite o seu ID: ");
		leia(C);

		escreva("Digite a quantidade de horas trabalhadas: ");
		leia(N);

		se (N > HORA_LIMITE) {
			E = N - HORA_LIMITE;
			salarioExcedente = mat.arredondar((VALOR_EXTRA * E), 2);
		}

		salarioTotal = mat.arredondar(((N - E) * VALOR_HORA) + salarioExcedente, 2);

		escreva("Seu salário é R$ ", salarioTotal, " e você recebeu R$ ", salarioExcedente, " por horas excedentes");
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 715; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */