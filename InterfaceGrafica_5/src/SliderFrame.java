

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JSlider;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderFrame extends JFrame {
	private JSlider horizontalSlider;
	private JSlider verticalSlider;
	private RectPanel rectanglePanel; // panel para desenhar circulo
	
	// constructor
	public SliderFrame() {
		super("Slider Demo");
		rectanglePanel = new RectPanel();
		rectanglePanel.setBackground(Color.GREEN); // set background amarelo

		// configura o JSlider para controlar o valor do diametro
		//new Slider (orientacao, minimo, maximo, valorInicial)
		horizontalSlider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 100);
		verticalSlider = new JSlider(SwingConstants.VERTICAL, 0, 200, 50);
		rectanglePanel.setNewSize(horizontalSlider.getValue(), verticalSlider.getValue());
		horizontalSlider.setMajorTickSpacing(10); // criar tick cada 10
		horizontalSlider.setPaintTicks(true);// pinta marcas de medida no controle deslizante
									
		// registra o ouvinte do evento do JSlider
		horizontalSlider.addChangeListener(new ChangeListener() // classe anonima interna
				{
					// trata da altera��o de valor do controle deslizante
					public void stateChanged(ChangeEvent e) {
						rectanglePanel.setNewSize(horizontalSlider.getValue(), verticalSlider.getValue());
					} // fim do metodo stateChanged
				} // fim da classe anonima
				); // fim da chamada a addChangeListener
		verticalSlider.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				rectanglePanel.setNewSize(horizontalSlider.getValue(), verticalSlider.getValue());
			}
		});
		add(verticalSlider, BorderLayout.WEST);
		add(horizontalSlider, BorderLayout.SOUTH); // adicionar slider ao frame
		add(rectanglePanel); // adicionar panel ao frame
	} // fim do construtor SliderFrame

	public static void main(String[] args) {
		SliderFrame sliderFrame = new SliderFrame();
		sliderFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		sliderFrame.setSize( 250, 270 ); // configura o tamanho do frame
		sliderFrame.setVisible( true ); // exibe o frame
	}

}
