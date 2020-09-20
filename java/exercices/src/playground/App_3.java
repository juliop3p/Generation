package playground;

import java.util.Random;
import java.util.Scanner;

public class App_3 {
	
	final static int SIZE = 5;
	static int[][] board = new int[SIZE][SIZE];
	static int[][] ships = new int[3][2];
	static int shipsFound = 0;
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scanf = new Scanner(System.in);
		
		int coordinateX, coordinateY;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				ships[i][j] = rand.nextInt(5);
			}
		}
		
		
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				board[i][j] = -1;
			}
		}
		
		while(shipsFound != 3) {	
			System.out.println("\n### BATALHA NAVAL ###");
			
			showBoard();
			
			System.out.print("\n\nLinha: ");
			coordinateX = scanf.nextInt();
			
			System.out.print("Coluna: ");
			coordinateY = scanf.nextInt();
			
			if(coordinateX > 5 || coordinateY > 5) {
				System.out.println("Coordenada errada!");
			} else {
				makePlay(coordinateX-1, coordinateY-1);
				tips(coordinateX-1, coordinateY-1);
			}			
		}
		
		clear();
		showBoard();
		
		scanf.close();
		
	}
	
	public static void showBoard() {
		for(int i=0; i<SIZE; i++) {
			System.out.printf("\n %d", i+1);
			for(int j=0; j<SIZE; j++) {
				System.out.printf("\t | %c |", setField(board[i][j]));
			}
		}
	}
	
	public static void clear() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}
	
	public static void tips(int x, int y) {
		
		int shipsLocated = 0;
		
		for(int i=0; i<3; i++) {
			if(ships[i][0] == x || ships[i][1] == y) {
				shipsLocated++;
			}
		}
		
		System.out.printf(shipsLocated > 0 ? "Foram encontrados %d navios nessa linha/coluna" : "", shipsLocated);
	}
	
	
	public static void makePlay(int x, int y) {
		board[x][y] = 0;
		for(int i=0; i<3; i++) {
			if(ships[i][0] == x && ships[i][1] == y) {
				System.out.println("Você encontrou um navio!");
				board[x][y] = 1;
				shipsFound++;
			}
		}
	}
	
	public static char setField(int number) {
		if(number == -1) {
			return '~';
		} else if(number == 0) {
			return '*';
		} else {
			return 'X';
		}
	}
}
