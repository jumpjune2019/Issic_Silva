import java.util.Timer;
import java.util.TimerTask;

public class Main {
    static Timer timer = new Timer();
    static int seconds = 0;

    public static void main(String[] agrs) {

        MyTimer();

    }

    public static void MyTimer() {

        TimerTask task;

        task = new TimerTask() {
            @Override
            public void run() { 
            	 if (seconds <= 10) {
                     System.out.println("Seconds = " + seconds);
                     seconds++;
                 } else {
                     // stop the timer
                     cancel();
                 }
            }
        };
         timer.schedule(task, 0, 1000);

    }

}