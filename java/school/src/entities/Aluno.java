package entities;

public class Aluno {
	public String nome;
	public int anoNascimento;
	public char sexo;
	public char turma;
	public double[] notas = new double[4]; 
	
	@Override
	public String toString() {
		return "Aluno { nome: " + nome + ", anoNascimento: " + anoNascimento + ", sexo: " + sexo + ", turma: " + turma + " }";
	}
		
	public double calculaMedia() {
		return (notas[0] + notas[1] + notas[2] + notas[3]) / 4;
	}
	
	public void aprovadoOuReprovado(double media, double mediaEscola) {
		if(media >= mediaEscola) {
			System.out.printf(
					sexo == 'M' ? 
						"Aluno %s parab�ns voc� foi aprovado com m�dia %.1f" : 
						"Aluna %s parab�ns voc� foi aprovada com m�dia %.1f"
						, nome, media);
		} else {
			System.out.printf(
					sexo == 'M' ? 
						"Aluno %s voc� foi reprovado com m�dia %.1f" : 
						"Aluna %s voc� foi reprovada com m�dia %.1f"
						, nome, media);
		}
	}
}
