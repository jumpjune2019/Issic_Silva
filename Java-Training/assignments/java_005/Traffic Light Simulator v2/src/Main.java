import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Timer;
import java.util.TimerTask;

//Traffic Light Simulator
//Issic Silva

public class Main {
	
	static Timer timer = new Timer();
    static int seconds = 1;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		TrafficLightThread greenThread = new TrafficLightThread("green");
		TrafficLightThread yellowThread = new TrafficLightThread("yellow");
		TrafficLightThread redThread = new TrafficLightThread("red");
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		TrafficLight l1 = TrafficLight.GREEN;
		TrafficLight l2 = TrafficLight.YELLOW;
		TrafficLight l3 = TrafficLight.RED;
		
		TimerTask task;

		//timer
        task = new TimerTask() {
            @Override
            public void run() { 
            	 if (seconds <= 10) {
                     seconds++;
                 } else {
                	 seconds = 1;
                 }
            }
        };
         timer.schedule(task, 0, 1000);
         
		boolean stop = true;
	
		//put threads to sleep after each one fires its message
		do {
			if(bufferedReader.ready()) {
				break;
			}
			
			if(seconds == l1.getSeconds()) {
				greenThread.getLight("green");
				greenThread.sleep("green");
			}
			
			if(bufferedReader.ready()) {
				break;
			}
			
			if(seconds == l2.getSeconds()) {
				yellowThread.getLight("yellow");
				yellowThread.sleep("yellow");
			}
			
			if(bufferedReader.ready()) {
				break;
			}
			
			if(seconds == l3.getSeconds()) {
				redThread.getLight("red");
				redThread.sleep("red");
			}
			
			if(bufferedReader.ready()) {
				break;
			}
			
		}while(stop);
		
		//end all threads
		greenThread.myStop();
		yellowThread.myStop();
		redThread.myStop();
		task.cancel();
		bufferedReader.close();
		System.out.println("Traffic Light Simulator is Done!");
		System.exit(0);
		
	}

}
