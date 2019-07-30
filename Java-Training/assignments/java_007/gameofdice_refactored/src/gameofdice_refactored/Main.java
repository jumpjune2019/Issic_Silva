package gameofdice_refactored;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.*;
import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SwingUtilities.invokeLater(new Runnable() {
			Swing demo;
			JFrame frame;
			
			public void run() {
				demo = new Swing("Game of Dice");
				frame = demo.getFrame();
				frame = setFrameStuff(frame, JFrame.EXIT_ON_CLOSE, 400, 200);
				frame.setVisible(true);
			}
		});
	}
	
	public static String rollDice() {
		
		String message;
		
		Label label = (diceRollOne, diceRollTwo) -> {
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
		};
		
		int playerDie1 = 0;
		int playerDie2 = 0;
		
		int computerDie1 = 0;
		int computerDie2 = 0;
		
		
		Die die = (result) -> {
			int max = 6;
			int min = 1;
			
			int range = max-min +1;
			
			int rand = (int)(Math.random() * range) + min;
			
			return rand;
		};
		
		//call method to roll each die
	    playerDie1 = die.throwDie(playerDie1);
	    playerDie2 = die.throwDie(playerDie2);
	    
	    computerDie1 = die.throwDie(computerDie1);
	    computerDie2 = die.throwDie(computerDie2);
	    
	    int playerTotal = playerDie1 + playerDie2;
	    int computerTotal = computerDie1 + computerDie2;
	    
	    //if player wins
		if(playerTotal > computerTotal) {
			message = ("You have rolled a " + playerDie1 + " and " + playerDie2 + " > the " + label.getLabel(playerDie1, playerDie2) + "\n" +
			          "I have rolled a " + computerDie1 + " and " + computerDie2 + " > the " + label.getLabel(computerDie1, computerDie2) + "\n" +
			          "You win!! \n"  +
			          "Did you cheat?? Gimme another try, c'mon ");
		//computer wins
		}else if (computerTotal > playerTotal) {
			message = ("You have rolled a " + playerDie1 + " and " + playerDie2 + " > the " + label.getLabel(playerDie1, playerDie2) + "\n" +
					  "I have rolled a " + computerDie1 + " and " + computerDie2 + " > the " + label.getLabel(computerDie1, computerDie2) + "\n" +
					  "I win!! \n" +
					  "Wanna try again? ");
		}else {
			//System.out.println("It's a tie. Results total: Player: " + playerTotal + ", Computer: " + computerTotal);
			//computer looses on a tie because of a double
			if(playerDie1 == playerDie2 & computerDie1 != computerDie2) {
				message = ("You have rolled a " + playerDie1 + " and " + playerDie2 + " > the " + label.getLabel(playerDie1, playerDie2) + "\n" +
					       "I have rolled a " + computerDie1 + " and " + computerDie2 + " > the " + label.getLabel(computerDie1, computerDie2) + "\n" +
					       "Damn! You win on a Double! What Luck! \n" +
					       "Did you cheat?? Gimme another try. c'mon ");
				//if computer wins on a tie because of a double
			}else if(computerDie1 == computerDie2 & playerDie1 != playerDie2) {
				message = ("You have rolled a " + playerDie1 + " and " + playerDie2 + " > the " + label.getLabel(playerDie1, playerDie2) + "\n" +
						   "I have rolled a " + computerDie1 + " and " + computerDie2 + " > the " + label.getLabel(computerDie1, computerDie2) + "\n" +
						   "Damn! I win on a Double! Ah! I pity you fool! \n" +
					   	   "Wanna try again? ");
				//tie no doubles
			}else {
				message = ("You have rolled a " + playerDie1 + " and " + playerDie2 + " > the " + label.getLabel(playerDie1, playerDie2) + "\n" +
						   "I have rolled a " + computerDie1 + " and " + computerDie2 + " > the " + label.getLabel(computerDie1, computerDie2) + "\n" +
					   	   "Stalemate! You're tough, let's try for a tie-breaker ");
			}
		}
		
		//System.out.println(message);
		return message;
	}
	
	public static JFrame setFrameStuff(JFrame frame, int onExit, int width, int height) {
		// this will center and size the JFrame on screen
		// it will have a height and width of half the screen
		centerAndSizeJFrameOnScreen(frame, 650, 600);
		frame.setDefaultCloseOperation(onExit);
		
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		
		JButton roll = new JButton("Roll Dice");
		JButton quit = new JButton("Quit Game");
		
		JTextArea welcome = new JTextArea ("Welcome to the dice throw challenge! \n\r Do you feel lucky? Punk...Do ya? \n Click Roll Dice button to play and Quit Game to quit.");
		JTextArea text = new JTextArea ("Waiting...");
		
		Font font = welcome.getFont();
		welcome.setFont(font.deriveFont(Font.BOLD));
		text.setFont(font.deriveFont(Font.BOLD));
		
		panel.setLayout(new BorderLayout(50,50));
		panel2.setLayout(new FlowLayout());
		
		roll.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text.setText(rollDice());
			}
			
		});
		
		quit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);	}
			
		});
		
		panel2.add(roll);
		panel2.add(quit);
		panel.add(panel2, BorderLayout.SOUTH);
		panel.add(welcome, BorderLayout.NORTH);
		panel.add(text, BorderLayout.CENTER);
		frame.add(panel);
		return frame;
	}
	
	public static void centerAndSizeJFrameOnScreen(JFrame frame, int width, int height) {
		// set the size of the frame to half in width and height
		frame.setSize(width/2, height/2);
		// here's the part where the JFrame gets actually centered
		frame.setLocationRelativeTo(null);
	}
}
