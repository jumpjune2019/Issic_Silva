package headortail;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.*;

public class ButtonDemo  implements ActionListener {
	JLabel jlab;
	JLabel jlabTitle;
	String first;
	String second;
	String firstMsg;
	String secondMsg;
	
	public void setButtons(JPanel frm, String f, String s, String fMsg, String sMsg) {
		first = f;
		second = s;
		firstMsg = fMsg;
		secondMsg = sMsg;
		
		JButton flip = new JButton(first);
		JButton reset = new JButton(second);
		
		//create labels
		jlab = new JLabel("Waiting...");
		jlabTitle = new JLabel("Heads Or Tails");
		
		//add action listeners
		flip.addActionListener(new ActionListener() { 
		    public void actionPerformed(ActionEvent e) { 
		    	 jlab.setText(Main.headOrTail());
		    } 
		});
		
		reset.addActionListener(new ActionListener() { 
		    public void actionPerformed(ActionEvent e) { 
		        jlab.setText("Waiting...");
		    } 
		});
		
		// Add title label to the frame.
		frm.add(jlabTitle);
		
		// Add the buttons to the content pane.
		frm.add(flip);
		frm.add(reset);
		
		// Add the result label to the frame.
		frm.add(jlab);
	}
	
	// Handle button events.

	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand().equals(first)) {
			jlab.setText(firstMsg);
		} else {
			jlab.setText(secondMsg);
		}
	}
}
