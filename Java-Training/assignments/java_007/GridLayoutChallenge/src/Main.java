import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Main {

	static int gridColumn = randomNumber();
	static int gridRow = randomNumber();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SwingUtilities.invokeLater(new Runnable() {
			Swing demo;
			JFrame frame;
			
			public void run() {
				demo = new Swing("Game of Dice");
				frame = demo.getFrame();
				frame = setFrameStuff(frame, JFrame.EXIT_ON_CLOSE, 400, 200);
				frame.setVisible(true);
			}
		});
	}
	
	public static int randomNumber() {
		Random getRandomNumber = () -> {
			int max = 5;
			int min = 2;
			
			int range = max-min +1;
			
			int rand = (int)(Math.random() * range) + min;
			
			return rand;
		};
		return getRandomNumber.throwDie();
	}
	
	public static JFrame setFrameStuff(JFrame frame, int onExit, int width, int height) {
		
		System.out.println(gridColumn);
		System.out.println(gridRow);
		centerAndSizeJFrameOnScreen(frame, gridColumn * 300, gridRow * 300);
		frame.setDefaultCloseOperation(onExit);
		
		JPanel panelMain = new JPanel(new BorderLayout(0,40));
		JPanel panelNorth = new JPanel(new BorderLayout());
		JPanel panelCenter = new JPanel(new GridLayout(gridRow, gridColumn, 50, 50));
		JPanel panelSouth = new JPanel(new BorderLayout());
		
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
		
		panelCenter.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		panelNorth.add(northLabel);
		panelSouth.add(southLabel);
		panelMain.add(panelNorth, BorderLayout.NORTH);
		panelMain.add(panelCenter, BorderLayout.CENTER);
		panelMain.add(panelSouth, BorderLayout.SOUTH);
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
