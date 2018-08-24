package w;

import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class testeFrame extends JFrame {
	
	
	
	
		
	
	private JLabel exercicio;
	private JLabel img;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JPasswordField password;
	private JButton botao1;
	private JButton botao2;
	
	
	
	private class TextFieldHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String stringConstruida = "";
			if(e.getSource() == textField1)
				stringConstruida  = String.format("Campo de texto 1: %s", e.getActionCommand());
			else if (e.getSource() == textField2)
				stringConstruida = String.format("Campo de texto 2: %s", e.getActionCommand());
			else if (e.getSource() == textField3)
				stringConstruida = String.format("Campo de texto 3: %s", e.getActionCommand());
			else if (e.getSource() == password)
				stringConstruida = String.format("password field: %s", e.getActionCommand());
			
			JOptionPane.showMessageDialog(null, stringConstruida);
		}
		
	}
	
	public testeFrame() {
		
		
		
		super("super");
		setLayout(new FlowLayout());
		exercicio = new JLabel("Texto exercicio");
		exercicio.setToolTipText("texto(settooltiptext)");
		add(exercicio);

		Icon imagem = new ImageIcon("/home/100000000901501/eclipse-workspace/w/src/w/200px-Square_200x200.svg.png");
		Icon IconeBotaoTop = new ImageIcon("/home/100000000901501/eclipse-workspace/w/src/w/if_Warning_132234.png");
		img = new JLabel("TEXTO IMG", imagem, SwingConstants.LEFT);
		img.setToolTipText("label img(setToolTip text)");
		add(img);

		textField1 = new JTextField(10);
		add(textField1);

		textField2 = new JTextField("insira um texto aqui");
		add(textField2);

		textField3 = new JTextField("Nao editavel", 20);
		textField3.setEditable(false);
		add(textField3);
		password = new JPasswordField("abc");
		add(password);
		
		TextFieldHandler handler =  new TextFieldHandler();
		textField1.addActionListener(handler);
		textField2.addActionListener(handler);
		textField3.addActionListener(handler);
		password.addActionListener(handler);
		
		botao1 = new JButton("Botao c texto ");
		botao2 = new JButton("botao top", IconeBotaoTop);
		add(botao1);
		add(botao2);
		handlerDoBotao butHandler = new handlerDoBotao();
		botao1.addActionListener(butHandler);
		botao2.addActionListener(butHandler);
	}
	
	private class handlerDoBotao implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(testeFrame.this, String.format("vc pressionou %s", e.getActionCommand()));
				
		}
		
	}
	
	

}
