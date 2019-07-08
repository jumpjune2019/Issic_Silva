package Main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
				
		int columns = 7;
	    int rows = 7;

	    String[][] diceLabelArray = new String[columns][rows];
	    diceLabelArray[0][0] = "      ";
	    diceLabelArray[0][1] = " One";
	    diceLabelArray[0][2] = "                 Two";
	    diceLabelArray[0][3] = "              Three";
	    diceLabelArray[0][4] = "                   Four";
	    diceLabelArray[0][5] = "            Five";
	    diceLabelArray[0][6] = "                   Six";

	    diceLabelArray[1][0] = "One";
	    diceLabelArray[1][1] = "    Snake Eyes";
	    diceLabelArray[1][2] = "          Australian Yo";
	    diceLabelArray[1][3] = "    Little Joe From Kokomo";
	    diceLabelArray[1][4] = "  No field five";
	    diceLabelArray[1][5] = "   Easy Six";
	    diceLabelArray[1][6] = "               Six One You're Done";
	    
	    diceLabelArray[2][0] = "Two";
	    diceLabelArray[2][1] = "    Ace Caught A Deuce";
	    diceLabelArray[2][2] = "  Ballerina";
	    diceLabelArray[2][3] = "        The Fever";
	    diceLabelArray[2][4] = "               Jimmie Hicks";
	    diceLabelArray[2][5] = "    Benny Blue";
	    diceLabelArray[2][6] = "             Easy Eight";
	    
	    diceLabelArray[3][0] = "Three";
	    diceLabelArray[3][1] = "  Easy Four";
	    diceLabelArray[3][2] = "           OJ";
	    diceLabelArray[3][3] = "               Brooklyn Forest";
	    diceLabelArray[3][4] = "         Big Red";
	    diceLabelArray[3][5] = "         Eighter From Decatur";
	    diceLabelArray[3][6] = "   Nina From Pasadena";
	    
	    diceLabelArray[4][0] = "Four";
	    diceLabelArray[4][1] = "   Little Phoebe";
	    diceLabelArray[4][2] = "       Easy six";
	    diceLabelArray[4][3] = "         Skinny Mckinney";
	    diceLabelArray[4][4] = "         Square Pair";
	    diceLabelArray[4][5] = "     Railroad Nine";
	    diceLabelArray[4][6] = "          Big One On The End";
	    
	    diceLabelArray[5][0] = "Five";
	    diceLabelArray[5][1] = "   Sixie From Dixie";
	    diceLabelArray[5][2] = "    Skinny Dugan";
	    diceLabelArray[5][3] = "     Easy Eight";
	    diceLabelArray[5][4] = "              Jesse James";
	    diceLabelArray[5][5] = "     Puppy Paws";
	    diceLabelArray[5][6] = "             Yo";
	    
	    diceLabelArray[6][0] = "Six";
	    diceLabelArray[6][1] = "    The Devil";
	    diceLabelArray[6][2] = "           Easy Eight";
	    diceLabelArray[6][3] = "       Lou Brown";
	    diceLabelArray[6][4] = "               Tennessee";
	    diceLabelArray[6][5] = "       Six Five No Jive";
	    diceLabelArray[6][6] = "       Midnight";
	    
	    

	    
	    
	    System.out.println("Dice Combinations Label Matrix");
	    
	    for(int i = 0; i < rows; i++){
	        for(int j = 0; j < columns; j++){
	            System.out.print(diceLabelArray[i][j]);
	        }
	        System.out.println();
	    }
	}

}
