package lesson04;

public class RepetionFor {
	
	public static void main(String[] args) {
		
		int soma = 0;
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			soma += i;
		}
		
		System.out.printf("Soma total: %d", soma);
	}
}
