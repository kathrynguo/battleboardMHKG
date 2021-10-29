public class Computer {
	
	int[][] compBoard = new int[10][10];
	
	public void emptyBoard() {
		
		//print numbers across top 
		for (int i = 0; i < compBoard.length; i++) {
			//print start of row in letters 
			for (int j = 0; j < compBoard[0].length; j++) {
					System.out.print(compBoard[i][j] + " "); 
				}
			System.out.println("");
		}
	}
		
		
		
	public void placingShips() {
		int ship1 = 2;
		int orient1 = (int)(Math.random()*2); //0 = horizontal, 1 = vertical
		int startR1; 
		int startC1; 
		
		
			if (orient1 == 0){
				startR1 =(int)(Math.random()*10); 
				startC1 =(int)(Math.random()*9); //0-8 ensures that the ship won't start at a place where it runs off the edge (can't start at column = 9 for horizontal ship)
			}
			else {
				startR1 =(int)(Math.random()*9); //can't start at row = 9 for vertical ship 
				startC1 =(int)(Math.random()*10); 
			}
		

			if (orient1 == 0) { 
				for (int k = 0; k < ship1; k++) {
					compBoard[startR1][startC1 + k] = 1;
				}
			}
			else {
				for (int k = 0; k < ship1; k++) {
					compBoard[startR1 + k][startC1] = 1;
				}
			}	
			
			
		int ship2 = 3; 
		int orient2 = (int)(Math.random()*2);
		int startR2; 
		int startC2;
		
			if (orient2 == 0){
				startR2 =(int)(Math.random()*10); 
				startC2 =(int)(Math.random()*8); //can't start at column = 8 or column = 9 for horizontal ship
			}
			else {
				startR2 =(int)(Math.random()*8); //can't start at row = 8 or row = 9 for vertical ship 
				startC2 =(int)(Math.random()*10); 
			}
			
			
			if (orient2 == 0) {
				do { 
				startR2 =(int)(Math.random()*10); 
				startC2 =(int)(Math.random()*8);
				} while (compBoard[startR2][startC2] == 1 || compBoard[startR2][startC2 + 1] == 1 || compBoard[startR2][startC2 + 2] == 1);
			}
			else {
				do {
				startR2 =(int)(Math.random()*8); 
				startC2 =(int)(Math.random()*10);
				} while (compBoard[startR2][startC2] == 1 || compBoard[startR2 + 1][startC2] == 1 || compBoard[startR2 + 2][startC2] == 1);
			}
			
			
			if (orient2 == 0) { 
				for (int j = 0; j < ship2; j++) {
					compBoard[startR2][startC2 + j] = 1;
				}
			}
			else {
				for (int j = 0; j < ship2; j++) {
					compBoard[startR2 + j][startC2] = 1;
				}
			}	
			
			
		int ship3 = 4; 
		int orient3 = (int)(Math.random()*2);
		int startR3; 
		int startC3;
		
			if (orient3 == 0){
				startR3 =(int)(Math.random()*10); 
				startC3 =(int)(Math.random()*7); //can't start at column = 7 or column = 8 or column = 9 for horizontal ship
			}
			else {
				startR3 =(int)(Math.random()*7); //can't start at row= 7 or row = 8 or row = 9 for vertical ship 
				startC3 =(int)(Math.random()*10); 
			}
			
			
			if (orient3 == 0) {
				do { 
				startR3 =(int)(Math.random()*10); 
				startC3 =(int)(Math.random()*7);
				} while (compBoard[startR3][startC3] == 1 || compBoard[startR3][startC3 + 1] == 1 || compBoard[startR3][startC3 + 2] == 1 || compBoard[startR3][startC3 + 3] == 1);
			}
			else {
				do {
				startR3 =(int)(Math.random()*7); 
				startC3 =(int)(Math.random()*10);
				} while (compBoard[startR3][startC3] == 1 || compBoard[startR3 + 1][startC3] == 1 || compBoard[startR3 + 2][startC3] == 1 || compBoard[startR3 + 3][startC3] == 1);
			}
			
			
			if (orient3 == 0) { 
				for (int i = 0; i < ship3; i++) {
					compBoard[startR3][startC3 + i] = 1;
				}
			}
			else {
				for (int i = 0; i < ship3; i++) {
					compBoard[startR3 + i][startC3] = 1;
				}
			}	
		//compBoard[9][8] = 1;
		
	}
	
	public void printBoard() {
		//print numbers across top 
		for (int i = 0; i < compBoard.length; i++) {
			//print start of row in letters 
			for (int j = 0; j < compBoard[0].length; j++) {
					System.out.print(compBoard[i][j] + " "); 
				}
			System.out.println("");
		}
	}

	boolean g1 = false; //allows the computer to keep guessing it they get it right
	boolean g2 = false; //true if there isn't a hit
	boolean g3 = true; //true if there is a hit
	
	public void compGuess(int[][] array) { //checking computer guess against human
		
		//System.out.println("test");
		
		int gr; //guess row
		int gc; //guess column 
		int i = 1;
		
		while (g1 == false) {
			
			gr = (int)(Math.random()*10); 
			gc = (int)(Math.random()*10); 
			
			System.out.println("\nComputer Guess: Row " + gr + ", Column " + gc);
			
			if  (array[gr][gc] != 1) {
				g1 = true; 
				System.out.println("Miss");
				array[gr][gc] = 2;
			}
			
			else if (array[gr][gc] == 1) {  
				
				System.out.println("Hit");
				array[gr][gc] = 3;
				
				if ( gr < 9 && gr > 0 && gc < 9 && gr > 0 ) {
				
					while (g2 == false) { //moving left, right, up, down based on true guess
						if (array[gr + i][gc] == 1) { //if this direction is correct, guess becones true
							//System.out.println("Computer Guess: Row " + (gr + i) + ", Column " + gc);
							//g1 = true;
							while (g3 == true) { //moving in the same direction based on determined direction //spent an hour debugging this just to find out i was missing an equal sign
								//if ((gr + i) <= 9 || (gr + i) >= 0) {
									if (array[gr + i][gc] == 1) { //keep moving in same direction
										//if ((gr + i) <= 9 || (gr + i) >= 0) { //checking bounds
											g3 = true;
											System.out.println("\nComputer Guess: Row " + (gr + i) + ", Column " + gc);
											System.out.println("Hit");
											array[gr + i][gc] = 3;
											i += 1;
									//	}
											if ((gr + i) < 9 && (gr + i) > 0) {
												g3 = true;
											}
											else { //will stop guessing if it reaches a bound
												System.out.println("The computer has reached the edge of the board. It will stop guessing now.");
												//g1 = true;
												g2 = true;
												g3 = false;
											}
									}
									else if (array[gr + i][gc] == 3) { //if there's already a hit there, gets out of the inner while loops and goes back to the original 
										g2 = true;
										g3 = false;
									}
									else { //or else get out of this while loop and go back to original
										g3 = false;
										g1 = true;
										g2 = true;
										//g1 = false;
										array[gr + i][gc] = 2;
										System.out.println("\nComputer Guess: Row " + (gr + i) + ", Column " + gc);
										System.out.println("Miss");
									}
							}
							//g2 = true;
						}
						else if (array[gr - i][gc] == 1) {
							//System.out.println("Computer Guess: Row " + (gr - i) + ", Column " + gc);
							while (g3 == true) { //moving in the same direction based on determined direction 
								//if ((gr - i) <= 9 || (gr - i) >= 0) {
									if (array[gr - i][gc] == 1) { //keep moving in same direction
										//if ((gr - i) <= 9 || (gr - i) >= 0) { //checking bounds
											g3 = true;
											System.out.println("Computer Guess: Row " + (gr - i) + ", Column " + gc);
											System.out.println("Hit");
											array[gr - i][gc] = 3;
											i += 1;
										//}
											if ((gr - i) < 9 && (gr - i) > 0) {
												g3 = true;
											}
											else { //will stop guessing if it reaches a bound
												System.out.println("The computer has reached the edge of the board. It will stop guessing now.");
												//g1 = true;
												g2 = true;
												g3 = false;
											}
									}
									else if (array[gr - i][gc] == 3) {
										g2 = true;
										g3 = false;
									}
									else { //or else get out of this while loop and go back to original
										g3 = false;
										g1 = true;
										g2 = true;
										//g1 = false;
										array[gr - i][gc] = 2;
										System.out.println("Computer Guess: Row " + (gr - i) + ", Column " + gc);
										System.out.println("Miss");
									}
							}
							//g2 = true;
						}
						else if (array[gr][gc + 1] == 1) {
						//System.out.println("Computer Guess: Row " + gr + ", Column " + (gc + 1));
							while (g3 == true) { //moving in the same direction based on determined direction 
								//if ((gc + i) <= 9 || (gc + i) >= 0) {
									if (array[gr][gc + i] == 1) { //keep moving in same direction
										//if ((gc + i) <= 9 || (gc + i) >= 0) { //checking bounds //switched order of loops
											g3 = true;
											System.out.println("\nComputer Guess: Row " + (gr) + ", Column " + (gc + i));
											System.out.println("Hit");
											array[gr][gc + i] = 3;
											i += 1;
										//}
											if ((gc + i) < 9 && (gc + i) > 0) { //checking bounds
												g3 = true;
											}
											else { //will stop guessing if it reaches a bound
												System.out.println("The computer has reached the edge of the board.");
												//g1 = true;
												g2 = true;
												g3 = false;
											}
									}
									else if (array[gr][gc + i] == 3) {
										g2 = true;
										g3 = false; 
									}
									else { //or else get out of this while loop and go back to original
										g3 = false;
										g1 = true;
										g2 = true;
										//g1 = false;
										System.out.println("\nComputer Guess: Row " + gr + ", Column " + (gc + i));
										array[gr][gc + i] = 2;
										System.out.println("Miss");
									}
							}
							//g2 = true;
						}
						else if (array[gr][gc - 1] == 1) {
							//System.out.println("Computer Guess: Row " + gr + ", Column " + (gc - 1));
							while (g3 == true) { //moving in the same direction based on determined direction
								//if ((gc - i) <= 9 || (gc - i) >= 0) { 
									if (array[gr][gc - i] == 1) {
									//	if ((gc - i) <= 9 || (gc - i) >= 0) { //checking bounds
											g3 = true;
											System.out.println("Computer Guess: Row " + (gr) + ", Column " + (gc - i));
											System.out.println("Hit");
											array[gr][gc - i] = 3;
											i += 1;
										//}
											if ((gc - i) < 9 && (gc - i) > 0) {
												g3 = true; 
											}
											else { //will stop guessing if it reaches a bound
												System.out.println("The computer has reached the edge of the board. It will stop guessing now.");
												g1 = true;
												g2 = true;
												g3 = false;
											}
									}
									else if (array[gr][gc - i] == 3) {
										g2 = true;
										g3 = false; //if theres a marker that says you've already gotten a ship there, go back to the beginning
									}
									else { //or else get out of this while loop and go back to original
										g3 = false;
										g1 = true;
										g2 = true;
										//g1 = false;
										array[gr][gc - i] = 2;
										System.out.println("Computer Guess: Row " + gr + ", Column " + (gc - 1));
										System.out.println("Miss");
									}
							}
							//g2 = true;
						}
						else {
							g2 = false;
						}
					}
				}
				else {
					System.out.println("The computer has reached the edge of the board. It will guess again.");
					/* IF I HAD MORE TIME, I'D CREATE CONDTIONALS BASED ON WHICH BOUNDARY IT LIES ON TO ELIMATE THE # OF DIRECTIONS IT CAN GO IN, BUT STILL MAKE GUESSES OFF OF THE FIRST.*/
				}
					
			}

		}
		
		System.out.println("\nCOMPUTER BOARD AFTER TURN");
		System.out.println("PRETEND YOU CAN'T SEE THIS, \nIT'S FOR ORGANIZATION'S SAKE");
		for (int j = 0; j < array.length; j++) {
				//print start of row in letters 
				for (int k = 0; k < array[0].length; k++) {
						System.out.print(array[j][k] + " "); 
					}
				System.out.println("");
			}
		
		
	}
	
	boolean w = false; 
	
	public void passToHuman() { //checking human against computer board
		BattleBoardMH guessCheck = new BattleBoardMH(); 
		guessCheck.guess(compBoard); 
		//LOOPS TO CHECK FOR WINNER
		//TesterBB wincomp = new TesterBB();
		//wincomp.computerWin(compBoard, w);
	}
		
	
		
} 

