import java.awt.event.*;
import java.util.ArrayList;
import java.awt.*; 
import javax.swing.*; 
class Main extends JFrame implements ItemListener { 
  
    // frame 
    static JFrame frame; 
  
    // label 
    static JLabel label, label2; 
  
    // checkbox 
    static JCheckBox check1, check2, check3; 
    
    // list
    static ArrayList<String> list = new ArrayList<String>();
  
    // main class 
    public static void main(String[] args) 
    { 
        // create a new frame 
        frame = new JFrame("frame"); 
  
        // create a object 
        Main s = new Main(); 
  
        // set layout of frame 
        frame.setLayout(new FlowLayout()); 
  
        // create checkbox 
        check1 = new JCheckBox("Web", false); 
        check2 = new JCheckBox("Desktop", false); 
        check3 = new JCheckBox("Mobile", false); 
  
        // add ItemListener 
        check1.addItemListener(s); 
        check2.addItemListener(s);
        check3.addItemListener(s); 
  
        // create labels 
        label = new JLabel("Clicked: "); 
        label2 = new JLabel("<none>"); 
  
        // create a new panel 
        JPanel panel = new JPanel(); 
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        // add checkbox to panel 
        panel.add(check1); 
        panel.add(check2); 
        panel.add(check3);
        panel.add(label); 
        panel.add(label2); 
  
        // add panel to frame 
        frame.add(panel); 
  
        // set the size of frame 
        frame.setSize(600, 300); 
  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    } 
    public void itemStateChanged(ItemEvent e) 
    { 
        // if the state of checkbox1 is changed 
        if (e.getSource() == check1) { 
            if (e.getStateChange() == 1) {
            	System.out.println(e.getStateChange());
                label.setText("Clicked: " + check1.getText());
                list.add(check1.getText());
            }
            if (e.getStateChange() == 2) {
            	System.out.println(e.getStateChange());
                label.setText("Clicked: " + check1.getText());
                list.remove(list.indexOf(check1.getText()));
            }
        } else if (e.getSource() == check2){ 
        	if (e.getStateChange() == 1) {
            	System.out.println(e.getStateChange());
                label.setText("Clicked: " + check2.getText());
                list.add(check2.getText());
            }
            if (e.getStateChange() == 2) {
            	System.out.println(e.getStateChange());
                label.setText("Clicked: " + check2.getText());
                list.remove(list.indexOf(check2.getText()));
            }
        } else if(e.getSource() == check3){ 
        	if (e.getStateChange() == 1) {
            	System.out.println(e.getStateChange());
                label.setText("Clicked: " + check3.getText());
                list.add(check3.getText());
            }
            if (e.getStateChange() == 2) {
            	System.out.println(e.getStateChange());
                label.setText("Clicked: " + check3.getText());
                list.remove(list.indexOf(check3.getText()));
            }
        }
        try {
        	if(list.size() == 3) {
        		label2.setText(list.get(0) + " " + list.get(1) + " " + list.get(2));
        	}else if(list.size() == 2) {
        		label2.setText(list.get(0) + " " + list.get(1));
        	}else if(list.size() == 1) {
        		label2.setText(list.get(0));
        	}
        
        }catch(Exception a) {
        	label2.setText("<none>");
        }
    } 
} 