package efren.learning.calculator;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class CalculatorButton extends JButton {
	// to allow serialization, extending JFrame makes this a serializable class
	private static final long serialVersionUID = 31L;
	
	// constants
	// background color
	private static final int rBgColor = 85;
	private static final int gBgColor = 85;
	private static final int bBgColor = 95;
	// foreground color
	private static final int rFgColor = 255;
	private static final int gFgColor = 255;
	private static final int bFgColor = 255;
	
	private static final Font buttonFont = new Font("SansSerif", Font.PLAIN, 24);
	
	public CalculatorButton(String nLabel) {
		super(nLabel);
		this.setBackground(new Color(rBgColor, gBgColor, bBgColor));
		this.setForeground(new Color(rFgColor, gFgColor, bFgColor));
		this.setFont(buttonFont);
	}
}
