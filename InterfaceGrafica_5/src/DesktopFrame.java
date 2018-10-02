

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.Box.Filler;

public class DesktopFrame extends JFrame {
	private Color colorSelected;
	private JDesktopPane theDesktop;
	JMenuBar bar = new JMenuBar(); // create menu bar
	JMenu addMenu = new JMenu("Adicione"); // create Add menu
	JMenu addMenu2 = new JMenu("Adicione Cor");
	JMenu addMenu2item = new JMenu("add");
	JMenuItem newFrame = new JMenuItem("Frame interno");
	String[] nomeCores = {"Preto", "Verde", "Azul", "Amarelo", "Magenta"};
	Color[] cores = {Color.BLACK, Color.green, Color.BLUE, Color.YELLOW , Color.MAGENTA};
	JRadioButtonMenuItem[] botoesCores = new JRadioButtonMenuItem[cores.length];
	ButtonGroup grupo = new ButtonGroup();
	
	private class handler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			for(int i = 0 ; i < cores.length ; i++) {
				if(botoesCores[i].isSelected()) {
					colorSelected = cores[i];
				}
			}
			// TODO Auto-generated method stub
			JInternalFrame frame = new JInternalFrame("Internal Frame", true, true, true, true);
			MyJPanel panel = new MyJPanel(); // create new panel
			panel.setBackground(colorSelected);
			frame.add(panel, BorderLayout.CENTER); // add panel
			frame.setSize(200, 100);
			theDesktop.add(frame); // attach internal frame
			frame.setVisible(true); // show internal frame
		}
		
	}
	public DesktopFrame() {
		
		super("Using a JDesktopPane");
		colorSelected = Color.CYAN;
		
		handler HandlerBotoes = new handler();
		for(int i = 0;i < botoesCores.length ; i++) {
			botoesCores[i] = new JRadioButtonMenuItem(nomeCores[i]);
			botoesCores[i].addActionListener(HandlerBotoes);
			grupo.add(botoesCores[i]);
			addMenu2item.add(botoesCores[i]);
		}
		
		addMenu.add(newFrame); // add new frame item to Add menu
		addMenu2.add(addMenu2item);
		bar.add(addMenu); // add Add menu to menu bar
		bar.add(addMenu2);
		
		setJMenuBar(bar); // set menu bar for this application

		theDesktop = new JDesktopPane(); // create desktop pane
		add(theDesktop); // add desktop pane to frame
		
		
		

		// set up listener for newFrame menu item
		newFrame.addActionListener(new ActionListener() // anonymous inner class
				{
					// display new internal window
					public void actionPerformed(ActionEvent event) {
						Color cor = JColorChooser.showDialog(DesktopFrame.this, "Escolhe uma cor", Color.yellow); 
						// create internal frame JInternalFrame(String title,boolean resizable,boolean closable,
	                    //  boolean maximizable,boolean iconifiable)
						JInternalFrame frame = new JInternalFrame("Internal Frame", true, true, true, true);
						MyJPanel panel = new MyJPanel(); // create new panel
						panel.setBackground(cor);
						frame.add(panel, BorderLayout.CENTER); // add panel
						frame.setSize(200, 100);
						theDesktop.add(frame); // attach internal frame
						
						frame.setVisible(true); // show internal frame
					}
				});
	}
	
	public static void main(String[] args) {
		DesktopFrame desktopFrame = new DesktopFrame();
		desktopFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		desktopFrame.setSize( 600, 480 ); // set frame size
		desktopFrame.setVisible( true ); // display frame

	}
}
	 class MyJPanel extends JPanel {

		private static Random generator = new Random();
		public MyJPanel() {
			JLabel label = new JLabel();
			label.setText("Teste " + generator.nextInt(100));
			this.add(label);
		} // end MyJPanel constructor
		
	 }
	
	

