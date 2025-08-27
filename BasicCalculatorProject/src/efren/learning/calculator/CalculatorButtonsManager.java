package efren.learning.calculator;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;


public class CalculatorButtonsManager {
	
	private static final CalculatorButtonsManager singletonInstance = new CalculatorButtonsManager();
	
	// public labels to search for specific buttons
	public static final String CALCULATOR_BUTTON_0 = "0";
	public static final String CALCULATOR_BUTTON_1 = "1";
	public static final String CALCULATOR_BUTTON_2 = "2";
	public static final String CALCULATOR_BUTTON_3 = "3";
	public static final String CALCULATOR_BUTTON_4 = "4";
	public static final String CALCULATOR_BUTTON_5 = "5";
	public static final String CALCULATOR_BUTTON_6 = "6";
	public static final String CALCULATOR_BUTTON_7 = "7";
	public static final String CALCULATOR_BUTTON_8 = "8";
	public static final String CALCULATOR_BUTTON_9 = "9";
	public static final String CALCULATOR_BUTTON_DOT = ".";
	public static final String CALCULATOR_BUTTON_CLEAR_ENTRY = "CE";
	public static final String CALCULATOR_BUTTON_ALL_CLEAR = "AC";
	public static final String CALCULATOR_BUTTON_EQUALS = "=";
	public static final String CALCULATOR_BUTTON_PLUS = "+";
	public static final String CALCULATOR_BUTTON_MINUS = "-";
	public static final String CALCULATOR_BUTTON_MODULO = "%";
	public static final String CALCULATOR_BUTTON_DIVISION = "\u00D7"; // unicode
	public static final String CALCULATOR_BUTTON_MULTIPLICATION = "\u00F7"; // unicode
	
	// public labels for basic calculator rows
	public static final String CALCULATOR_BASIC_ROW_01 = "CBR01";
	public static final String CALCULATOR_BASIC_ROW_02 = "CBR02";
	public static final String CALCULATOR_BASIC_ROW_03 = "CBR03";
	public static final String CALCULATOR_BASIC_ROW_04 = "CBR04";
	public static final String CALCULATOR_BASIC_ROW_05 = "CBR05";
	
	private static final Color bgColor = Color.BLACK;
	
	// maps of components
	private HashMap<String, JButton> buttonMap;
	private HashMap<String, JPanel> panelMap;
	
	//Layout for the rows of buttons
	private final GridLayout basicCalculatorRowLayout = new GridLayout(1, 4);
	private final JLabel emptyLabel = new JLabel();
	
