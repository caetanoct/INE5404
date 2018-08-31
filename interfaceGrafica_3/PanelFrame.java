

import java.awt.BorderLayout;

import java.awt.FlowLayout;

import java.awt.GridLayout;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JPanel;

public class PanelFrame extends JFrame {

	private JPanel buttonJPanel; // painel para armazenar botÃµes
	private JPanel buttonJPanel2;
	private JButton[] buttons; // array de botoes
	private JButton[] botoes;

	public PanelFrame() {

		super("DemonstraÃ§Ã£o Panel");

		buttons = new JButton[5]; // cria botoes de array

		buttonJPanel = new JPanel(); // configura painel

		buttonJPanel.setLayout(new GridLayout(1, buttons.length));
		
		buttonJPanel2 = new JPanel();
		buttonJPanel2.setLayout(new GridLayout(1,3));
		// cria e adiciona botoes

		for (int count = 0; count < buttons.length; count++) {

			buttons[count] = new JButton("Botao " + (count + 1));

			buttonJPanel.add(buttons[count]);// adciona botao ao painel

		}
		botoes = new JButton[3];
		for(int i = 0 ; i < botoes.length ; i++){
			botoes[i] = new JButton("But ["+i+"]");
			buttonJPanel2.add(botoes[i]);
		}
		add(buttonJPanel2, BorderLayout.SOUTH);
		add(buttonJPanel, BorderLayout.NORTH); // adiciona painel ao JFrame

	}

	public static void main(String[] args) {

		PanelFrame panelFrame = new PanelFrame();

		panelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panelFrame.setSize(450, 200);

		panelFrame.setVisible(true);

	}

}