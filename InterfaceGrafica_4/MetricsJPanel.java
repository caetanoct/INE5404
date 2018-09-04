
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MetricsJPanel extends JPanel {

	//exibe a m�trica de fontes
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.setFont(new Font("SansSerif", Font.BOLD, 12));
		FontMetrics metrics = g.getFontMetrics(); 
		g.drawString("Fonte atual: "+ g.getFont(), 10, 30);
		g.drawString("Ascendente: "+ metrics.getAscent(), 10, 45);
		g.drawString("Descendente: "+ metrics.getDescent(), 10, 60);
		g.drawString("Altura: "+ metrics.getHeight(), 10, 75);
		g.drawString("Entrelinha: "+ metrics.getLeading(), 10, 90);
		Font fonte = new Font("Serif", Font.ITALIC, 14);
		g.setFont(fonte);
		metrics = g.getFontMetrics(); 
		g.drawString("Fonte atual: "+ g.getFont(), 10, 100);
		g.drawString("Ascendente: "+ metrics.getAscent(), 10, 115);
		g.drawString("Descendente: "+ metrics.getDescent(), 10, 130);
		g.drawString("Altura: "+ metrics.getHeight(), 10, 145);
		g.drawString("Entrelinha: "+ metrics.getLeading(), 10, 160);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MetricsJPanel metricsJPanel = new MetricsJPanel(); 
		frame.add(metricsJPanel); //adiciona o metricsJpanel no Frame
		frame.setSize(510, 240); //configura tamanho do frame
		frame.setVisible(true); //exibe o frame
	}

}