	private CalculatorButtonsManager(){
		// buttons
		this.buttonMap = new HashMap<String, JButton>();
		this.buttonMap.put(CALCULATOR_BUTTON_0, new CalculatorButton(CALCULATOR_BUTTON_0));
		this.buttonMap.put(CALCULATOR_BUTTON_1, new CalculatorButton(CALCULATOR_BUTTON_1));
		this.buttonMap.put(CALCULATOR_BUTTON_2, new CalculatorButton(CALCULATOR_BUTTON_2));
		this.buttonMap.put(CALCULATOR_BUTTON_3, new CalculatorButton(CALCULATOR_BUTTON_3));
		this.buttonMap.put(CALCULATOR_BUTTON_4, new CalculatorButton(CALCULATOR_BUTTON_4));
		this.buttonMap.put(CALCULATOR_BUTTON_5, new CalculatorButton(CALCULATOR_BUTTON_5));
		this.buttonMap.put(CALCULATOR_BUTTON_6, new CalculatorButton(CALCULATOR_BUTTON_6));
		this.buttonMap.put(CALCULATOR_BUTTON_7, new CalculatorButton(CALCULATOR_BUTTON_7));
		this.buttonMap.put(CALCULATOR_BUTTON_8, new CalculatorButton(CALCULATOR_BUTTON_8));
		this.buttonMap.put(CALCULATOR_BUTTON_9, new CalculatorButton(CALCULATOR_BUTTON_9));
		this.buttonMap.put(CALCULATOR_BUTTON_DOT, new CalculatorButton(CALCULATOR_BUTTON_DOT));
		this.buttonMap.put(CALCULATOR_BUTTON_CLEAR_ENTRY, new CalculatorButton(CALCULATOR_BUTTON_CLEAR_ENTRY));
		this.buttonMap.put(CALCULATOR_BUTTON_ALL_CLEAR, new CalculatorButton(CALCULATOR_BUTTON_ALL_CLEAR));
		this.buttonMap.put(CALCULATOR_BUTTON_EQUALS, new CalculatorButton(CALCULATOR_BUTTON_EQUALS));
		this.buttonMap.put(CALCULATOR_BUTTON_PLUS, new CalculatorButton(CALCULATOR_BUTTON_PLUS));
		this.buttonMap.put(CALCULATOR_BUTTON_MINUS, new CalculatorButton(CALCULATOR_BUTTON_MINUS));
		this.buttonMap.put(CALCULATOR_BUTTON_MODULO, new CalculatorButton(CALCULATOR_BUTTON_MODULO));
		this.buttonMap.put(CALCULATOR_BUTTON_DIVISION, new CalculatorButton(CALCULATOR_BUTTON_DIVISION));
		this.buttonMap.put(CALCULATOR_BUTTON_MULTIPLICATION, new CalculatorButton(CALCULATOR_BUTTON_MULTIPLICATION));
		
		// rows of buttons
		this.panelMap = new HashMap<String, JPanel>();
		// first row of the basic calculator is CE, AC, modulo, division
		this.panelMap.put(CALCULATOR_BASIC_ROW_01, new JPanel(basicCalculatorRowLayout));
		this.panelMap.get(CALCULATOR_BASIC_ROW_01).setBackground(bgColor);
		this.panelMap.get(CALCULATOR_BASIC_ROW_01).add(this.buttonMap.get(CALCULATOR_BUTTON_CLEAR_ENTRY));
		this.panelMap.get(CALCULATOR_BASIC_ROW_01).add(this.buttonMap.get(CALCULATOR_BUTTON_ALL_CLEAR));
		this.panelMap.get(CALCULATOR_BASIC_ROW_01).add(this.buttonMap.get(CALCULATOR_BUTTON_MODULO));
		this.panelMap.get(CALCULATOR_BASIC_ROW_01).add(this.buttonMap.get(CALCULATOR_BUTTON_DIVISION));
		// second row of the basic calculator is 7 8 9 multiplication
		this.panelMap.put(CALCULATOR_BASIC_ROW_02, new JPanel(basicCalculatorRowLayout));
		this.panelMap.get(CALCULATOR_BASIC_ROW_02).setBackground(bgColor);
		this.panelMap.get(CALCULATOR_BASIC_ROW_02).add(this.buttonMap.get(CALCULATOR_BUTTON_7));
		this.panelMap.get(CALCULATOR_BASIC_ROW_02).add(this.buttonMap.get(CALCULATOR_BUTTON_8));
		this.panelMap.get(CALCULATOR_BASIC_ROW_02).add(this.buttonMap.get(CALCULATOR_BUTTON_9));
		this.panelMap.get(CALCULATOR_BASIC_ROW_02).add(this.buttonMap.get(CALCULATOR_BUTTON_MULTIPLICATION));
		// third row of the basic calculator is 4 5 6 -
		this.panelMap.put(CALCULATOR_BASIC_ROW_03, new JPanel(basicCalculatorRowLayout));
		this.panelMap.get(CALCULATOR_BASIC_ROW_03).setBackground(bgColor);
		this.panelMap.get(CALCULATOR_BASIC_ROW_03).add(this.buttonMap.get(CALCULATOR_BUTTON_4));
		this.panelMap.get(CALCULATOR_BASIC_ROW_03).add(this.buttonMap.get(CALCULATOR_BUTTON_5));
		this.panelMap.get(CALCULATOR_BASIC_ROW_03).add(this.buttonMap.get(CALCULATOR_BUTTON_6));
		this.panelMap.get(CALCULATOR_BASIC_ROW_03).add(this.buttonMap.get(CALCULATOR_BUTTON_MINUS));
		// fourth row of the basic calculator is 1 2 3 +
		this.panelMap.put(CALCULATOR_BASIC_ROW_04, new JPanel(basicCalculatorRowLayout));
		this.panelMap.get(CALCULATOR_BASIC_ROW_04).setBackground(bgColor);
		this.panelMap.get(CALCULATOR_BASIC_ROW_04).add(this.buttonMap.get(CALCULATOR_BUTTON_1));
		this.panelMap.get(CALCULATOR_BASIC_ROW_04).add(this.buttonMap.get(CALCULATOR_BUTTON_2));
		this.panelMap.get(CALCULATOR_BASIC_ROW_04).add(this.buttonMap.get(CALCULATOR_BUTTON_3));
		this.panelMap.get(CALCULATOR_BASIC_ROW_04).add(this.buttonMap.get(CALCULATOR_BUTTON_PLUS));
		// fifth row of the basic calculator is null_label 0 . =
		this.panelMap.put(CALCULATOR_BASIC_ROW_05, new JPanel(basicCalculatorRowLayout));
		this.panelMap.get(CALCULATOR_BASIC_ROW_05).setBackground(bgColor);
		this.panelMap.get(CALCULATOR_BASIC_ROW_05).add(this.emptyLabel); // basic calculator has an empty space in the fifth row
		this.panelMap.get(CALCULATOR_BASIC_ROW_05).add(this.buttonMap.get(CALCULATOR_BUTTON_0));
		this.panelMap.get(CALCULATOR_BASIC_ROW_05).add(this.buttonMap.get(CALCULATOR_BUTTON_DOT));
		this.panelMap.get(CALCULATOR_BASIC_ROW_05).add(this.buttonMap.get(CALCULATOR_BUTTON_EQUALS));		
	}
	
    public static JButton getButton(String nKey) {
        return singletonInstance.buttonMap.get(nKey);
    }
    
    public static JPanel getRowOfButton(String nKey)
    {
    	return singletonInstance.panelMap.get(nKey);
    }
}
