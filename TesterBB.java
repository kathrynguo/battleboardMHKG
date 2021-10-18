public class TesterBB {
	
	public static void main (String[] args) {
	
	Computer newComp = new Computer();
	newComp.printBoard(); 
	newComp.placingShips();
	//printing space in between boards
	System.out.println(""); 
	newComp.emptyBoard(); 
	
	}

}
