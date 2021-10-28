import java.util.Scanner;

public class battleBoard {
	String shipP1;
	String shipP2;
	public void array() {
		int[][] compBoard = new int[10][10];
		//print numbers across top 
		int a = 64;
		char c;
		System.out.print("   1 2 3 4 5 6 7 8 9 10");
		for (int i = 0; i < compBoard.length; i++) {
			//print start of row in letters 
			a = a + 1;
			c = (char)a;
			System.out.print("\n" + c + "  ");
			for (int j = 0; j < compBoard[0].length; j++) {
		
					System.out.print(compBoard[i][j] + " ");
			}//close col loop
		}
	}

	public void rules() {
		System.out.println("\nRules: ");
		System.out.println("You place your ships and the computer will place its ships then you each make guesses as t where eachother's ships are.");
		System.out.println("You get 3 ships to place. You have a 2 length ship,  a 3 length ship, and a 4 length ship.");
		System.out.println("You will choose where to place each ship either horizontally and verticallly, not diagonally.");
	}

	public void shipPlacementPlayer() {
		int x = 5;
		while (x > 1) {
			x = x -1;
			Scanner keyboard = new Scanner(System.in);
			
			System.out.println("\nWould you like to place thi ship vertically and horizontally:  ");
			String vh = keyboard.nextLine();
			System.out.println("\nWhere would you like to place your " + x + " length ship?  Please type in the position of ships using the first and last point (Ex. A1  to A4).");
			System.out.print("Position 1: ");
			shipP1 = keyboard.nextLine();
			System.out.print("\nPosition 2: ");
			shipP2 = keyboard.nextLine();
			if (vh.equals("vertical")) {
				if (shipP1.equals(shipP2)) {
					System.out.println("\nThe start and end point of the ship cannot be the same! Try again!");
				}
				char column1 = shipP1.charAt(0);
				char column2 = shipP2.charAt(0);
				char row1C = shipP1.charAt(1);
				char row2C = shipP2.charAt(1);
				int row1 = Character.getNumericValue(row1C);
				int row2 = Character.getNumericValue(row2C);
				if (column1 != column2) {
					System.out.println("This ship was not placed vertically. Try Again!");
				}
				int checker = Math.abs(row1 - row2);
				int pr1;
				int pr2;
				int pr3;
				int pr4;
				int pc1;
				int pc2;
				int pc3;
				int pc4;
				if (checker == 1 && x == 2) {
					if (column1 == 'A') { 
						pc1 = 1;
						pc2 = 2;
						pr1 = row1;
						pr2 = row2;
					}
				}
				if (checker == 2 && x == 3) {
					if (column1 == 'A') { 
						pc1 = 1;
						pc2 = 2;
						pc3 = 3;
						pr1 = row1;
						pr1 = row1 + 1;
						pr2 = row2;
					}
				}
				if (checker == 3 && x == 4) {
					if (column1 == 'A') { 
						pc1 = 1;
						pc2 = 2;
						pc3 = 3;
						pc4 = 4;
						pr1 = row1;
						pr2 = row1 + 1;
						pr3 = row1 + 2;
						pr4 = row2;
					}
				}
			}
			if (vh.equals("horizontal")) {
				if (shipP1.equals(shipP2)) {
					System.out.println("\nThe start and end point of the ship cannot be the same! Try again!");
				}
				char column1C = shipP1.charAt(0);
				char column2C = shipP2.charAt(0);
				char row1C = shipP1.charAt(1);
				char row2C = shipP2.charAt(1);
				int column1 = Character.getNumericValue(column1C);
				int column2 = Character.getNumericValue(column2C);
				if (row1C != row1C) {
					System.out.println("This ship was not placed prizontally. Try Again!");
				}
				int checker = Math.abs(column1 - column2);
				if (checker == 1 && x == 2) {
					
				}
				if (checker == 2 && x == 3) {
						
				}
				if (checker == 3 && x == 4) {
						
				}
			}	
		}
	}
	/*
	public void shipPlacementComputer() {
		int[][] compBoard = new int[10][10];
	//randomly placing row
		int orient = (int)(Math.random()*2); //0 = horizontal, 1 = vertical
		int start =(int)(Math.random()*10) + 1; 
	//need another random for horizontal/veritcal start
		int ship1 = 2;
		int ship2 = 3; 
		int ship3 = 4; 
		if (orient == 0) { 
		//changes each one to 1 for length of ship 
			for (int k = 0; k < ship1; k++) {
				compBoard[start][k] = 1;
			}
		}
		else {
			for (int k = 0; k < ship1; k++) {
				compBoard[k][start] = 1;
			}
		}	
		System.out.println(""); 
		//print numbers across top 
		for (int i = 0; i < compBoard.length; i++) {
			//print start of row in letters 
			for (int j = 0; j < compBoard[0].length; j++) {
					System.out.print(compBoard[i][j] + " "); 
				}
			System.out.println("");
		}
	}*/
}

//VERSION FOR SUBMISSION :
import java.util.Scanner;

public class battleBoard {
	String shipP1;
	String shipP2;
	public void array() {
		int[][] compBoard = new int[10][10];
		//print numbers across top 
		//changed the printing to numbers so when i take user input it's easier 
		int a = 0;
		char c;
		System.out.print("   1 2 3 4 5 6 7 8 9 10");
		for (int i = 0; i < compBoard.length; i++) {
			//print start of row in letters 
			a = a + 1;
			c = (char)a;
			System.out.print("\n" + a + "  ");
			for (int j = 0; j < compBoard[0].length; j++) {
		
					System.out.print(compBoard[i][j] + " ");
			}//close col loop
		}
	}

