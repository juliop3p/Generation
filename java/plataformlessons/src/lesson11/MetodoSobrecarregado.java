package lesson11;

public class MetodoSobrecarregado {
	public void testaMetodosSobrecarregados() {
		System.out.printf("Sal�rio em n�mero inteiro: %d \n", salario(1000));
		System.out.printf("Sal�rio em n�mero inteiro: %f \n", salario(7.500));
	}
	
	public int salario(int valorInt) {
		System.out.printf("Sal�rio com argumento inteiro: %d \n", valorInt);
		
		return valorInt * valorInt;
	}
	
	public double salario(double valorDouble) {
		System.out.printf("Sal�rio com argumento inteiro: %f \n", valorDouble);
		
		return valorDouble * valorDouble;
	}
}
