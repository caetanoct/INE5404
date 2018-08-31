import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ColorSelectFrame extends JFrame {
	private JComboBox comboBox;
	private JCheckBox check1;
	private JCheckBox check2;
	private JPanel painelCheck;
	private JPanel painelButtons;
	private JButton[] button;
	private static final String[] names = {"1", "2","3"};
	
	public ColorSelectFrame () {
		super("Color Select");

		comboBox = new JComboBox<>(names);
		add(comboBox, BorderLayout.NORTH);
		painelCheck = new JPanel();
		check1 = new JCheckBox("Option 1");
		check2 = new JCheckBox("Option 2");
		painelCheck.add(check1, BorderLayout.WEST);
		painelCheck.add(check2, BorderLayout.CENTER);
		
		add(painelCheck, BorderLayout.CENTER);
		painelButtons = new JPanel();
		button = new JButton[2];
		button[0] = new JButton("ok");
		button[1] = new JButton("cancel");
		painelButtons.add(button[0]);
		painelButtons.add(button[1]);
		add(painelButtons, BorderLayout.SOUTH);
		
	}
	
	public static void main(String[] args) {
		ColorSelectFrame frame = new ColorSelectFrame();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(400, 140);

		frame.setVisible(true);
	}
}
