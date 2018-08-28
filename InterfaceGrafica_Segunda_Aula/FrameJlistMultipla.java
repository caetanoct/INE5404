import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class FrameJlistMultipla extends JFrame {
	
	private JList listaCores;
	private JList listaCopia;
	private JButton but1;
	private static final String[] nameCores = {"Preto","Azul","Verde","Cyan","Vermelho","Amarelo"};
	public FrameJlistMultipla() {
		super("Titulo");
		setLayout(new FlowLayout());
		
		listaCores = new JList<>(nameCores);
		listaCores.setVisibleRowCount(3);
		listaCores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(listaCores));
		
		but1 = new JButton("Copia>>");
		but1.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						listaCopia.setListData(listaCores.getSelectedValues());
					}
				}
				);
		add(but1);
		listaCopia = new JList<>();
		listaCopia.setVisibleRowCount(3);
		listaCopia.setFixedCellHeight(15);
		listaCopia.setFixedCellWidth(100);
		listaCopia.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		add(new JScrollPane(listaCopia));
		
	}
}
