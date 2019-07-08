import java.util.Random;

public class Main {

	public static void main(String[] args) {
		HeadsOrTail(OneOrTwo());
			
	}
	
	public static int OneOrTwo() {
		
		new Random();
		
		int result = (int)(Math.random()*2+1);
		
		return result;
		
	}
	
	public static int HeadsOrTail(int result) {
		
		if(result == 1) {
			System.out.println("Coin Flip Program");
			System.out.println("The Coin Flip is: Head");
		}else {
			System.out.println("Coin Flip Program");
			System.out.println("The Coin Flip is: Tail");
		}
		
		return result;
		
	}

}
