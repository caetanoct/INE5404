

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class RectPanel extends JPanel {

	private int base = 10; // diametro padr�o de 10
	private int altura = 5;
	// desenha um oval com o diametro especificado
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.blue);
		g.fillRect(10, 10,	base, altura);
	} // fim do metodo paintComponent

	// valida e define diametro, depois executa o repaint
	public void setNewSize(int newInt1, int newInt2) {
		base = (newInt1 >= 0 ? newInt1 : 10);
		altura = (newInt2 >= 0 ? newInt2 : 5);
		repaint(); // repinta o painel
	}// fim do metodo setDiameter

}// fim da classe OvalPanel
