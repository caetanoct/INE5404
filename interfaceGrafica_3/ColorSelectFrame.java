import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ColorSelectFrame extends JFrame {
	private JComboBox comboBox;
	private JCheckBox check1;
	private JCheckBox check2;
	private JPanel painelCheck;
	private static final String[] names = {"1", "2","3"};
	
	public ColorSelectFrame () {
		super("Color Select");
		setLayout(new GridLayout())
		comboBox = new JComboBox<>(names);
		add(comboBox, BorderLayout.NORTH);
		painelCheck = new JPanel();
		painelCheck.setLayout(new GridLayout(1,2));
		check1 = new JCheckBox("Option 1");
		check2 = new JCheckBox("Option 2");
		painelCheck.add(check1);
		painelCheck.add(check2);
		
		add(painelCheck, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		ColorSelectFrame frame = new ColorSelectFrame();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(200, 200);

		frame.setVisible(true);
	}
}
