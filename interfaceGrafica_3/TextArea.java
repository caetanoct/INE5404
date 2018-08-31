

import java.awt.ScrollPane;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.Box;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JScrollPane;

import javax.swing.JTextArea;

public class TextArea extends JFrame {

	private JTextArea textArea1; // exibe a streing demo

	private JTextArea textArea2; // texto destacado eh copiado aqui

	private JButton copyJButton;// comeÃ§a a copiar o texto

	public TextArea() {

		super("DemonstraÃ§Ã£o Area de Texto");

		Box box = Box.createHorizontalBox();// cria box

		String demo = "Este es un String demo para \n" + "ilustrar o texto copiado de uma \n"

				+ "area para outra usando um evento\nexterno\n";

		textArea1 = new JTextArea(demo, 10, 15); // cria area de texto 1

		box.add(new JScrollPane(textArea1)); // adiciona Scrollpane

		copyJButton = new JButton("Copy >>>"); // cria botao de copia

		box.add(copyJButton); // adiciona botao copia Ã box

		copyJButton.addActionListener(

				new ActionListener() { // classe interna anonima

					@Override // configura texto em textArea2 como texto selecionado de textArea1

					public void actionPerformed(ActionEvent arg0) {

						textArea2.setText(textArea1.getSelectedText());

					}

				});

		textArea2 = new JTextArea(10, 15); // cria segunda area de texto

		textArea2.setEditable(false); // destiva ediÃ§Ã£o

		box.add(new JScrollPane(textArea2)); // adiciona Scrollpane

		add(box); // adiciona box ao frame

	}

	public static void main(String[] args) {

		TextArea textAreaFrame = new TextArea();

		textAreaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		textAreaFrame.setSize(600, 200);

		textAreaFrame.setVisible(true);

	}

}