import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class CalculatorFrame extends JFrame {
	private JButton[] buttons;
	private GridLayout layout;

	private JPanel buttonsJpanel;
	private JTextField textfield;

	public CalculatorFrame(){
	super("Calculadora");
	
	
	buttonsJpanel = new JPanel();
	
	buttonsJpanel.setLayout(new GridLayout(4, 4));
	
	
	textfield = new JTextField(17);
	textfield.setEditable(false);
	textfield.setPreferredSize( new Dimension( 200, 20 ) );
	textfield.setText("-------------------------");

	textfield.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
	
	
	buttons = new JButton[16];
	buttons[0] = new JButton("7");
	buttons[1] = new JButton("8");
	buttons[2] = new JButton("9");
	buttons[3] = new JButton("/");
	buttons[4] = new JButton("4");
	buttons[5] = new JButton("5");
	buttons[6] = new JButton("6");
	buttons[7] = new JButton("*");
	buttons[8] = new JButton("1");
	buttons[9] = new JButton("2");
	buttons[10] = new JButton("3");
	buttons[11] = new JButton("-");
	buttons[12] = new JButton("0");
	buttons[13] = new JButton(".");
	buttons[14] = new JButton("=");
	buttons[15] = new JButton("+");
	for(int i = 0 ; i < buttons.length ; i++){
		buttonsJpanel.add(buttons[i]);
	}
	add(textfield, BorderLayout.NORTH);
	add(buttonsJpanel, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		CalculatorFrame frame = new CalculatorFrame();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(200, 200);

		frame.setVisible(true);
	}
}
