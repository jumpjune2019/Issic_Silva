import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent; 
import java.awt.event.ItemListener; 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton; 

public class Main { 

	// Main Method 
	public static void main(String args[]) 
	{ 

		// create a frame and set title 
		JFrame frame = new JFrame("Selecting Toggle"); 

		// set the default close operation of the frame 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

		//create a panel 
        JPanel panel =new JPanel(); 
        GridLayout gridLayout = new GridLayout(0,1);
        panel.setLayout(gridLayout);
        
		JLabel titleLabel = new JLabel("Push a Button");
		
		JLabel label = new JLabel();
		
		// create a ToggleButton 
		JToggleButton toggleButton = new JToggleButton("On/Off"); 

		// ItemListener is notified whenever you clcik on the Button 
		ItemListener itemListener = new ItemListener() { 

			// itemStateChanged() method is nvoked automatically 
			// whenever you click or unlick on the Button. 
			public void itemStateChanged(ItemEvent itemEvent) 
			{ 

				// event is generated in button 
				int state = itemEvent.getStateChange(); 

				// if selected print selected in console 
				if (state == ItemEvent.SELECTED) { 
					label.setText("Button is on"); 
				} 
				else { 

					// else print deselected in console 
					label.setText("Button is off"); 				} 
			} 
		}; 

		// Attach Listeners 
		toggleButton.addItemListener(itemListener);

		panel.add(titleLabel);
		panel.add(toggleButton);
		panel.add(label);
		frame.add(panel);
		frame.setSize(300, 125); 
		frame.setVisible(true); 
	} 
} 