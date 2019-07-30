import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;


public class Main extends JPanel{

	JLabel label;
	Rectangle rect = new Rectangle();
	public void paint(Graphics g) {
	    g.drawRect (10, 10, 200, 200);  
	  }

	Main(){
		// Create a new JFrame container.
		JFrame jframe = new JFrame("Basic Swing Demo");
		jframe.setSize(400, 400);
		// Terminate the program when the user closes the application.
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		
		label = new JLabel("This is not drawn on canvas");
		
		
		JButton changeButton = new JButton("Change Color");
		changeButton.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent event) {
	        	Random rand = new Random();
	        	
	        	float r = rand.nextFloat();
	        	float g = rand.nextFloat();
	        	float b = rand.nextFloat();
	        	
	        	Color randomColor = new Color(r, g, b);
	        	rect(getGraphics().setColor(randomColor););
	            label.setForeground(randomColor);
	        }
	    });
		
		
		panel.add(label);
		panel.add(rect);
		panel.add(changeButton);
		jframe.add(panel);
		// Display the frame.
		jframe.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Main();	
			}
		});	
	}
}
