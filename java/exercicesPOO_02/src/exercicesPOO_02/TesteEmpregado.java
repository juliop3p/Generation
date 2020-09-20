package exercicesPOO_02;

public class TesteEmpregado {
	public static void main(String[] args) {
		Empregado empregadoA = new Empregado("Maria", 31, 3500, 300);
		
		System.out.printf("A funcionaria %s recebeu R$ %.2f", empregadoA.getNome(), empregadoA.calcularSalario());
	}
}
