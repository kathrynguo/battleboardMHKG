//MACKENZIE'S ORIGNAL CODE IN GITHUB; THESE ARE KATHRYN'S EDITS TO MACKENZIE'S CODE.
//VERSION FOR SUBMISSION :
import java.util.Scanner;

public class BattleBoardMH{
	String shipP1;
	String shipP2;
	int[][] compBoardP = new int[10][10];
	
	public void array() {
		//print numbers across top 
		//changed the printing to numbers so when i take user input it's easier 
		int a = 0;
		char c;
		System.out.print("   1 2 3 4 5 6 7 8 9 10");
		for (int i = 0; i < compBoardP.length; i++) {
			//print start of row in letters 
			a = a + 1;
			c = (char)a;
			System.out.print("\n" + a + "  ");
			for (int j = 0; j < compBoardP[0].length; j++) {
		
					System.out.print(compBoardP[i][j] + " ");
			}//close col loop
		}
	}

	public void rules() {
		System.out.println("\nRules: ");
		System.out.println("You place your ships and the computer will place its ships then you each make guesses as t where eachother's ships are.");
		System.out.println("You get 3 ships to place. You have a 2 length ship,  a 3 length ship, and a 4 length ship.");
		System.out.println("You will choose where to place each ship either horizontally and verticallly, not diagonally.");
		System.out.println("1 DENOTES A SHIP. 2 DENOTES A MISS. 3 DENOTES A HIT.\nYOU MAY GUESS AS MANY TIMES AS YOU WOULD LIKE IN A TURN UNTIL YOU MISS.");
	}

	public void shipPlacementPlayer() {
		int ship1 = 2; 
		int ship2 = 3; 
		int ship3 = 4; 
		
		Scanner ship = new Scanner(System.in); 
		
		System.out.print("\nPRESS 0 TO PLACE YOUR 2-LENGTH SHIP HORIZONTALLY AND 1 TO PLACE IT VERTICALLY: "); 
		int vh1 = ship.nextInt();
		System.out.print("\nIN WHICH ROW WOULD YOU LIKE TO PLACE THIS SHIP?: "); 
		int r1 = ship.nextInt(); 
		System.out.print("\nIN WHICH COLUMN WOULD YOU LIKE TO PLACE THIS SHIP?: "); 
		int c1 = ship.nextInt(); 
		
		System.out.print("\nPRESS 0 TO PLACE YOUR 3-LENGTH SHIP HORIZONTALLY AND 1 TO PLACE IT VERTICALLY: "); 
		int vh2 = ship.nextInt();
		System.out.print("\nIN WHICH ROW WOULD YOU LIKE TO PLACE THIS SHIP?: "); 
		int r2 = ship.nextInt(); 
		System.out.print("\nIN WHICH COLUMN WOULD YOU LIKE TO PLACE THIS SHIP?: "); 
		int c2 = ship.nextInt(); 
		
		System.out.print("\nPRESS 0 TO PLACE YOUR 4-LENGTH SHIP HORIZONTALLY AND 1 TO PLACE IT VERTICALLY: "); 
		int vh3 = ship.nextInt();
		System.out.print("\nIN WHICH ROW WOULD YOU LIKE TO PLACE THIS SHIP?: "); 
		int r3 = ship.nextInt(); 
		System.out.print("\nIN WHICH COLUMN WOULD YOU LIKE TO PLACE THIS SHIP?: "); 
		int c3 = ship.nextInt(); 
		
		//CHANGE VALUES TO 1 BASED ON VERTICAL OR HORIZONTAL
		if (vh1 == 0) {
			for (int k = 0; k < ship1; k++) {
						compBoardP[r1 - 1][c1 + k - 1] = 1;
					}
		}
		else if (vh1 == 1) {
			for (int k = 0; k < ship1; k++) {
						compBoardP[r1 + k - 1][c1 - 1] = 1;
					}
		}
		
		if (vh2 == 0) {
			for (int k = 0; k < ship2; k++) {
						compBoardP[r2 - 1][c2 + k - 1] = 1;
					}
		}
		else if (vh2 == 1) {
			for (int k = 0; k < ship2; k++) {
						compBoardP[r2 - 1 + k][c2 - 1] = 1;
					}
		}
		
		if (vh3 == 0) {
			for (int k = 0; k < ship3; k++) {
						compBoardP[r3 - 1][c3 -1 + k] = 1;
					}
		}
		else if (vh3 == 1) {
			for (int k = 0; k < ship3; k++) {
						compBoardP[r3 -1 + k][c3 - 1] = 1;
					}
		}
		
		
		
		
		//int x = 5;
		/*ORIGINAL WHILE LOOP ERASES THE FIRST SHIP PLACEMENT WHEN THE USER IS PROMPTED AGAIN; THE WHILE LOOP DOENS'T SAVE THE SHIP PLACEMENT TO THE ARRAY.
		while (x > 1) {
			x = x -1;
			Scanner keyboard = new Scanner(System.in);
			
			
		//ASSUMPTIONS:  I'm only inputing one position and always making it go down or to the right	
		
			System.out.print("\nWould you like to place the ship vertically or horizontally:  ");
			String vh = keyboard.nextLine();
			System.out.print("\nWhere would you like to place your " + x + " length ship?  Please type in the starting position of your ship");
			System.out.print("Position: ");
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
				}
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
						
				}
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
		} */
		
		System.out.println("\nYOUR NEW BOARD: \n");
		//MACKENZIE'S
		//changed the printing to numbers so when i take user input it's easier 
		int a = 0;
		char c;
		System.out.print("   1 2 3 4 5 6 7 8 9 10");
		for (int i = 0; i < compBoardP.length; i++) {
			//print start of row in letters 
			a = a + 1;
			c = (char)a;
			System.out.print("\n" + a + "  ");
			for (int j = 0; j < compBoardP[0].length; j++) {
		
					System.out.print(compBoardP[i][j] + " ");
			}//close col loop
		}
		
	}
	
