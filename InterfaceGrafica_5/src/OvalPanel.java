

import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.JPanel;

public class OvalPanel extends JPanel {

	private int diameter = 10; // diametro padr�o de 10

	// desenha um oval com o diametro especificado
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillOval(10, 10, diameter, diameter); // desenha circulo
	} // fim do metodo paintComponent

	// valida e define diametro, depois executa o repaint
	public void setDiameter(int newDiameter) {
		// se o diametro eh invalido assume padr�o 10
		diameter = (newDiameter >= 0 ? newDiameter : 10);
		repaint(); // repinta o painel
	}// fim do metodo setDiameter

}// fim da classe OvalPanel
