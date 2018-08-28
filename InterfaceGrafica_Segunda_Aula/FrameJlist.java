import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class FrameJlist extends JFrame {

	private JList coresLista;
	private static final String[] nameCores = {"Preto","Azul","Verde","Cyan","Vermelho","Amarelo"};
	private static final Color[] cores = {Color.BLACK,Color.BLUE,Color.GREEN,Color.CYAN,Color.RED,Color.YELLOW}; 
	public FrameJlist() {
		super("titulo");
		setLayout(new FlowLayout());
		coresLista = new JList<>(nameCores);
		coresLista.setVisibleRowCount(3);
		coresLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(coresLista));
		
		coresLista.addListSelectionListener(
				new ListSelectionListener() {
					
					@Override
					public void valueChanged(ListSelectionEvent e) {
						getContentPane().setBackground(cores[coresLista.getSelectedIndex()]);
						
					}
				}
				);
	}
	
	
}
