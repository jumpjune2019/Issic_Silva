package Main;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tallyArray[] = {0,0};
		
		int heads = 0;
		int tails = 0;
		
		for(int i =0; i<=1001; i++){
			int result = OneOrTwo();
			
			if(result == 1) {
				tallyArray[0] = heads++;
			}else {
				tallyArray[1] = tails++;
			}
			
		}
		
		System.out.println("1000 Coin Flips");
		System.out.println("Count of Heads: " + tallyArray[0]);
		System.out.println("Count of Tails: " + tallyArray[1]);
	}
	
	public static int OneOrTwo() {
		
		new Random();
		
		int result = (int)(Math.random()*2+1);
		
		return result;
		
	}

}
