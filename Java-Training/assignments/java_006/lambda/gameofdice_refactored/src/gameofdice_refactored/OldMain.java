package gameofdice_refactored;

import java.util.Scanner;

public class OldMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		boolean playAgain = false;
		boolean askOnlyOnce = false;
		String throwDie = null;
		
		do {
			//boolean to ask to quit only once
			if(askOnlyOnce == false) {
			System.out.println("Welcome to the dice throw challenge!");
			System.out.println("Do you feel lucky? Punk... Do ya?");
			System.out.println("Press any key and Enter to throw your dice or press (Q or q) to chicken your butt off...)");
			throwDie = scan.nextLine();
			askOnlyOnce = true;
			}
			
				//if program not terminated throw die and continue
				if(throwDie.equalsIgnoreCase("q")) {
					System.out.println("See ya later alligator!");
					System.exit(0);
				}else {
					
					int playerDie1 = 0;
					int playerDie2 = 0;
					
					int computerDie1 = 0;
					int computerDie2 = 0;
					
					System.out.println("Rolling the dice!!");
					
					
					
					//call method to roll each die
				    playerDie1 = throwDie(playerDie1);
				    playerDie2 = throwDie(playerDie2);
				    
				    computerDie1 = throwDie(computerDie1);
				    computerDie2 = throwDie(computerDie2);
				    
				    int playerTotal = playerDie1 + playerDie2;
				    int computerTotal = computerDie1 + computerDie2;
				    
				    //if player wins
					if(playerTotal > computerTotal) {
						System.out.println("You have rolled a " + playerDie1 + " and " + playerDie2 + " > the " + getLabel(playerDie1, playerDie2));
						System.out.println("I have rolled a " + computerDie1 + " and " + computerDie2 + " > the " + getLabel(computerDie1, computerDie2));
						System.out.println("You win!!");
						System.out.print("Did you cheat?? Gimme another try, c'mon ");
					//computer wins
					}else if (computerTotal > playerTotal) {
						System.out.println("You have rolled a " + playerDie1 + " and " + playerDie2 + " > the " + getLabel(playerDie1, playerDie2));
						System.out.println("I have rolled a " + computerDie1 + " and " + computerDie2 + " > the " + getLabel(computerDie1, computerDie2));
						System.out.println("I win!!");
						System.out.print("Wanna try again? ");
					}else {
						//System.out.println("It's a tie. Results total: Player: " + playerTotal + ", Computer: " + computerTotal);
						//computer looses on a tie because of a double
						if(playerDie1 == playerDie2 & computerDie1 != computerDie2) {
							System.out.println("You have rolled a " + playerDie1 + " and " + playerDie2 + " > the " + getLabel(playerDie1, playerDie2));
							System.out.println("I have rolled a " + computerDie1 + " and " + computerDie2 + " > the " + getLabel(computerDie1, computerDie2));
							System.out.println("Damn! You win on a Double! What Luck!");
							System.out.print("Did you cheat?? Gimme another try. c'mon ");
							//if computer wins on a tie because of a double
						}else if(computerDie1 == computerDie2 & playerDie1 != playerDie2) {
							System.out.println("You have rolled a " + playerDie1 + " and " + playerDie2 + " > the " + getLabel(playerDie1, playerDie2));
							System.out.println("I have rolled a " + computerDie1 + " and " + computerDie2 + " > the " + getLabel(computerDie1, computerDie2));
							System.out.println("Damn! I win on a Double! Ah! I pity you fool!");
							System.out.print("Wanna try again? ");
							//tie no doubles
						}else {
							System.out.println("You have rolled a " + playerDie1 + " and " + playerDie2 + " > the " + getLabel(playerDie1, playerDie2));
							System.out.println("I have rolled a " + computerDie1 + " and " + computerDie2 + " > the " + getLabel(computerDie1, computerDie2));
							System.out.print("Stalemate! You're tough, let's try for a tie-breaker ");
						}
					}
				
					System.out.println("Press any key and ENTER to throw your dice or press (Q or q) to quit.");
					String input = scan.nextLine();
					//condition to end loop if user does not want to play again.
					if(input.equalsIgnoreCase("q")) {
						System.out.println("Thanks for being a sport! laters!");
						playAgain = true;
				}
			}
			
			}while(!playAgain);
	}
	
	//method to simulate rolling one die 
	public static  int throwDie(int result){
		
		int max = 6;
		int min = 1;
		
		int range = max-min +1;
		
		int rand = (int)(Math.random() * range) + min;
		
		return rand;
		
	}
	
	public static String getLabel(int diceRollOne, int diceRollTwo) {
		
		int columns = 7;
	    int rows = 7;

	    String[][] diceLabelArray = new String[columns][rows];
	    diceLabelArray[0][0] = " ";
	    diceLabelArray[0][1] = "One";
	    diceLabelArray[0][2] = "Two";
	    diceLabelArray[0][3] = "Three";
	    diceLabelArray[0][4] = "Four";
	    diceLabelArray[0][5] = "Five";
	    diceLabelArray[0][6] = "Six";

	    diceLabelArray[1][0] = "One";
	    diceLabelArray[1][1] = "Snake Eyes";
	    diceLabelArray[1][2] = "Australian Yo";
	    diceLabelArray[1][3] = "Little Joe From Kokomo";
	    diceLabelArray[1][4] = "No field five";
	    diceLabelArray[1][5] = "Easy Six";
	    diceLabelArray[1][6] = "Six One You're Done";
	    
	    diceLabelArray[2][0] = "Two";
	    diceLabelArray[2][1] = "Ace Caught A Deuce";
	    diceLabelArray[2][2] = "Ballerina";
	    diceLabelArray[2][3] = "The Fever";
	    diceLabelArray[2][4] = "Jimmie Hicks";
	    diceLabelArray[2][5] = "Benny Blue";
	    diceLabelArray[2][6] = "Easy Eight";
	    
	    diceLabelArray[3][0] = "Three";
	    diceLabelArray[3][1] = "Easy Four";
	    diceLabelArray[3][2] = "OJ";
	    diceLabelArray[3][3] = "Brooklyn Forest";
	    diceLabelArray[3][4] = "Big Red";
	    diceLabelArray[3][5] = "Eighter From Decatur";
	    diceLabelArray[3][6] = "Nina From Pasadena";
	    
	    diceLabelArray[4][0] = "Four";
	    diceLabelArray[4][1] = "Little Phoebe";
	    diceLabelArray[4][2] = "Easy six";
	    diceLabelArray[4][3] = "Skinny Mckinney";
	    diceLabelArray[4][4] = "Square Pair";
	    diceLabelArray[4][5] = "Railroad Nine";
	    diceLabelArray[4][6] = "Big One On The End";
	    
	    diceLabelArray[5][0] = "Five";
	    diceLabelArray[5][1] = "Sixie From Dixie";
	    diceLabelArray[5][2] = "Skinny Dugan";
	    diceLabelArray[5][3] = "Easy Eight";
	    diceLabelArray[5][4] = "Jesse James";
	    diceLabelArray[5][5] = "Puppy Paws";
	    diceLabelArray[5][6] = "Yo";
	    
	    diceLabelArray[6][0] = "Six";
	    diceLabelArray[6][1] = "The Devil";
	    diceLabelArray[6][2] = "Easy Eight";
	    diceLabelArray[6][3] = "Lou Brown";
	    diceLabelArray[6][4] = "Tennessee";
	    diceLabelArray[6][5] = "Six Five No Jive";
	    diceLabelArray[6][6] = "Midnight";
		
	    String result = null;
	    
		for(int i = 0; i <= diceLabelArray.length; i++) {
			for(int j = 0; j <= diceLabelArray.length; j++) {
				if(diceRollOne == i & diceRollTwo == j) {
					result = diceLabelArray[i][j];
				}
			}
		}
		return result;
	}

}
