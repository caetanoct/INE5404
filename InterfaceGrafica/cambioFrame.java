package w;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class cambioFrame extends JFrame {

private JButton but1;
private JButton but2;
private JButton but3;
private JLabel label;
private JTextField textfield1;
private class handlerDoBotao implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Moeda 1")) {
			String SvalorRecebido = textfield1.getText();
			double a = Double.parseDouble(SvalorRecebido);
			double b = a * 2;
			String bs = Double.toString(b);
			label.setText(bs);
	
		}
		if(e.getActionCommand().equals("Moeda 2")) {
			String SvalorRecebido = textfield1.getText();
			double a = Double.parseDouble(SvalorRecebido);
			double b = a/2;
			String bs = Double.toString(b);
			label.setText(bs);
			
		}
		if(e.getActionCommand().equals("Moeda 3")) {
			String SvalorRecebido = textfield1.getText();
			double a = Double.parseDouble(SvalorRecebido);
			double b = a * 10;
			String bs = Double.toString(b);
			label.setText(bs);
		}
			
	}
	
}




public cambioFrame() {
	super("Câmbio");
	setLayout(new FlowLayout());
	
	textfield1 = new JTextField(10);
	
	but1 = new JButton("Moeda 1");
	but2 = new JButton("Moeda 2");
	but3 = new JButton("Moeda 3");
	add(textfield1);
	add(but1);
	add(but2);
	add(but3);

	handlerDoBotao butHandler = new handlerDoBotao();
	but1.addActionListener(butHandler);
	but2.addActionListener(butHandler);
	but3.addActionListener(butHandler);
	label = new JLabel("Digite o número");
	add(label);
	
}

}
