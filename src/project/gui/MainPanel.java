package project.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
/**
 * This extends the JFrame and show the main panel
 * @author COMPUser this program is programmed by me
 *
 */
public class MainPanel extends JFrame {
	public static final long serialVersionUID = 138938122;

	public MainPanel() {
		super("Main panel of the calculator");
        JButton b=new JButton("+");
        add(b);
        this.setSize(500, 400);
        this.setLocation(100, 100);
        this.setVisible(true);
	}
/**
 * to show the main panel
 * @param args
 */
	public static void main(String[] args) {
		new MainPanel();
	}
}