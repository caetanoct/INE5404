package gui2;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.ButtonGroup;

public class PopupFrame extends JFrame {

	private JRadioButtonMenuItem items[]; // holds items for colors
	private final Color colorValues[] = { Color.BLUE, Color.YELLOW, Color.RED }; // colors
	private JPopupMenu popupMenu; // allows user to select color

	// no-argument constructor sets up GUI
	public PopupFrame() {
		super("Using JPopupMenus");
		ItemHandler handler = new ItemHandler(); // handler for menu items
		String colors[] = { "Blue", "Yellow", "Red" }; // array of colors
		ButtonGroup colorGroup = new ButtonGroup(); // manages color items
		popupMenu = new JPopupMenu(); // create pop-up menu
		items = new JRadioButtonMenuItem[3]; // items for selecting color

		// construct menu item, add to popup menu, enable event handling
		for (int count = 0; count < items.length; count++) {
			items[count] = new JRadioButtonMenuItem(colors[count]);
			popupMenu.add(items[count]); // add item to pop-up menu
			colorGroup.add(items[count]); // add item to button group
			items[count].addActionListener(handler); // add handler
		}

		setBackground(Color.WHITE); // set background to white

		// declare a MouseListener for the window to display pop-up menu
		addMouseListener(new MouseAdapter() // anonymous inner class
		{
			// handle mouse press event
			public void mousePressed(MouseEvent event) {
				checkForTriggerEvent(event); // check for trigger
			} // end method mousePressed

			// handle mouse release event
			public void mouseReleased(MouseEvent event) {
				checkForTriggerEvent(event); // check for trigger
			} // end method mouseReleased

			// determine whether event should trigger popup menu
			private void checkForTriggerEvent(MouseEvent event) {
				if (event.isPopupTrigger())
					popupMenu.show(event.getComponent(), event.getX(), event.getY());
			}
		} // end anonymous inner class
		); // end call to addMouseListener
	} // end PopupFrame constructor

	// private inner class to handle menu item events
	private class ItemHandler implements ActionListener {
		// process menu item selections
		public void actionPerformed(ActionEvent event) {
			// determine which menu item was selected
			for (int i = 0; i < items.length; i++) {
				if (event.getSource() == items[i]) {
					getContentPane().setBackground(colorValues[i]);
					return;
				} // end if
			} // end for
		} // end method actionPerformed
	}// end private inner class ItemHandler

	public static void main(String[] args) {
		PopupFrame popupFrame = new PopupFrame(); // create PopupFrame
		popupFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		popupFrame.setSize(300, 200); // set frame size
		popupFrame.setVisible(true); // display frame

	}

}
