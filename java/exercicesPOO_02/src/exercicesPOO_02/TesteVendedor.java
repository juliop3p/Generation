package exercicesPOO_02;

public class TesteVendedor {

	public static void main(String[] args) {
		Vendedor vendedorA = new Vendedor("Marcelo", 4200, 20);
		
		System.out.printf("O vendedor %s recebeu R$ %.2f", vendedorA.getNome(), vendedorA.salarioVendedor());
	}

}
