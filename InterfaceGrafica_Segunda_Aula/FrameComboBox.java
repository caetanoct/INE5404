import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameComboBox extends JFrame {
	private JComboBox comboBox;
	private JLabel label1;
	private static final String[] names = {"3-2-bug-png-9.png", "brasao_default.png","Bug.png"};
	private Icon[] icons = {new ImageIcon(getClass().getResource(names[0])), new ImageIcon(getClass().getResource(names[1]))
			,new ImageIcon(getClass().getResource(names[2]))};
	private class OuvidorComboBox implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			label1.setIcon(icons[comboBox.getSelectedIndex()]);
			
		}
		
	}
	public FrameComboBox() {
		super("Título");
		setLayout(new FlowLayout());
		
		label1 = new JLabel(icons[0]);
		comboBox = new JComboBox<>(names);
		comboBox.setMaximumRowCount(3);
		
		add(comboBox);
		add(label1);
		
		OuvidorComboBox comboListener = new OuvidorComboBox();
		
		comboBox.addItemListener(comboListener);
		
	}
}
