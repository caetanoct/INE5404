import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JPanel;

public class gerarString extends JPanel {
	
	
	public void paintComponent(Graphics g){
		super.paintComponent(g); //chama o paintComponent da superclasse
		
		//fonte configurada como Serifa (Times), negrito, 12 pt e desenha uma string
		g.setFont(new Font("Serif", Font.BOLD, 12));
		g.drawString("Serif 12 point bold.", 20, 30);
		
		//ADICIONE O C�DIGO PARA MOSTRAR AS FONTES
		
		//1. Monospaced (Courier), italico, 24 pt
		g.setFont(new Font("Courier", Font.ITALIC, 24));
		g.drawString("Courier 24 italico", 20, 50);
		//2. SansSerif (Helvetica), simples, 14 pt 
		g.setFont(new Font("Helvetica", Font.PLAIN, 14));
		g.setColor(Color.BLUE);
		
		g.fillRect(20,100, 100, 10);
		g.setColor(Color.BLACK);
		g.drawString("Helvetica 14 simples", 20, 70);
		//3. Serifa (Times), negrito/italico, 18 pt na cor vermelha.
		Font fonte3 = new Font("Times", Font.BOLD + Font.ITALIC, 18);
		g.setFont(fonte3);
		g.setColor(Color.RED);
		g.drawString("times negrito/italico 18", 20, 90);
	}
}