	boolean g = true; //true if you're allowed to keep guessing. false if you miss
	//int guessNum1; 
	//int guessNum2;
	
	public void guess(int[][] arr) { //check human guess against computer
		Scanner guess = new Scanner(System.in);
		
		while (g == true) {
		System.out.print("\nMAKE A GUESS.");
			
		System.out.print("\nYOUR GUESS, ROW: ");
		int guessNum1 = guess.nextInt();
		System.out.print("YOUR GUESS, COLUMN: ");
		int guessNum2 = guess.nextInt();
			
			/*char guessP1 = guess.charAt(0);
				//char column2 = shipP2.charAt(0);
				char guessP2 = guess.charAt(1);
				//char row2C = shipP2.charAt(1);
				int guessNum1 = Character.getNumericValue(guessP1);
				int guessNum2 = Character.getNumericValue(guessP2); */
				
				if (arr[guessNum1-1][guessNum2-1] == 1) {
					System.out.println("HIT. "); 
					arr[guessNum1-1][guessNum2-1] = 3;
					System.out.print("YOUR TURN AGAIN.");
				}
				else if (arr[guessNum1-1][guessNum2-1] == 0) {
					System.out.println("MISS.\n");
					arr[guessNum1-1][guessNum2-1] = 2;
					g = false;
				}
				else if (arr[guessNum1-1][guessNum2-1] == 2 || arr[guessNum1-1][guessNum2-1] == 3){ //this doesn't work for some reason
					System.out.println("YOU'VE ALREADY GUESSED THAT.");
				}
			}
			System.out.println("\nYOUR NEW BOARD WITH MARKERS: ");
			int v = 0;
			char x;
			System.out.print("   1 2 3 4 5 6 7 8 9 10");
			for (int i = 0; i < arr.length; i++) {
				//print start of row in letters 
				v = v + 1;
				x = (char)v;
				System.out.print("\n" + v + "  ");
				for (int j = 0; j < arr[0].length; j++) {
					System.out.print(arr[i][j] + " ");
				}//close col loop
			}
			System.out.println("\n");
			
		}
	
	boolean w = true; 
	
	public void passToComp() {
		Computer comp = new Computer(); 
		comp.compGuess(compBoardP); 
		//LOOPS TO CHECK FOR WINNER
		//TesterBB winhuman = new TesterBB(); 
		//winhuman.humanWin(compBoardP, w);
	}
			
}
	

