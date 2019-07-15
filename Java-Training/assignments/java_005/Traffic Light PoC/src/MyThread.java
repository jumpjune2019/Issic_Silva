public class MyThread implements Runnable {

	Thread threadName;
	static boolean stopped;
	static boolean suspended;
	
	TrafficLight l1 = TrafficLight.GREEN;
	TrafficLight l2 = TrafficLight.YELLOW;
	TrafficLight l3 = TrafficLight.RED;
	
	MyThread(String name){
		threadName = new Thread(this, name);
		stopped = false;
		suspended = false;
		threadName.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			synchronized(this) {
				if(stopped) {
					break;
				}
			}//synchronized end
			System.out.println("Light is " + l1 + " - Go!");
			try {
				Thread.sleep(l1.getSeconds()*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//end catch
		}//end while
	}//end run
	// Stop the thread.
	synchronized void myStop() {
		stopped = true;
		suspended = false;
		notify();
	}
	// Suspend the thread.
	synchronized void mysuspend() {
		suspended = true;
	}
	// Resume the thread.
	synchronized void myresume() {
		suspended = false;
		notify();
	}
}//end class