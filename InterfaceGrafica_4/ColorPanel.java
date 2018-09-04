
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorPanel extends JPanel{
	
	public void paintComponent(Graphics g){
		super.paintComponent(g); //chama o paintComponent da superclasse
		this.setBackground(Color.WHITE);
		
		//nova cor de desenho configurada utilizando inteiros
		g.setColor(new Color(255,0,0)); //COR VERMELHA
		g.fillRect(15, 25, 100, 20); // x, y, width, height 
									//(horizontal x, x + widht / vertical y, y+height)
		g.drawString("RGB atual: " + g.getColor(), 130, 40); // string, x, y
	
		//nova cor de desenho configurada utilizando float
		g.setColor(new Color(0.50f,0.75f,0.0f)); //COR VERDE
		g.fillRect(15, 50, 100, 20);
		g.drawString("RGB atual: " + g.getColor(), 130, 65);
		
		//ADICIONE O C�DIGO PARA MOSTRAR AS CORES AZUL E MAGENTA ABAIXO DA COR VERDE
		//TENDO COMO IMAGEM FINAL UMA LINHA DA COR VERMELHA, UMA DA VERDE, UMA DA AZUL E UMA
		//DA MAGENTA
		//Utilize os m�todos getRed(), getGreen() e getBlue() em um dos c�digos ou em ambos.
		g.setColor(Color.BLUE);
		g.fillRect(15, 75, 100, 20);
		g.drawString("RGB atual: " + g.getColor(), 130, 90);
	
		g.setColor(Color.MAGENTA);
		g.fillRect(15, 100, 100, 20);
		g.drawString("RGB atual: " + g.getColor(), 130, 115);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Usando cores");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ColorPanel colorPanel = new ColorPanel();
		frame.add(colorPanel);
		frame.setSize(400, 180);
		frame.setVisible(true);
	}
}
