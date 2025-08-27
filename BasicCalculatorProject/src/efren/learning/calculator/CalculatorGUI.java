package efren.learning.calculator;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class CalculatorGUI extends JFrame{
	// to allow serialization, extending JFrame makes this a serializable class
	private static final long serialVersionUID = 37L;
	
	// some constants
	private static final String appTitle = "Basic Calculator";
	private static final Color bgColor = Color.gray;
	private static final boolean isResizable = false;
	
	//main container of the application
	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public CalculatorGUI() {
		// when the close button is pressed the app should close and be dropped from memroy
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// upper left corner of the app will be @ 100, 100 location on screen
		// it's width is 400 and it's length is 550
		this.setBounds(100, 100, 400, 550);
		this.setTitle(appTitle);
		this.setResizable(isResizable);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(bgColor);
		this.setContentPane(contentPane);

	}
}
