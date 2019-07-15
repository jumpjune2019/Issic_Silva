import java.io.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
 
import javax.swing.JFrame;
import javax.swing.JRootPane;
import javax.swing.JTextField;

public class Main {
	
	//start of key listener
	//Key Listener implementation written by Alice Storey, all credit goes to her
	//for a top notch approach to entering characters seamlessly.
	
			private static CharListener listener = new CharListener();
			
			public static class CharListener implements KeyListener{
				JFrame frame = new JFrame();
				char result = ' ';
				
				CharListener(){
					super();
				}

				@Override
				public void keyTyped(KeyEvent e) {
					// TODO Auto-generated method stub
					synchronized(frame) {
						frame.setVisible(false);
						frame.dispose();  
			            frame.notify();  
					}
					result = e.getKeyChar();
				}

				@Override
				public void keyPressed(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void keyReleased(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				 public void setFrame(JFrame frame) {
				    	this.frame = frame;
				    }
				    
				    public JFrame getFrame() {
				    	return this.frame;
				    }
				    
				    public char getChar() {
				    	return result;
				    }
				}
				
				public static char getCh() {  
			         
					JFrame frame = new JFrame();
			        synchronized (frame) {  
			            frame.setUndecorated(true);  
			            frame.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);  
			            
			            listener.setFrame(frame);
			            frame.addKeyListener((KeyListener)listener);  
			            frame.setVisible(true);  
			            try {  
			                frame.wait();  
			            } catch (InterruptedException e1) {  
			            }  
			        } 
			        KeyListener klistener = frame.getKeyListeners()[0];
			        return ((CharListener)klistener).getChar();
			        
				}
			

