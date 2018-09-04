
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PolygonsJPanel extends JPanel {

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		//desenha o pol�gono com objeto Polygon
		int[] xValues = {20, 40, 50, 30, 20, 15};
		int[] yValues = {50, 50, 60, 80, 80, 60};
		Polygon polygon1 = new Polygon(xValues, yValues, 6);
		g.drawPolygon(polygon1);
		
		int[] xvalues2 = {100,110,130,140,160,170};
		int[] yvalues2 = {120,130,90,110,130,140};
		Polygon polygon2 = new Polygon(xvalues2, yvalues2, 6);
		g.drawPolygon(polygon2);
		g.fillPolygon(polygon2);
		
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame("Desenhando Poligonos");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PolygonsJPanel polygonsJPanel = new PolygonsJPanel(); 
		frame.add(polygonsJPanel); //adiciona o polygonsJPanel no Frame
		frame.setSize(280, 270); //configura tamanho do frame
		frame.setVisible(true); //exibe o frame
	}
}
