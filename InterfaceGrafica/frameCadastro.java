package w;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class frameCadastro extends JFrame {
private JTextField textfield1; //nome
private JTextField textfield2; //cep
private JTextField textfield3; //telef
private JTextField textfield4; //cpf
private JButton but1;
public JLabel test;

private class buttonHandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		String Sfinal = "";
		Sfinal += "\n Nome: " + textfield1.getText();
		Sfinal += "\n CEP: " + textfield2.getText();
		Sfinal += "\n Telefone: " + textfield3.getText();
		Sfinal += "\n CPF: " + textfield4.getText();
		JOptionPane.showMessageDialog(null, Sfinal);
			
	}
	
}

public frameCadastro() {
	super("oi");
	setLayout(new FlowLayout());
	JTextField tit1 = new JTextField("Digite o nome:");
	tit1.setEditable(false);
	add(tit1);
	textfield1 = new JTextField(10);
	add(textfield1);
	JTextField tit2 = new JTextField("Digite o CEP:");
	tit2.setEditable(false);
	add(tit2);
	textfield2 = new JTextField(10);
	add(textfield2);
	JTextField tit3 = new JTextField("Digite o telefone:");
	tit3.setEditable(false);
	add(tit3);
	textfield3 = new JTextField(10);
	add(textfield3);
	JTextField tit4 = new JTextField("Digite o CPF:");
	tit4.setEditable(false);
	add(tit4);
	textfield4 = new JTextField(10);
	add(textfield4);
	but1 = new JButton("Gerar Relatório");
	add(but1);
	test = new JLabel("opa");
	add(test);
	buttonHandler butHandler = new buttonHandler();
	but1.addActionListener(butHandler);
	
}
}
