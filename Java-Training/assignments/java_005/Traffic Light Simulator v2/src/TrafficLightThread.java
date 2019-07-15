public class TrafficLightThread implements Runnable {
	
	Thread threadName;
	static boolean stopped;
	static boolean suspended;
	
	TrafficLight l1 = TrafficLight.GREEN;
	TrafficLight l2 = TrafficLight.YELLOW;
	TrafficLight l3 = TrafficLight.RED;
	
	TrafficLightThread(String name){
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
	
	//method to get message
	public void getLight(String name) {
		if(name.equals("green")) {
			System.out.println("Light is " + l1 + " - Go!");
		}else if(name.equals("yellow")) {
			System.out.println("Light is " + l2 + " - Beware!");
		}else if(name.equals("red")) {
			System.out.println("Light is " + l3 + " - Stop!");
		}
	}
	
	//method to put threads to sleep
	public void sleep(String name) {
		if(name.equals("green")) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(name.equals("yellow")) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(name.equals("red")) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}//end class
