//PoC to get one thread working in the correct time and stop with enter key
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread greenThread = new MyThread("green");
		MyThread yellowThread = new MyThread("yellow");
		MyThread redThread = new MyThread("red");
		
		
		
		Scanner scan = new Scanner(System.in);
		
		while (!(scan.nextLine().equals("")));
		
		greenThread.myStop();
		yellowThread.myStop();
		redThread.myStop();
		System.out.println("Traffic Light Simulator is Done!");
		
	}

}
