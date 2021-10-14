public class Computer {
	
	public void Computer() {
		
		int[][] compBoard = new int[10][10];
		
		//print numbers across top 
		for (int i = 0; i < compBoard.length; i++) {
			//print start of row in letters 
			for (int j = 0; j < compBoard[0].length; j++) {
					System.out.print(compBoard[i][j] + " "); 
				}
			System.out.println("");
		}
		
		int orient = (int)(Math.random()*2); //0 = horizontal, 1 = vertical
		int start =(int)(Math.random()*10) + 1; 
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
		
} 

