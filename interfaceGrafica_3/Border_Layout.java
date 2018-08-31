

import java.awt.BorderLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Border_Layout extends JFrame implements ActionListener {

	private JButton[] buttons;// array de botoes para ocultar partes
	private static final String[] names = { "Oculta Norte", "Oculta Sul", "Oculta Leste", "Oculta Oeste",
			"Oculta Centro" };
	private BorderLayout border_Layout; // objeto BorderLayout

	// configura GUI e registra listeners de botão
	public Border_Layout() {
		super("Demonstração Border Layout");

		border_Layout = new BorderLayout(5, 5); // espaços de 5 pixels
		setLayout(border_Layout); // configura o layout do frame
		buttons = new JButton[names.length]; // configura tamanho do array

		// cria JButtons e registra ouvintes para eles
		for (int count = 0; count < names.length; count++) {
			buttons[count] = new JButton(names[count]);
			buttons[count].addActionListener(this);
		}

		add(buttons[0], BorderLayout.NORTH);
		add(buttons[1], BorderLayout.SOUTH);
		add(buttons[2], BorderLayout.EAST);
		add(buttons[3], BorderLayout.WEST);
		add(buttons[4], BorderLayout.CENTER);
	}

	@Override // trata os eventos de botão
	public void actionPerformed(ActionEvent event) {
		// verifica a origem do evento e o painel de conteúdo de layout correspondente
		for (JButton button : buttons) {
			if (event.getSource() == button)
				button.setVisible(false);
			else
				button.setVisible(true);
		}
		border_Layout.layoutContainer(getContentPane()); // faz o layout do painel de conteúdo
	}

	public static void main(String[] args) {

		Border_Layout borderLayoutFrame = new Border_Layout();
		borderLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		borderLayoutFrame.setSize(600, 200);
		borderLayoutFrame.setVisible(true);
	}
}