	public static void main(String[] args) throws Exception{
		
		char input = ' ';
		
		
		
		System.out.println("Main thread is starting");
		MyThread currentThread = null;
		MyThread firstThread = new MyThread("1");
		MyThread secondThread = new MyThread("2");
		MyThread thirdThread = new MyThread("3");
		MyThread fourthThread = new MyThread("4");
		MyThread fifthThread = new MyThread("5");
		
		Frame frame = new Frame();
		input = getCh();
		input = Character.toUpperCase(input);
		System.out.println("this has" + input);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int counter = 5;
		int takeControl = 0;

		boolean firstTimeThrough = true;
		
		//input = br.readLine();
		
		do {
			
			try {
				if(counter != 0) {
					input = getCh();
					input = Character.toUpperCase(input);
				}else {
					break;
				}
	
				switch(input) {
				
				
					case '1':{
						
						
						if(firstTimeThrough == true) {
							currentThread = firstThread;
							firstTimeThrough = false;
						}
						
	
						if(takeControl == 1) {
							
							if(currentThread == firstThread) {
								
								if(currentThread.isSuspended()) {
									currentThread.myResume();
								}else {
									currentThread.mySuspend();
								}//end innermost if
								
							}//end second if
							
						}else {
							System.out.println("Controlling thread 1");
							currentThread = firstThread;
							takeControl = 1;
						}
					
						
						break;
					}//end case 1
					
					case '2':{
						
						
						if(firstTimeThrough == true) {
							currentThread = secondThread;
							firstTimeThrough = false;
						}
						
						
						if(takeControl == 2) {
							
							if(currentThread == secondThread) {
								
								if(currentThread.isSuspended()) {
									currentThread.myResume();
								}else {
									currentThread.mySuspend();
									
								}//end innermost if
								
							}//end second if
							
						}else {
							System.out.println("Controlling thread 2");
							currentThread = secondThread;
							takeControl = 2;
						}
						
						
						break;
					}
					
					case '3':{
						
						if(firstTimeThrough == true) {
							currentThread = thirdThread;
							firstTimeThrough = false;
						}
						
						if(takeControl == 3) {
							
							if(currentThread == thirdThread) {
								
								if(currentThread.isSuspended()) {
									currentThread.myResume();
								}else {
									currentThread.mySuspend();
									
								}//end innermost if
								
							}//end second if
							
						}else {
							System.out.println("Controlling thread 3");
							currentThread = thirdThread;
							takeControl = 3;
						}
						
						
						break;
					}
					case '4':{
						
						if(firstTimeThrough == true) {
							currentThread = fourthThread;
							firstTimeThrough = false;
						}
						
						
						if(takeControl == 4) {
							
							if(currentThread == fourthThread) {
								
								if(currentThread.isSuspended()) {
									currentThread.myResume();
								}else {
									currentThread.mySuspend();
									
								}//end innermost if
								
							}//end second if
							
						}else {
							System.out.println("Controlling thread 4");
							currentThread = fourthThread;
							takeControl = 4;
						}
						
						break;
					}
					case '5':{
						
						if(firstTimeThrough == true) {
							currentThread = fifthThread;
							firstTimeThrough = false;
						}
						
						
						if(takeControl == 5) {
							
							if(currentThread == fifthThread) {
								
								if(currentThread.isSuspended()) {
									currentThread.myResume();
								}else {
									currentThread.mySuspend();
									
								}//end innermost if
								
							}//end second if
							
						}else {
							System.out.println("Controlling thread 5");
							currentThread = fifthThread;
							takeControl = 5;
						}					
						
						
						break;
					}
					
					case 'S':{
						
						if(currentThread != null) {
							
							System.out.println("Permanently stopping the execution of Thread " + currentThread.getMyName());
							System.out.println();
							counter--;
							currentThread.myStop();
							
	
							if(firstThread.isMyThreadAlive() && !currentThread.getMyName().equals("1")) {
								if(firstThread.isSuspended()) {
									System.out.println("thread 1: paused");
								}else {
									System.out.println("thread 1: running");
								}
							}
							if(secondThread.isMyThreadAlive() && !currentThread.getMyName().equals("2")) {
								if(secondThread.isSuspended()) {
									System.out.println("thread 2: paused");
								}else {
									System.out.println("thread 2: running");
								}
							}
							if(thirdThread.isMyThreadAlive() && !currentThread.getMyName().equals("3")) {
								if(thirdThread.isSuspended()) {
									System.out.println("thread 3: paused");
								}else {
									System.out.println("thread 3: running");
								}							}
							if(fourthThread.isMyThreadAlive() && !currentThread.getMyName().equals("4")) {
								if(fourthThread.isSuspended()) {
									System.out.println("thread 4: paused");
								}else {
									System.out.println("thread 4: running");
								}
							}
							if(fifthThread.isMyThreadAlive() && !currentThread.getMyName().equals("5")) {
								
								if(fifthThread.isSuspended()) {
									System.out.println("thread 5: paused");
								}else {
									System.out.println("thread 5: running");
								}
							}
							
					
						}//end big if
						
						
						break;
						
					}//end case S
					
					case 'T':{
						
						if(currentThread != null) {
							currentThread.setMyThreadPriority("T");
							//System.out.println("The current thread is:" + currentThread.getMyName());
							//System.out.println("Priority is: " + currentThread.getMyThreadPriority());
						}
						break;
						
					}
					
					case 'N':{
						
						if(currentThread != null) {
							currentThread.setMyThreadPriority("N");
							//System.out.println("The current thread is:" + currentThread.getMyName());
							//System.out.println("Priority is: " + currentThread.getMyThreadPriority());
						}
						break;
						
					}
					
					case 'L':{
						
						if(currentThread != null) {
							currentThread.setMyThreadPriority("L");
							//System.out.println("The current thread is:" + currentThread.getMyName());
							//System.out.println("Priority is: " + currentThread.getMyThreadPriority());
						}
						break;
						
					}
								
					default:{
						throw new WrongInputException();
					}
					
				
				
				}//end switch statement
			
			}catch(WrongInputException e) {
				System.out.println("Press 1-5 to access a thread. Press again to pause and resume the thread.");
				System.out.println("Press T to set priority to high, L for low, and N for normal.");
				System.out.println("Press S to terminate a thread.");
				continue;
			}
			

			
		}while(allAlive(firstThread, secondThread, thirdThread, fourthThread, fifthThread));
		
		
		System.out.println("Main thread terminating");
		
	}//end main

	
	
	
	public static boolean allAlive(MyThread one, MyThread two, MyThread three, MyThread four, MyThread five) {
		
		boolean flag = false;
		
		if(one.isMyThreadAlive() || two.isMyThreadAlive() || three.isMyThreadAlive() || four.isMyThreadAlive() || five.isMyThreadAlive()) {
			flag = true;
		}
		
		return flag;
		
	}//end allAlive
	
		

	
}//end class