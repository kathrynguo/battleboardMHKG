public class FakeHuman{

	int[][] compBoardFH = new int[10][10];
		
	public void placingShipsFH() {
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
						compBoardFH[startR1][startC1 + k] = 1;
					}
				}
				else {
					for (int k = 0; k < ship1; k++) {
						compBoardFH[startR1 + k][startC1] = 1;
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
					} while (compBoardFH[startR2][startC2] == 1 || compBoardFH[startR2][startC2 + 1] == 1 || compBoardFH[startR2][startC2 + 2] == 1);
				}
				else {
					do {
					startR2 =(int)(Math.random()*8); 
					startC2 =(int)(Math.random()*10);
					} while (compBoardFH[startR2][startC2] == 1 || compBoardFH[startR2 + 1][startC2] == 1 || compBoardFH[startR2 + 2][startC2] == 1);
				}
				
				
				if (orient2 == 0) { 
					for (int j = 0; j < ship2; j++) {
						compBoardFH[startR2][startC2 + j] = 1;
					}
				}
				else {
					for (int j = 0; j < ship2; j++) {
						compBoardFH[startR2 + j][startC2] = 1;
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
					} while (compBoardFH[startR3][startC3] == 1 || compBoardFH[startR3][startC3 + 1] == 1 || compBoardFH[startR3][startC3 + 2] == 1 || compBoardFH[startR3][startC3 + 3] == 1);
				}
				else {
					do {
					startR3 =(int)(Math.random()*7); 
					startC3 =(int)(Math.random()*10);
					} while (compBoardFH[startR3][startC3] == 1 || compBoardFH[startR3 + 1][startC3] == 1 || compBoardFH[startR3 + 2][startC3] == 1 || compBoardFH[startR3 + 3][startC3] == 1);
				}
				
				
				if (orient3 == 0) { 
					for (int i = 0; i < ship3; i++) {
						compBoardFH[startR3][startC3 + i] = 1;
					}
				}
				else {
					for (int i = 0; i < ship3; i++) {
						compBoardFH[startR3 + i][startC3] = 1;
					}
				}	
			//compBoard[9][8] = 1;
			
		}
		
		public void printBoardFH() {
			//print numbers across top 
			for (int i = 0; i < compBoardFH.length; i++) {
				//print start of row in letters 
				for (int j = 0; j < compBoardFH[0].length; j++) {
						System.out.print(compBoardFH[i][j] + " "); 
					}
				System.out.println("");
			}
		}
		
		public void passToComp() {
			Computer comp = new Computer(); 
			comp.compGuess(compBoardFH); 
			
		}

}
