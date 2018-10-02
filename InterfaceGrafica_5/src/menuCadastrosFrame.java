import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class menuCadastrosFrame extends JFrame {
	
	//ATRIBUTOS
	public ArrayList<Cadastro> cadastrosSalvos = new ArrayList<>();
	private JMenu menu = new JMenu("Menu");
	private JMenuItem novoCadastroItem = new JMenuItem("Novo cadastro");
	private JMenuItem procurarItem = new JMenuItem("Procurar cadastro pelo nome");
	private JMenuItem apagarItem = new JMenuItem("Apagar cadastro");
	private JTabbedPane tabbedPane = new JTabbedPane();
	
	
	//CONSTRUTOR
	public menuCadastrosFrame() {
		super("Título");

		menu.add(novoCadastroItem);
		menu.addSeparator();
		menu.add(procurarItem);
		menu.addSeparator();
		menu.add(apagarItem);
		HandlerMenu handler = new HandlerMenu();
		novoCadastroItem.addActionListener(handler);
		procurarItem.addActionListener(handler);
		apagarItem.addActionListener(handler);
		JMenuBar bar = new JMenuBar();
		bar.add(menu);
		setJMenuBar(bar);
		
		//PANEL CADASTRO
		JPanel panelCadastro = new JPanel();
		JLabel nomeLab =  new JLabel("Nome:");
		JTextField nome = new JTextField(10);
		JLabel sobrenomeLab =  new JLabel("Sobrenome:");
		JTextField sobrenome = new JTextField(10);
		JLabel cpfLab =  new JLabel("CPF:");
		JTextField cpf = new JTextField(10);
		JButton salvarButton = new JButton("Salvar");
		salvarButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Cadastro novoCad = new Cadastro(nome.getText(), sobrenome.getText(), cpf.getText());
				cadastrosSalvos.add(novoCad);
			}
		});
		panelCadastro.add(nomeLab);
		panelCadastro.add(nome);
		panelCadastro.add(sobrenomeLab);
		panelCadastro.add(sobrenome);
		panelCadastro.add(cpfLab);
		panelCadastro.add(cpf);
		panelCadastro.add(salvarButton);
		tabbedPane.addTab("", panelCadastro);
		//PANEL PROCURAR
		JPanel panelProcurar = new JPanel();	
		tabbedPane.addTab("", panelProcurar);
		
		add(tabbedPane);
	}

	private class HandlerMenu implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource().equals(novoCadastroItem)) {
				tabbedPane.setSelectedIndex(0);
			}
			if (e.getSource().equals(procurarItem)) {
				tabbedPane.setSelectedIndex(1);
			}
			if (e.getSource().equals(apagarItem)) {
				tabbedPane.setSelectedIndex(2);
			}
		}

	}
}
