import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main {
	
	static int gridColumn = 10;
	static int gridRow = 10;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		
		SwingUtilities.invokeLater(new Runnable() {
			Swing demo;
			JFrame frame;
			
			public void run() {
				demo = new Swing("Matrix Assignment Demo");
				
				frame = demo.getFrame();
				try {
					frame = setFrameStuff(frame, JFrame.EXIT_ON_CLOSE, 400, 200);
				} catch (NumberFormatException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				frame.setVisible(true);
			}
		});
	}
	
public static JFrame setFrameStuff(JFrame frame, int onExit, int width, int height) throws NumberFormatException, IOException {
		
		centerAndSizeJFrameOnScreen(frame, gridColumn * 200, gridRow * 200);
		frame.setDefaultCloseOperation(onExit);
		
		JPanel panelMain = new JPanel(new BorderLayout(0,20));
		JPanel panelNorth = new JPanel(new BorderLayout());
		JPanel panelCenter = new JPanel(new GridLayout(gridRow, gridColumn, 5, 5));
		JPanel panelSouth = new JPanel(new BorderLayout());
		JPanel panelLeft = new JPanel(new BorderLayout());
		
		JLabel northLabel = new JLabel("Basic Matrix Demo");
		northLabel.setHorizontalAlignment(JLabel.CENTER);
		JLabel southLabel = new JLabel("No seat selected.");
		southLabel.setHorizontalAlignment(JLabel.CENTER);
//		JPanel panelArray[][] = new JPanel[gridColumn][gridRow];
//		GridPanels tempPanel;
		
		for(int i = 1; i < gridRow + 1 ; i++) {
			for(int j = 1; j < gridColumn + 1; j++) {
				JPanel tempPanel = new JPanel();
				BoxLayout boxlayout = new BoxLayout(tempPanel, BoxLayout.Y_AXIS);
				tempPanel.setLayout(boxlayout);
				
				JLabel tempLabel = new JLabel(getCharForNumber(i) + "-" + j, JLabel.CENTER);
				JButton tempButton = new JButton(getCharForNumber(i) + "-" + j);
				
				//tempLabel.setAlignmentX(Component.RIGHT_ALIGNMENT);
				tempPanel.add(tempLabel);
				tempPanel.add(tempButton);
				//tempPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
				panelCenter.add(tempPanel);
			}
		}
		ClientJList list = new ClientJList();
		panelLeft.add(list.listPanel);
		
		panelCenter.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		panelNorth.add(northLabel);
		panelSouth.add(southLabel);
		panelMain.add(panelNorth, BorderLayout.NORTH);
		panelMain.add(panelCenter, BorderLayout.CENTER);
		panelMain.add(panelSouth, BorderLayout.SOUTH);
		panelMain.add(panelLeft, BorderLayout.WEST);
		frame.add(panelMain);
		return frame;
	}
	
	private static String getCharForNumber(int i) {
	    return i > 0 && i < 27 ? String.valueOf((char)(i + 64)) : null;
	}
	
	public static void centerAndSizeJFrameOnScreen(JFrame frame, int width, int height) {
		// set the size of the frame to half in width and height
		frame.setSize(width/2, height/2);
		// here's the part where the JFrame gets actually centered
		frame.setLocationRelativeTo(null);
	}

}
