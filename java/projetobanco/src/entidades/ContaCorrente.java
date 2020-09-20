package entidades;

import java.util.List;

public class ContaCorrente extends ContaBancaria {
	private int talonario = 10;
	
	public ContaCorrente() {}

	public ContaCorrente(int numeroDaConta, double saldo, List<Integer> transacoes) {
		super(numeroDaConta, saldo, transacoes);
	}

	public void emiteTalonario() {
		
		if(this.talonario > 3) {
			this.talonario--;
			System.out.printf("Tal�o emitido. Restam %d tal�es\n", this.talonario);
		} else {
			this.talonario = 10;
			this.talonario--;
			System.out.printf("Novos tal�es emitidos. Restam %d tal�es\n", this.talonario);
		
		}
	}
}
