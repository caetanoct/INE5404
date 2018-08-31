

import java.awt.BorderLayout;

import java.awt.Color;

import java.awt.event.MouseEvent;

import java.awt.event.MouseListener;

import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

public class MouseTrackerFrame extends JFrame {
	private JPanel mousePanel; // painel em que eventos do mouse ocorrerao
	private JLabel statusBar; // rotulo que exibe informacoes de evento

	// construtor MouseTrackerFrame configura GUI e registra handlers de evento de
	// mouse

	public MouseTrackerFrame() {

		super("Demostrando Eventos do Mouse");

		mousePanel = new JPanel(); // cria painel
		mousePanel.setBackground(Color.WHITE); // configura cor de fundo

		add(mousePanel, BorderLayout.CENTER); // adiciona painel ao JFrame

		statusBar = new JLabel("Mouse fora do JPanel");

		add(statusBar, BorderLayout.SOUTH); // adiciona rotulo ao JFrame

		// cria e registra listener para mouse e eventos de movimento de mouse

		MouseHandler_Ouvidor handler_ouvidor = new MouseHandler_Ouvidor();

		mousePanel.addMouseListener(handler_ouvidor);

		mousePanel.addMouseMotionListener(handler_ouvidor);

	} // fim do construtor

	private class MouseHandler_Ouvidor implements MouseListener, MouseMotionListener {

		// handlers de evento de MouseListener

		@Override // trata evento quando o mouse eh liberado imediatamente depois de ter sido
					// pressionado

		public void mouseClicked(MouseEvent event) {

			statusBar.setText(String.format("Mouse clickou em [%d , %d]", event.getX() , event.getY() ));
			mousePanel.setBackground(Color.GREEN);

		}

		@Override // trata evento quando mouse eh pressionado

		public void mousePressed(MouseEvent event) {

			statusBar.setText(String.format("Mouse está pressionado em [%d , %d]", event.getX() , event.getY() ));
			mousePanel.setBackground(Color.BLUE);
		}

		@Override // trata evento quando mouse eh liberado

		public void mouseReleased(MouseEvent event) {

			statusBar.setText(String.format("Mouse soltou em [%d , %d]", event.getX() , event.getY() ));
			mousePanel.setBackground(Color.BLACK);
		}

		@Override // trata evento quando mouse entra na area

		public void mouseEntered(MouseEvent event) {

			// TODO Auto-generated method stub
			statusBar.setText(String.format("Mouse entrou em [%d , %d]", event.getX() , event.getY() ));
			mousePanel.setBackground(Color.CYAN);
		}

		@Override // trata evento quando mouse sai da area

		public void mouseExited(MouseEvent event) {
			
			statusBar.setText(String.format("Mouse SAIU DO JPANEL"));
			mousePanel.setBackground(Color.RED);

		}

		// handlers de evento de MouseMotionListener

		@Override // trata evento quando mouse eh arrastado

		public void mouseDragged(MouseEvent event) {

			statusBar.setText(String.format("Mouse arrastando e está em [%d , %d]", event.getX() , event.getY() ));
			mousePanel.setBackground(Color.MAGENTA);

		}

		@Override // trata evento quando mouse eh movido

		public void mouseMoved(MouseEvent event) {

			statusBar.setText(String.format("Mouse movendo e está em [%d , %d]", event.getX() , event.getY() ));
			mousePanel.setBackground(Color.YELLOW);

		}

	} // fim da classe interna MouseHandler_Ouvidor

}// fim da classe MouseTrackerFrame