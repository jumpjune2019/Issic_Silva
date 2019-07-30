//By Issic Silva
package headortail;

import java.awt.FlowLayout;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//GUI Stuff
		SwingUtilities.invokeLater(new Runnable() {
			SwingDemo demo;
			JFrame frm;
			
			public void run() {
				demo = new SwingDemo("Head or Tail");
				frm = demo.getFrame();
				frm = setFrameStuff(frm, JFrame.EXIT_ON_CLOSE, 400, 300);
				frm.setVisible(true);
			}
		});
	}
	
	public static String headOrTail() {

		String endResult;
		
		RandomNumber random = () -> (int)( Math.floor( Math.random() + 1.5 ) );
		
		HeadOrTail result = (number) -> {
			boolean flip;
			if(number == 2) {
				flip = true;
			}else {
				flip = false;
			}
			return flip;
		};
	
		boolean flip = result.decide(random.onetwo());
	
		if(flip) {
			endResult = "Heads!";
		}else {
			endResult = "Tails!";
		}
		return endResult;
		
	}
	
	public static void centerAndSizeJFrameOnScreen(JFrame frm, int width, int height) {
		// set the size of the frame to half in width and height
		frm.setSize(width/2, height/2);
		// here's the part where the JFrame gets actually centered
		frm.setLocationRelativeTo(null);
	}
	
	public static JFrame setFrameStuff(JFrame frm, int onExit, int width, int height) {
		// this will center and size the JFrame on screen
		// it will have a height and width of half the screen
		centerAndSizeJFrameOnScreen(frm, width, height);
		frm.setDefaultCloseOperation(onExit);
		
		JPanel panel1 = new JPanel();
		
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
		
		ButtonDemo bd = new ButtonDemo();
		bd.setButtons(panel1, "Click to Flip!", "Reset", headOrTail(), "Waiting...");
		
		frm.add(panel1);
		return frm;
	}
}
