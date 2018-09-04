
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class ArcsJPanel extends JPanel {

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		//inicia em 0 e varre 360 graus
		g.setColor(Color.RED);
		g.drawRect(15, 35, 80, 80);

		
		g.setColor(Color.BLACK);
		g.drawArc(15, 35, 80, 80, 0, 180);
		g.fillArc(15, 120, 80, 40, 0, 360);
		
		
		
		//ADICIONE AQUI O C�DIGO PARA FAZER O EXERC�CIO
		g.setColor(Color.RED);
		g.drawRect(105, 35, 80, 80);
		g.drawRect(195, 35, 80, 80);
		g.setColor(Color.black);
		
		g.drawArc(105, 35, 80, 80, 0, 90);
		g.fillArc(105, 120, 80, 40, 180, 90);
		
		
		g.drawArc(195, 35, 80, 80, 90, 270);
		g.fillArc(195, 120, 80, 40, 90, 270);
	
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame("Desenhando Arcos");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ArcsJPanel arcsJPanel = new ArcsJPanel(); 
		frame.add(arcsJPanel); //adiciona o arcsJPanel no Frame
		frame.setSize(300, 210); //configura tamanho do frame
		frame.setVisible(true); //exibe o frame
	}
}
