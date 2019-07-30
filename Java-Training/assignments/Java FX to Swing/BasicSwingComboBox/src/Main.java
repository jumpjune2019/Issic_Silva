import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 
class Main extends JFrame implements ItemListener { 
  
    // frame 
    static JFrame frame; 
  
    // label 
    static JLabel label, label2; 
  
    // combobox 
    static JComboBox combo; 
  
    // main class 
    public static void main(String[] args) 
    { 
        // create a new frame 
        frame = new JFrame("frame"); 
  
        // create a object 
        Main s = new Main();  
  
        // array of string contating cities 
        String s1[] = { "Train", "Car", "Airplane"}; 
  
        // create checkbox 
        combo = new JComboBox(s1); 
  
        // add ItemListener 
        combo.addItemListener(s); 
  
        // create labels 
        label = new JLabel("select transport type"); 
        label2 = new JLabel("selected: "); 
  
        // create a new panel 
        JPanel panel = new JPanel(new FlowLayout()); 
		//panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
        panel.add(label); 
  
        // add combobox to panel 
        panel.add(combo); 
  
        panel.add(label2); 
  
        // add panel to frame 
        frame.add(panel); 
  
        // set the size of frame 
        frame.setSize(400, 300); 
  
     // Display the frame.
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
    public void itemStateChanged(ItemEvent e) 
    { 
        // if the state combobox is changed 
        if (e.getSource() == combo) { 
            label2.setText(" selected: " + combo.getSelectedItem()); 
        } 
    } 
} 