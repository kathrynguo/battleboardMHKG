import java.util.Scanner;

public class BBTester {
	public static void main (String[] args) {
		battleBoard myStand = new battleBoard();
		Scanner keyboard = new Scanner(System.in);
		int a = 1;
		int b = 1;
		int gameNum = 1;
		System.out.println(" ");
		System.out.println("Welcome to Battle Board!");
		System.out.println("Would you like to play?");
		System.out.print("Yes or No : ");
		String welcome = keyboard.nextLine();
		while ( a == 1) {
			if (welcome.equals("Yes") || welcome.equals("yes")) {
				System.out.println("\nGame 1: \n");
				myStand.array();
				myStand.rules();
				myStand.shipPlacementPlayer();
				//myStand.shipPlacementComputer();
				a = 0;
				while ( b == 1) {
					gameNum = gameNum + 1;
					Scanner question = new Scanner(System.in);
					System.out.println("\nWould you like to play again?");
					System.out.print("Yes or No : ");
					String playAgain = keyboard.nextLine();
					if ( playAgain.equals("Yes") || playAgain.equals("yes")) {
						b = 1;
						a = 0;
						System.out.println("\nGame " + gameNum + ": \n");
						myStand.array();
						myStand.rules();
						myStand.shipPlacementPlayer();
						//myStand.shipPlacementComputer();
					}
					else if ( playAgain.equals("No") || playAgain.equals("no"))  {
						b = 0;
						a = 0;
						System.out.println("\nThanks for playing! See you again next time!");
					}
					else {
						System.out.println("\nPlease type Yes or No.\n");
						b = 1;
					}
				}
			}
			else if (welcome.equals("No") || welcome.equals("no")) {
				System.out.println("Ok! See you next time!");
				a = 0;
			}
			else {
				System.out.println("Please type Yes or No.");
				a = 1;
			}
		}
	}
}
