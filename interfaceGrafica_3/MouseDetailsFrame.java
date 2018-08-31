

import java.awt.BorderLayout;

import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

import javax.swing.*;

public class MouseDetailsFrame extends JFrame {

	private String details; // String exibida na barra de status

	private JLabel statusBar; // JLabel do inferior da janela

	// construtor configura String de bara de titulo e registra listener de mouse

	public MouseDetailsFrame() {

		super("Clicks e botÃµes do Mouse");

		statusBar = new JLabel("Clique no Mouse");

		add(statusBar, BorderLayout.SOUTH);

		addMouseListener(new MouseClickHandler_Ouvidor());

	}

	// classe interna para tratar eventos do mouse

	private class MouseClickHandler_Ouvidor extends MouseAdapter {

		// metodo trata evento clique do mouse e determina qual o botao pressionado

		public void mouseClicked(MouseEvent event) {

			int xPos = event.getX();

			int yPos = event.getY();

			details = String.format("Clicado %d vez(es)", event.getClickCount());

			if (event.isMetaDown()) // botao direito do mouse

				details += "com o botao direito do mouse";

			else if (event.isAltDown()) // botao do meio do mouse

				details += "com o botao do meio do mouse";

			else // botao esquerdo do mouse

				details += "com o botao esquerdo do mouse";
			
			
			details+= String.format(" em [%d,%d]", event.getX() , event.getY());
			statusBar.setText(details);

		}

	}

}
