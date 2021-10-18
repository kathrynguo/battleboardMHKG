public class Computer {
	
	public void Computer() {
		
		int[][] compBoard = new int[10][10];
		
		//print numbers across top 
		for (int i = 0; i < compBoard.length; i++) {
			//print start of row in letters 
			//prints out each row of the array one by one with a line in between 
			for (int j = 0; j < compBoard[0].length; j++) {
					System.out.print(compBoard[i][j] + " "); 
				}
			System.out.println("");
		}
		
	//randomly placing row
		int orient = (int)(Math.random()*2); //0 = horizontal, 1 = vertical
		int start =(int)(Math.random()*10) + 1; 
	//need another random for horizontal/veritcal start
		int ship1 = 2;
		int ship2 = 3; 
		int ship3 = 4; 
		
		if (orient == 0) { 
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
//guessing check 
	/*
		public void GuessCheck()  {
			String guess = mackenziesclass.guessing variable //haven't gotten her user input variable
			char row = guess.charAt(0); 
			//assigning int for each row
				if (row == "a" || row == "A") { 
					int roe = 1; 
				}
				else if (row == "b" || row == "B") { 
					roe = 2; 
				}
				else if (row == "c" || row == "C") { 
					roe = 3; 
				}
				else if (row == "d" || row == "D") { 
					roe = 4; 
				}
				else if (row == "e" || row == "E") { 
					roe = 5; 
				}
				else if (row == "f" || row == "F") { 
					roe = 6; 
				}
				else if (row == "g" || row == "G") { 
					roe = 7; 
				}
				else if (row == "h" || row == "H") { 
					roe = 8; 
				}
				else if (row == "i" || row == "I") { 
					roe = 9; 
				}
				else { 
					roe = 10; 
				}
			char column = guess.charAt(1); 
			boolean hit; 
			if (compBoard[roe][column] == 1) {
			* 		hit = true;
			* }
			else {
			* 		hit = false; 
			* }
			
		}
	*/
		
		
} 

