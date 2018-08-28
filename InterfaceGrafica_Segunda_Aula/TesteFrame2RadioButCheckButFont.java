import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TesteFrame2RadioButCheckButFont extends JFrame {
	private JTextField textfield1;
	private JButton but1;
	private JTextField text2;
	private JCheckBox boldBox;
	private JCheckBox italicBox;
	private JRadioButton radioBold;
	private JRadioButton radioItalic;
	private JRadioButton radioNormal;
	private JTextField text3;
	private ButtonGroup grupoRadio;
	public TesteFrame2RadioButCheckButFont() {
		super("Título");
		setLayout(new FlowLayout());
		JLabel label1 = new JLabel("Escreva seu nome:");
		textfield1 = new JTextField(15);
		but1 = new JButton("Clique aqui");
		OuvidorTexto handler = new OuvidorTexto();
		textfield1.addActionListener(handler);
		but1.addActionListener(handler);
		
		text2 = new JTextField("Text", 15);
		text2.setEditable(false);
		boldBox = new JCheckBox("Bold");
		italicBox = new JCheckBox("Italic");
		
		add(label1);
		add(textfield1);
		add(but1);
		add(text2);
		add(boldBox);
		add(italicBox);
		OuvidorBox boxHandler = new OuvidorBox();
		boldBox.addItemListener(boxHandler);
		italicBox.addItemListener(boxHandler);
		text2.setFont(new Font("Serif", Font.PLAIN, 14));
		text3 = new JTextField("Observe a mudança na fonte ", 25);
		text3.setFont(new Font("Serif", Font.PLAIN, 14));
		add(text3);
		radioBold = new JRadioButton("BOld");
		radioItalic = new JRadioButton("Italic");
		radioNormal =  new JRadioButton("Normal");
		grupoRadio = new ButtonGroup();
		add(radioBold);
		add(radioItalic);
		add(radioNormal);
		
		grupoRadio.add(radioBold);
		grupoRadio.add(radioItalic);
		grupoRadio.add(radioNormal);
		
		OuvidorRadio radioHandler = new OuvidorRadio();
		radioBold.addItemListener(radioHandler);
		radioItalic.addItemListener(radioHandler);
		radioNormal.addItemListener(radioHandler);
	}

	private class OuvidorRadio implements ItemListener{
		

		@Override
		public void itemStateChanged(ItemEvent e) {
			Font fonte = null;
			if(radioBold.isSelected()) {
				fonte = new Font("Courier New", Font.BOLD, 14);
			}
			else if (radioItalic.isSelected()) {
				fonte = new Font("Arial", Font.ITALIC, 14);
			}
			else if (radioNormal.isSelected()) {
				fonte = new Font("Arial", Font.PLAIN, 14);
			}
			
			text3.setFont(fonte);
		}
		
	}
	private class OuvidorBox implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			Font fonte = null;
			if(italicBox.isSelected() && boldBox.isSelected()) {
				fonte = new Font("Arial", Font.ITALIC + Font.BOLD, 14);
			}
			
			else if(italicBox.isSelected()) {
				fonte = new Font("Courier New", Font.ITALIC, 14);
			}
			else if(boldBox.isSelected()) {
				fonte = new Font("Arial", Font.BOLD,14);
			}
			else {
				fonte = new Font("Serif", Font.PLAIN, 14);
			}
			
			text2.setFont(fonte);
		}
		
	}
	private class OuvidorTexto implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == textfield1) {
				JOptionPane.showMessageDialog(null, "Nome:" + textfield1.getText() );
			}
			if(e.getSource() == but1) {
				JOptionPane.showMessageDialog(null, "Nome: "+ textfield1.getText());
			}
		} 
	}
}
