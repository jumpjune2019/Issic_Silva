import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Main{

	JLabel label;
	Main(){
		// Create a new JFrame container.
		JFrame jframe = new JFrame("Basic Swing Demo");
		jframe.setSize(600, 600);
		// Terminate the program when the user closes the application.
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		//panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		
		label = new JLabel();
		Image img;
		try {
			img = ImageIO.read(getClass().getResource("fungi.png"));			
			label.setIcon(new ImageIcon(img));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		label.setVerticalTextPosition(JButton.TOP);
		label.setHorizontalTextPosition(JButton.LEFT);
		panel.add(label);
		
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
