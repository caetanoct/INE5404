

import java.awt.BorderLayout;

import java.awt.Color;

import java.awt.Graphics;

import java.awt.Point;

import java.awt.event.MouseEvent;

import java.awt.event.MouseMotionAdapter;

import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class PaintPanel extends JPanel {

	private int pointCount = 0; // nÃºmero de contagem de pontos

	private Point[] points = new Point[10000]; // array de 10000 referencias ons.awt.Point
	
	public PaintPanel() { // configura GUI e registra handler de evento

		// trata evento de movimento do mouse do frame

		addMouseMotionListener(

				new MouseMotionAdapter() { // classe interna anÃ´nima

					public void mouseDragged(MouseEvent event) { // armazena coordenadas de arrastar e repinta

						if (pointCount < points.length) {
							
							points[pointCount] = event.getPoint(); // localiza o ponto

							pointCount++; // incrementa o nÃºmero de pontos em array

							repaint(); // repinta JFrame
						
						}

					}

				}// fim classe interna

		);// fim chamada addMouseMotionListener

	}// fim construtor PaintPainel

	// desenha ovais em um quadro delimitador de 4 por 4 nas localizaÃ§Ãµes
	// especificadas na janela

	public void paintComponent(Graphics g) {

		super.paintComponent(g); // limpa area de desenho

		// desenha todos os pontos no array

		for (int i = 0; i < pointCount; i++) {

			g.setColor(Color.MAGENTA);
			g.fillOval(points[i].x, points[i].y, 4, 4);

		}

	}

	public static void main(String[] args) {

		// cria Jframe

		JFrame application = new JFrame("Um programa de pintar simples");

		PaintPanel paintPanel = new PaintPanel(); // cria painel de pintura

		application.add(paintPanel, BorderLayout.CENTER); // no centro

		application.add(new JLabel("Move o mouse para desenhar"), BorderLayout.SOUTH);

		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		application.setSize(400, 200);

		application.setVisible(true);

	}

}
