package lesson09;

public class Pessoa {
	private String primeiroNome;
	private String nomesDoMeio;
	private String ultimoNome;
	
	public Pessoa(String primeiro, String meio, String ultimo) {
		primeiroNome = primeiro;
		ultimoNome = ultimo;
		nomesDoMeio = meio;
	}
	
	public String getNomeCompleto() {
		String nomeCompleto = primeiroNome + " " + nomesDoMeio + " " + ultimoNome;
		return nomeCompleto;
	}
	
}
