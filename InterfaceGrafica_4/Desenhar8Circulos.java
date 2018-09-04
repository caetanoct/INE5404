import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Desenhar8Circulos extends JPanel {
	public Color getRandomColor() {
		Random gerador = new Random();
		int numeroGerado = gerador.nextInt(5);
		switch (numeroGerado) {
		case 0:
			return Color.MAGENTA;
		case 1:
			return Color.BLACK;
		case 2:
			return Color.GREEN;
		case 3:
			return Color.BLUE;
		case 4:
			return Color.RED;
		}
		return Color.BLACK;
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		int interval = 10;
	
		for(int i = 0 ; i < 8 ; i++) {
			g.setColor(getRandomColor());
			g.drawArc(0 + (interval/2), 0 + (interval/2), 200 - interval , 200 - interval, 0, 360);
			
			interval+=10;
		}
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame("Desenhando Circulos");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Desenhar8Circulos des = new Desenhar8Circulos(); 
		frame.add(des); //adiciona o polygonsJPanel no Frame
		frame.setSize(500, 500); //configura tamanho do frame
		frame.setVisible(true); //exibe o frame
	}
}
