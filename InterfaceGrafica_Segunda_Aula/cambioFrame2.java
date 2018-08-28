import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class cambioFrame2 extends JFrame {
private JList listaMoedas;
private static final String[] moedasNomes = {"Moeda 1", "Moeda 2", "Moeda 3"};

private JButton but1;
private JButton but2;
private JButton but3;
private JLabel label;
private JTextField textfield1;

public cambioFrame2() {
	super("Câmbio");
	setLayout(new FlowLayout());
	
	textfield1 = new JTextField(10);
	listaMoedas = new JList<>(moedasNomes);
	listaMoedas.setVisibleRowCount(2);
	listaMoedas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
	add(new JScrollPane(listaMoedas));
	
	listaMoedas.addListSelectionListener(
			new ListSelectionListener() {
				
				@Override
				public void valueChanged(ListSelectionEvent e) {
					if(listaMoedas.getSelectedIndex() == 0) {
						String SvalorRecebido = textfield1.getText();
						double a = Double.parseDouble(SvalorRecebido);
						double b = a * 2;
						String bs = Double.toString(b);
						label.setText(bs);
					}
					else if(listaMoedas.getSelectedIndex() == 1) {
						String SvalorRecebido = textfield1.getText();
						double a = Double.parseDouble(SvalorRecebido);
						double b = a/2;
						String bs = Double.toString(b);
						label.setText(bs);
					}
					else if(listaMoedas.getSelectedIndex() == 2) {
						String SvalorRecebido = textfield1.getText();
						double a = Double.parseDouble(SvalorRecebido);
						double b = a * 10;
						String bs = Double.toString(b);
						label.setText(bs);
					}
					
				}
			}
			);
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






}