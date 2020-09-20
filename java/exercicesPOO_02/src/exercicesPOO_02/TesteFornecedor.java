package exercicesPOO_02;

public class TesteFornecedor {

	public static void main(String[] args) {

		Fornecedor fornecedorA = new Fornecedor("John", "Rua 8 de novembro.", "11 91234-5678", 3450, 1238);

		System.out.printf("Cliente %s possui %.2f de crédito.", fornecedorA.getNome(), fornecedorA.obterSaldo());
	}

}
