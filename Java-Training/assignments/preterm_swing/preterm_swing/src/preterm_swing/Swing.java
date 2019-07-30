package preterm_swing;

import javax.swing.JFrame;

public class Swing {
	private JFrame jframe;
	Swing(String title) {
		// Create a new JFrame container.
		jframe = new JFrame(title);
	}
	public JFrame getFrame() {
		return jframe;
	}
}
