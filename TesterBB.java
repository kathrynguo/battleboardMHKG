public class TesterBB {
	
	/* LOOPS TO CHECK FOR WINNER
	public void computerWin(int[][] array1, boolean w1) { //checking for a win
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[0].length; j++) {
					if (array1[i][j] == 1) { //if theres even oen 1 you know you haven't won
						w1 = false;
					}
					else {
						w1 = true;
					}
				}
		}
	}
	
	public void humanWin(int[][] array2, boolean w2) {
			for (int i = 0; i < array2.length; i++) {
				for (int j = 0; j < array2[0].length; j++) {
						if (array2[i][j] == 1) { //if theres even oen 1 you know you haven't won
							w2 = false;
						}
						else {
							w2 = true;
						}
				}
		}
	}
	* */
	
	//pass through and if there is a true then whoever has the true wins
	
	//main
	public static void main (String[] args) {
		
	BattleBoardMH player1 = new BattleBoardMH(); 
	player1.rules(); 
	player1.array(); 
	
	player1.shipPlacementPlayer();
	//player1.guess();
	
	Computer newComp = new Computer();
	//newComp.emptyBoard(); 
	newComp.placingShips();
	System.out.println("\n\nCOMPUTER");
	newComp.printBoard();  
	
	boolean playing = true;
	
		
	while (playing == true) { //alternating turns until win == false
		player1.passToComp(); 
		newComp.passToHuman();
	}
	
	/*
	FakeHuman FH = new FakeHuman();
	FH.placingShipsFH();
	System.out.print("\nFAKE HUMAN\n");
	FH.printBoardFH(); 
	
	FH.passToComp();
	*/
	
	}
	
}
