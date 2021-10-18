import java.util.Scanner;

public class battleBoard {
	String shipP1;
	String shipP2;
	public void array() {
		char c;
		int a = 64;
		int[][] numbers = new int[10][10];
		System.out.println("   1 2 3 4 5 6 7 8 9 10");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[0].length; j++) {
				if (j == 0) {
					a = a + 1;
					c = (char)a;
					System.out.print(c + "  ");
				}
				else if (j == 0 || j % (numbers.length - 1) != 0) {
					System.out.print(numbers[i][j] + " ");
				}
				else {
					System.out.println(numbers[i][j] + " ");
				}
			}
		}
	} // closes array()

	public void rules() {
		System.out.println("\nRules: ");
		System.out.println("You place your ships and the computer will place its ships then you each make guesses as t where eachother's ships are.");
		System.out.println("You get 5 ships to place. You have 1 5 length ship, 1 4 length ship, 2 3 length ships, and 1 2 length ship.");
		System.out.println("You will choose where to place each ship either horizontally and verticallly, no diagonally.");
	}

	public void shipPlacementPlayer() {
		int x = 6;
		while (x > 1) {
			x = x -1;
			Scanner keyboard = new Scanner(System.in);
			if (x == 3) {
				String vh = keyboard.nextLine();
				System.out.println("\nWould you like to place thi ship vertically and horizontally:  ");
				System.out.println("Where would you like to place your first " + x + " length ship?  Please type in the position of ships using the first and last point (Ex. A1  to A5).");
				System.out.print("Position 1: ");
				shipP1 = keyboard.nextLine();
				System.out.print("\nPosition 2: ");
				shipP2 = keyboard.nextLine();
				System.out.println("\nWhere would you like to place your first " + x + " length ship?  Please type in the position of ships using the first and last point (Ex. A1  to A5).");
				System.out.print("Position 1: ");
				shipP1 = keyboard.nextLine();
				System.out.print("\nPosition 2: ");
				shipP2 = keyboard.nextLine();
				
				if (vh.equals("horizontal")) {
					if (shipP1.equals(shipP2)) {
						System.out.println("\nThe start and end point of the ship cannot be the same! Try again!");
					}
					char column1 = shipP1.charAt(0);
					char column2 = shipP2.charAt(0);
					char row1C = shipP1.charAt(1);
					char row2C = shipP2.charAt(1);
					int row1 = Character.getNumericValue(row1C);
					int row2 = Character.getNumericValue(row2C);
					else if (column1 != column2) {
						System.out.println("This ship was not placed horizontally. Try Again!");
					}
					int checker = Math.abs(row1 - row2);
					else if (checker != 2) {
						
					}
				}
			}
			else {
				System.out.println("\nWhere would you like to place your " + x + " length ship?  Please type in the position of ships using the first and last point (Ex. A1  to A5).");
				System.out.print("Position 1: ");
				shipP1 = keyboard.nextLine();
				System.out.print("\nPosition 2: ");
				shipP2 = keyboard.nextLine();
				shipPlacementChecker();
			}	
		}
	}
	public void shipPlacementChecker() {
		if (shipP1.equals(shipP2)) {
			System.out.println("The ship cannot start and end on the same point. Try again! ");
		}
		else if (shipP1.equals(shipP2)) {
			System.out.println("The ship cannot start and end on the same point. Try again! ");
		}
	}
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
	}
}
