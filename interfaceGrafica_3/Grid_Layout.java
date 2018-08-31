

import javax.swing.JFrame;

import java.awt.Container;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;

public class Grid_Layout extends JFrame implements ActionListener {

	private JButton[] buttons; // array de botoes

	private static final String[] names = { "one", "two", "three", "four", "five", "six" };

	private boolean toggle = true; // alterna entre dois layouts

	private Container container; // contÃªiner do frame

	private GridLayout gridLayout1; // primeiro gridlayout

	private GridLayout gridLayout2; // segundo gridlayout

	// construtor sem argumentos

	public Grid_Layout() {

		super("DemonstraÃ§Ã£o GridLayout");

		gridLayout1 = new GridLayout(2, 3, 5, 5); // 2 por 3, lacunas de 5

		gridLayout2 = new GridLayout(3, 2); // 3 por 2, sem lacuna

		container = getContentPane(); // obtÃ©m painel de conteÃºdo
		
		setLayout(gridLayout1);// configura o layout JFrame

		buttons = new JButton[names.length]; // cria array de JButtons

		for (int count = 0; count < names.length; count++) {

			buttons[count] = new JButton(names[count]);

			buttons[count].addActionListener(this); // ouvinte registrado

			add(buttons[count]);// adiciona botao ao JFrame

		}

	}

	@Override
	// trata eventos de botÃ£o alternando entre layouts

	public void actionPerformed(ActionEvent e) {

		if (toggle)

			container.setLayout(gridLayout2);// configura layout como segundo

		else

			container.setLayout(gridLayout1);// configura layout como primeiro

		toggle = !toggle; // alterna para valor oposto

		container.validate();// refaz o layout do container

	}

	public static void main(String[] args) {

		Grid_Layout gridLayoutFrame = new Grid_Layout();

		gridLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		gridLayoutFrame.setSize(300, 200);

		gridLayoutFrame.setVisible(true);

	}

}