	public void rules() {
		System.out.println("\nRules: ");
		System.out.println("You place your ships and the computer will place its ships then you each make guesses as t where eachother's ships are.");
		System.out.println("You get 3 ships to place. You have a 2 length ship,  a 3 length ship, and a 4 length ship.");
		System.out.println("You will choose where to place each ship either horizontally and verticallly, not diagonally.");
	}

	public void shipPlacementPlayer() {
		int x = 5;
		while (x > 1) {
			x = x -1;
			Scanner keyboard = new Scanner(System.in);
			
			
		//ASSUMPTIONS:  I'm only inputing one position and always making it go down or to the right	
		
			System.out.print("\nWould you like to place thi ship vertically and horizontally:  ");
			String vh = keyboard.nextLine();
			System.out.print("\nWhere would you like to place your " + x + " length ship?  Please type in the starting position of your ship");
			System.out.print("Position 1: ");
			//shipP1 = keyboard.nextLine();
			//System.out.print("\nPosition 2: ");
			shipP2 = keyboard.nextLine();
			if (vh.equals("vertical")) {
				//if (shipP1.equals(shipP2)) {
				//	System.out.println("\nThe start and end point of the ship cannot be the same! Try again!");
				//}
				char column1C = shipP1.charAt(0);
				//char column2 = shipP2.charAt(0);
				char row1C = shipP1.charAt(1);
				//char row2C = shipP2.charAt(1);
				int row1 = Character.getNumericValue(row1C);
				int column1 = Character.getNumericValue(column1C);
				//int row2 = Character.getNumericValue(row2C);
				//if (column1 != column2) {
				//	System.out.println("This ship was not placed vertically. Try Again!");
				//}
				//int checker = Math.abs(row1 - row2);
				int pr1 = row1;
				int pr2 = row1;
				int pr3 = row1;
				int pr4 = row1;
				int pc1 = column1;
				
				//int pr3;
				//int pr4;
				//int pc1;
				//int pc2;
				//int pc3;
				//int pc4;
				/*if (checker == 1 && x == 2) {
					if (column1 == 'A') { 
						pc1 = 1;
						pc2 = 2;
						pr1 = row1;
						pr2 = row2;
					}
				}
				if (checker == 2 && x == 3) {
					if (column1 == 'A') { 
						pc1 = 1;
						pc2 = 2;
						pc3 = 3;
						pr1 = row1;
						pr1 = row1 + 1;
						pr2 = row2;
					}
				}
				if (checker == 3 && x == 4) {System.out.println("\nWould you like to place thi ship vertically and horizontally:  ");
			String vh = keyboard.nextLine();
					if (column1 == 'A') { 
						pc1 = 1;
						pc2 = 2;
						pc3 = 3;
						pc4 = 4;
						pr1 = row1;
						pr2 = row1 + 1;
						pr3 = row1 + 2;
						pr4 = row2;
					}
				}*/
			}
			if (vh.equals("horizontal")) {
				/*if (shipP1.equals(shipP2)) {
					System.out.println("\nThe start and end point of the ship cannot be the same! Try again!");
				}
				char column1C = shipP1.charAt(0);
				char column2C = shipP2.charAt(0);
				char row1C = shipP1.charAt(1);
				char row2C = shipP2.charAt(1);
				int column1 = Character.getNumericValue(column1C);
				int column2 = Character.getNumericValue(column2C);
				if (row1C != row1C) {
					System.out.println("This ship was not placed prizontally. Try Again!");
				}
				int checker = Math.abs(column1 - column2);
				if (checker == 1 && x == 2) {
					
				}
				if (checker == 2 && x == 3) {
						
				}
				if (checker == 3 && x == 4) {
						
				}*/
				char column1C = shipP1.charAt(0);
				//char column2 = shipP2.charAt(0);
				char row1C = shipP1.charAt(1);
				//char row2C = shipP2.charAt(1);
				int row1 = Character.getNumericValue(row1C);
				int column1 = Character.getNumericValue(column1C);
				//int row2 = Character.getNumericValue(row2C);
				//if (column1 != column2) {
				//	System.out.println("This ship was not placed vertically. Try Again!");
				//}
				//int checker = Math.abs(row1 - row2);
				int pc1 = column1;
				int pc2 = column1;
				int pc3 = column1;
				int pc4 = column1;
				int pr1 = row1;
			}	
		}
	}
	public void Guess() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("\nMake a guess:  ");
			String guess = keyboard.nextLine();
			char guessP1 = guess.charAt(0);
				//char column2 = shipP2.charAt(0);
				char guessP2 = guess.charAt(1);
				//char row2C = shipP2.charAt(1);
				int guessNum1 = Character.getNumericValue(guessP1);
				int guessNum2 = Character.getNumericValue(guessP2);
			}
		}
	/*
	public void shipPlacementComputer() {
		int[][] compBoard = new int[10][10];
	//randomly placing row
		int orient = (int)(Math.random()*2); //0 = horizontal, 1 = vertical
		int start =(int)(Math.random()*10) + 1; 
	//need another random for horizontal/veritcal start
		int ship1 = 2;
		int ship2 = 3; 
		int ship3 = 4; 
		if (orient == 0) { 
		//changes each one to 1 for length of ship 
			for (int k = 0; k < ship1; k++) {
				compBoard[start][k] = 1;
			}
		}
		else {
			for (int k = 0; k < ship1; k++) {
				compBoard[k][start] = 1;
			}
		}	
		System.out.println(""); 
		//print numbers across top 
		for (int i = 0; i < compBoard.length; i++) {
			//print start of row in letters 
			for (int j = 0; j < compBoard[0].length; j++) {
					System.out.print(compBoard[i][j] + " "); 
				}
			System.out.println("");
		}
	}*/
//}
