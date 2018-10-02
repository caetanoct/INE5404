

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;

public class MenuFrame extends JFrame {
	private final Color colorValues[] = { Color.BLACK, Color.BLUE, Color.RED,
			Color.GREEN };
	private JRadioButtonMenuItem colorItems[]; // items do menu color
	private JRadioButtonMenuItem fonts[]; // items do menu font
	private JCheckBoxMenuItem styleItems[]; // items do menu font style
	private JLabel displayJLabel; // exibe texto de exemplo
	private ButtonGroup fontButtonGroup; // gerencia itens do menu font
	private ButtonGroup colorButtonGroup; // gerencia itens do menu color
	private int style; // usado para criar estilos de fonte

	public MenuFrame() {
		super("Usando JMenus");
		JMenu fileMenu = new JMenu("File"); // cria menu file
		
		fileMenu.setMnemonic('F'); // configura mnemonic como F

		// create About... menu item
		JMenuItem exitMenu = new JMenuItem("Exit");
		exitMenu.setMnemonic('x');
		exitMenu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		JMenu background = new JMenu("Background");
		
		
		JMenuItem aboutItem = new JMenuItem("About...");
		aboutItem.setMnemonic('A'); // set mnemonic to A
		fileMenu.add(aboutItem); // adiciona item about ao menu file

		aboutItem.addActionListener(new ActionListener() { // classe interna
					// anonima
					// exibe dialog quando usuario seleciona About...
					public void actionPerformed(ActionEvent event) {
						JOptionPane.showMessageDialog(MenuFrame.this,
								"This is an example\nof using menus", "About",
								JOptionPane.PLAIN_MESSAGE);
					} // fim do metodo actionPerformed
				} // fim da classe interna anonima
				); // fim da chamada ao addActionListener

		// CRIE AQUI ITEM DE MENU EXITx

		JMenuBar bar = new JMenuBar(); // cria barra de menus
		bar.setLayout(new GridLayout(1, 3));
		setJMenuBar(bar); // adiciona barra de menus ao aplicativo
		
		
		

	
		bar.add(fileMenu); 
		bar.add(exitMenu);
		JMenu formatMenu = new JMenu("Format"); // create format menu
		formatMenu.setMnemonic('r'); // set mnemonic to r
		// array listing string colors
		String colors[] = { "Black", "Blue", "Red", "Green" };
		JMenu colorMenu = new JMenu("Color"); // create color menu
		colorMenu.setMnemonic('C'); // set mnemonic to C

		// create radio button menu items for colors
		colorItems = new JRadioButtonMenuItem[colors.length];
		colorButtonGroup = new ButtonGroup(); // manages colors
		ItemHandler itemHandler = new ItemHandler(); // handler for colors
		
		// create color radio button menu items
		for ( int count = 0; count < colors.length; count++ ){
			colorItems[ count ] =
				new JRadioButtonMenuItem( colors[ count ] ); // create item
				colorMenu.add( colorItems[ count ] ); // add item to color menu
				colorButtonGroup.add( colorItems[ count ] ); // add to group
				colorItems[ count ].addActionListener( itemHandler );
		}
		
		
		colorItems[ 0 ].setSelected( true ); // select first Color item

		formatMenu.add( colorMenu ); // add color menu to format menu
		formatMenu.addSeparator();
		formatMenu.add(background);
		formatMenu.addSeparator(); // add separator in menu
		
		// array listing font names
		String fontNames[] = { "Serif", "Monospaced", "SansSerif" };
		
		JMenu fontMenu = new JMenu( "Font" ); // create font menu
		fontMenu.setMnemonic( 'n' ); // set mnemonic to n
		
		// create radio button menu items for font names
		fonts = new JRadioButtonMenuItem[ fontNames.length ];
		fontButtonGroup = new ButtonGroup(); // manages font names
		String fontStyleNames[] = {"Bold", "Italic"};
		styleItems = new JCheckBoxMenuItem[fontStyleNames.length];
		
		
		
		

		// create Font radio button menu items
		for ( int count = 0; count < fonts.length; count++ ){
			fonts[ count ] = new JRadioButtonMenuItem( fontNames[ count ] );
			fontMenu.add( fonts[ count ] ); // add font to font menu
			fontButtonGroup.add( fonts[ count ] ); // add to button group
			fonts[ count ].addActionListener( itemHandler ); // add handler
		}//fim do for
		
		for(int i = 0 ; i < styleItems.length ; i++) {
			styleItems[i] = new JCheckBoxMenuItem(fontStyleNames[i]);
			fontMenu.add(styleItems[i]);
			
		}
	
		styleItems[0].addActionListener(itemHandler);
		styleItems[1].addActionListener(itemHandler);
		
		fonts[ 0 ].setSelected( true ); // select first Font menu item
		fontMenu.addSeparator(); // add separator bar to font menu
		
		// CRIE AQUI ITEM DE MENU DE ESTILOS DE LETRA (BOLD, ITALIC) QUE FIQUE DENTRO DO MENU FONT
		
		formatMenu.add( fontMenu ); // add Font menu to Format menu
		bar.add( formatMenu ); // add Format menu to menu bar
	
		// set up label to display text
		displayJLabel = new JLabel( "Sample Text", SwingConstants.CENTER );
		displayJLabel.setForeground( colorValues[ 0 ] );
		displayJLabel.setFont( new Font( "Serif", Font.PLAIN, 72 ) );
		
		getContentPane().setBackground( Color.CYAN ); // set background
		add( displayJLabel, BorderLayout.CENTER ); // add displayJLabel

	}
	
	// classe interna  to handle action events from menu items
	private class ItemHandler implements ActionListener {
		// process color and font selections
		public void actionPerformed(ActionEvent event) {
			// process color selection
			style = 0; // initialize style

			// check for bold selection
			if (styleItems[0].isSelected())
				style += Font.BOLD; // add bold to style

			// check for italic selection
			if (styleItems[1].isSelected())
				style += Font.ITALIC; // add italic to style
			displayJLabel.setFont(new Font(displayJLabel.getFont().getName(),style, 72));
		
			
			
			for (int count = 0; count < colorItems.length; count++) {
				if (colorItems[count].isSelected()) {
					displayJLabel.setForeground(colorValues[count]);
					break;
				} // end if
			} // end for

			// process font selection
			for (int count = 0; count < fonts.length; count++) {
				if (event.getSource() == fonts[count]) {
					displayJLabel.setFont(new Font(fonts[count].getText(),style, 72));
				} // end if
			} // end for
			repaint(); // redraw application
		} // end method actionPerformed
	} // end class ItemHandler

	// inner class to handle item events from check box menu items
	

	public static void main(String[] args) {
		MenuFrame menuFrame = new MenuFrame(); // cria MenuFrame
		menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menuFrame.setSize(500, 200); // configura tamanho frame
		menuFrame.setVisible(true); // exibe frame

	}

}
