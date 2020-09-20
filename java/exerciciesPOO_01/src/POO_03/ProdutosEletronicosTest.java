package POO_03;

public class ProdutosEletronicosTest {
	/*
	 * 3) Crie uma classe produto eletrônico e apresente os atributos e 
	 * métodos referentes esta classe, em seguida crie um objeto produto 
	 * eletrônico, defina as instancias deste objeto e apresente as 
	 * informações deste objeto no console.
	 */
	public static void main(String[] args) {
		ProdutoEletronico produto1 = new ProdutoEletronico("Smartphone A10", "Samsung Galaxy A10 Dual SIM 32 GB Preto 2 GB RAM", 10, 1000, true, true);
		
		System.out.println(produto1.toString());
	}

}
