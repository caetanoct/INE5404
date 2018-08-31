

import java.awt.Container;

import java.awt.FlowLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;

public class Flow_Layouts extends JFrame {

	private JButton leftJButton; // botÃ£o para configurar alinhamento Ã esquerda

	private JButton centerJButton; // botÃ£o para configurar alinhamento centralizado

	private JButton rightJButton; // botÃ£o para configurar alinhamento Ã direita

	private FlowLayout flowLayout; // objeto de layout

	private Container container; // conteiner para configurar layout

	// configura GUI e registra listeners de botÃ£o

	public Flow_Layouts() {

		super("DemonstraÃ§Ã£o Flow_Layouts");

		flowLayout = new FlowLayout(); // cria FlowLayout

		container = getContentPane(); // obtem conteiner para layout
	
		setLayout(flowLayout); // configura o layout do frame

		// configura o botao da esquerda

		leftJButton = new JButton("Esquerda"); // cria botÃ£o esquerda

		add(leftJButton); // adiciona botÃ£o no frame

		leftJButton.addActionListener( // inserÃ§Ã£o da classe interna anonima

				new ActionListener() { // classe interna anonima

					// processa evento leftJButton

					public void actionPerformed(ActionEvent event) {

						flowLayout.setAlignment(FlowLayout.LEFT);

						// realinha componentes anexados

						flowLayout.layoutContainer(container);

					}

				} // fim classe interna anonima

		); // fim chamada ActionListener
		rightJButton = new JButton("Direita");
		add(rightJButton);
		rightJButton.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						flowLayout.setAlignment(FlowLayout.RIGHT);
						flowLayout.layoutContainer(container);
						
						
					}
				}
				);
		centerJButton = new JButton("Centro");
		add(centerJButton);
		centerJButton.addActionListener(
				new ActionListener(
						) {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						flowLayout.setAlignment(FlowLayout.CENTER);
						flowLayout.layoutContainer(container);
					}
				}
				);
	}

	public static void main(String[] args) {

		Flow_Layouts layoutFrame = new Flow_Layouts();

		layoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		layoutFrame.setSize(300, 75);

		layoutFrame.setVisible(true);

	}

}
