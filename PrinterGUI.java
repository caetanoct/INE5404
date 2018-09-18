import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class PrinterGUI extends JFrame {
	// CENTER RIGHT
	// RIGHT 4 BUT
	// CENTER:
	// 	NORTH, CENTER SOUTH
	// 	NORTH JLABEL
	//		CENTER: BOX, 3 CHECK, BOX, 3 RADIO, BOX
	// SOUTH: JLABEL, JCOMBO , JCHECK
	private JButton[] button;
	private JLabel label1;
	
	private JTextArea[] textarea;
	private JPanel butPanel;
	private JLabel label2;
	private JComboBox combobox;
	private JCheckBox check;
	public PrinterGUI () {
		super("Printer");
		button = new JButton[4];
		button[0] = new JButton("OK");
		button[1] = new JButton("Cancel");
		button[2] = new JButton("Setup...");
		button[3] = new JButton("Help");
		butPanel = new JPanel();
		butPanel.setLayout(new GridLayout(4, 1, 5, 5));
		for(JButton but: button) {
			butPanel.add(but);
		}
		add(butPanel, BorderLayout.EAST);
		
		JPanel blockCenter = new JPanel();
		blockCenter.setLayout(new GridLayout(3, 1));
		label1 = new JLabel("Printer: My Printer");
		blockCenter.add(label1, BorderLayout.NORTH);
		
		
		JPanel blockCenterCenter = new JPanel();
		blockCenterCenter.setLayout(new GridLayout(1,5));
		JTextArea text1 = new JTextArea("", 5, 5);
		JCheckBox checks[] = new JCheckBox[3];
		checks[0] = new JCheckBox("Image");
		checks[1] = new JCheckBox("Text");
		checks[2] = new JCheckBox("Code");
		
		blockCenterCenter.add(text1);
		
		JPanel checkPanel = new JPanel();
		checkPanel.setLayout(new GridLayout(3, 1));
		checkPanel.add(checks[0]);
		
		checkPanel.add(checks[1]);
		checkPanel.add(checks[2]);
		blockCenterCenter.add(checkPanel);
		JTextArea text2 = new JTextArea("", 5, 5);
		blockCenterCenter.add(text2);
		
		JPanel radioPanel = new JPanel();
		radioPanel.setLayout(new GridLayout(3, 1));
		JRadioButton[] radios = new JRadioButton[3];
		radios[0] = new JRadioButton("Selection");
		radios[1] = new JRadioButton("All");
		radios[2] = new JRadioButton("Applet");
		radioPanel.add(radios[0]);
		radioPanel.add(radios[1]);
		radioPanel.add(radios[2]);
		ButtonGroup grupoRadio = new ButtonGroup();
		grupoRadio.add(radios[0]);
		grupoRadio.add(radios[1]);
		grupoRadio.add(radios[2]);
		blockCenterCenter.add(radioPanel);
		JTextArea text3 = new JTextArea("", 5, 5);
	
		blockCenterCenter.add(text3);
		blockCenter.add(blockCenterCenter, BorderLayout.CENTER);
		
		
		JPanel blockBottom = new JPanel();
		label2 = new JLabel("Print quality:");
		
		String[] opts = {"High", "Low"};
		combobox = new JComboBox(opts);
		check = new JCheckBox("Print to file");
		
		
		
		blockBottom.add(label2, BorderLayout.WEST);
		blockBottom.add(combobox, BorderLayout.CENTER);
		blockBottom.add(check, BorderLayout.EAST);
		
		blockCenter.add(blockBottom, BorderLayout.SOUTH);
	
		add(blockCenter, BorderLayout.CENTER);
	}
	public static void main(String[] args) {

		PrinterGUI frame = new PrinterGUI();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(600, 200);

		frame.setVisible(true);

	}
}
