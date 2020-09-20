package lesson16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecoes {

	public static void main(String[] args) {
		Collection<String> nomes = new ArrayList<String>();
		Collection<String> nomes2 = Arrays.asList("João", "Joana");
		
		nomes.add("Mario");
		nomes.add("Maria");
		nomes.add("Juliana");
		nomes.add("Rafael");
		
		System.out.print("Lista de nomes: " );
		for(String nome : nomes) {
			System.out.print(" " + nome);
		}
		
		nomes.remove("Mario");
		
		System.out.println("\nLista de nomes " + nomes);
		
		System.out.println("Contém o nome Maria? " + nomes.contains("Maria"));
		
		nomes.clear(); 
		
		nomes.addAll(nomes2);
		
		if(nomes.isEmpty()) {
			System.out.println("Nomes está vazio...");
		} else {
			System.out.println("Lista de nomes " + nomes);
		}

	}

}
