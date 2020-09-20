programa {
	/*
	 * 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando 
	 *    dados sobre o salário e número de filhos. A prefeitura deseja saber:  
	 *	a) média do salário da população;
 	 *	b) média do número de filhos;
	 *	c) maior salário;
	 *	d) percentual de pessoas com salário até R$100,00. 
      *
	 */

	inclua biblioteca Matematica --> mat;
	
	funcao inicio() {
		real salario, totSalario = 0.0, mediaSalario, maiorSalario = 0.0;
		real filhos, totFilhos = 0.0, mediaFilhos;
		real totSalarioAte100 = 0.0, percentualSalarioAte100;


		para(inteiro i=1; i<=20; i++) {
			limpa();
			escreva("Digite o seu salário R$ ");
			leia(salario);

			escreva("Quantos filhos você possuí: ");
			leia(filhos)

			totSalario += salario;
			totFilhos += filhos;

			se(salario > maiorSalario) {
				maiorSalario = salario;
			}

			se(salario <= 100.0) {
				totSalarioAte100++;
			}
		}

		mediaSalario = mat.arredondar(totSalario / 20,1);
		mediaFilhos = mat.arredondar(totFilhos / 20, 1);
		percentualSalarioAte100 = mat.arredondar(totSalarioAte100 / 20 * 100, 1);
		
		escreva("\nA média salarial da cidade é de R$: ", mediaSalario);
		escreva("\nA média de filhos da cidade é de: ", mediaFilhos);
		escreva("\nO maior da salário é R$ ", maiorSalario);
		escreva("\nO percentual de salários até R$100 é de ", percentualSalarioAte100, "%");
		
		escreva("\n\n");
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 888; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */