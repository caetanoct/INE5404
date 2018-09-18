
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorGUI extends JFrame {
	public static int fat(int num){
		if(num < 2){
			return 1;
		}
		else{
			return num * fat(num-1);
		}
	}
	private String textoAnterior;
	private String stringAntesOp;
	private String stringDpsOp;
	private boolean operacao = false;
	private JTextArea text;
	private String operando;
	private JPanel panel;
	
	private JButton[] buttons;
	
	private static final String[] names = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+", "fat", "exponencial", "sqrt", "cubic root", "%", "x²", "x^y", "CLR"};
	
	private String result;
	private double doubleResult;
	
	private buttonHandler buttonHandler;
	
	public CalculatorGUI() {
		super("Calculator");
		setLayout(new BorderLayout());
		
		result = "";
		panel = new JPanel();
		panel.setLayout(new GridLayout(6, 4));
		textoAnterior = "";
		stringAntesOp = "";
		stringDpsOp = "";
		operando = "";
		
		buttonHandler = new buttonHandler();
		
		buttons = new JButton[names.length];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(names[i]);
			buttons[i].addActionListener(buttonHandler);
			panel.add(buttons[i]);
			System.out.println("Button["+i+"] = "+ buttons[i].getText());
		}
		
		text = new JTextArea("");
		add(text, BorderLayout.NORTH);
		
		add(panel);
	}
	
	private class buttonHandler implements ActionListener {
		//{"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+", "fat", "exponencial", "sqrt", "cubic root", "%", "x²", "x^y", "CLR"}
		@Override
		public void actionPerformed(ActionEvent event) {
			
			if(event.getSource() == buttons[0]){
				textoAnterior = textoAnterior + "7";
				if(operacao = true){
					stringDpsOp = textoAnterior;
				}
				text.setText(textoAnterior);
				
			
			}
			if(event.getSource() == buttons[1]){
				text.setText(textoAnterior+="8");
				if(operacao = true){
					stringDpsOp = textoAnterior;
				}
				
			}
			if(event.getSource() == buttons[2]){
				text.setText(textoAnterior+="9");
				if(operacao = true){
					stringDpsOp = textoAnterior;
				}
	
			}
			if(event.getSource() == buttons[3]){
				operacao = true;
				stringAntesOp = textoAnterior;
				textoAnterior = "";
				stringDpsOp = "";
				operando = buttons[3].getText();
				
				
			}
			if(event.getSource() == buttons[4]){
				text.setText(textoAnterior+="4");
				if(operacao = true){
					stringDpsOp = textoAnterior;
				}
			}
			if(event.getSource() == buttons[5]){
				text.setText(textoAnterior+="5");
				if(operacao = true){
					stringDpsOp = textoAnterior;
				}
			}
			if(event.getSource() == buttons[6]){
				text.setText(textoAnterior+="6");
				if(operacao = true){
					stringDpsOp = textoAnterior;
				}
			}
			if(event.getSource() == buttons[7]){
				operacao = true;
				stringAntesOp = textoAnterior;
				textoAnterior = "";
				stringDpsOp = "";
				operando = buttons[7].getText();
			}
			if(event.getSource() == buttons[8]){
				text.setText(textoAnterior+="1");
				if(operacao = true){
					stringDpsOp = textoAnterior;
				}
			}
			if(event.getSource() == buttons[9]){
				text.setText(textoAnterior+="2");
				if(operacao = true){
					stringDpsOp = textoAnterior;
				}
			}
			if(event.getSource() == buttons[10]){
				text.setText(textoAnterior+="3");
				if(operacao = true){
					stringDpsOp = textoAnterior;
				}
			}
			if(event.getSource() == buttons[11]){
				operacao = true;
				stringAntesOp = textoAnterior;
				textoAnterior = "";
				stringDpsOp = "";
				operando = buttons[11].getText();
			}
			if(event.getSource() == buttons[12]){
				text.setText(textoAnterior+="0");
				if(operacao = true){
					stringDpsOp = textoAnterior;
				}
			}
			if(event.getSource() == buttons[13]){
				if(text.getText().indexOf('.') >= 0) {
					System.out.println("Já existe um '.' na string");
				}
				else
				{
					text.setText(textoAnterior+=".");
				}
				
			}
			if(event.getSource() == buttons[14]){
				double valor1 = Double.parseDouble(stringAntesOp);
				double valor2 = Double.parseDouble(stringDpsOp);
				operacao = false;
				double resultFinal = 0;
				switch (operando) {
				case "+":
					
					resultFinal = valor1 + valor2;
					break;
				case "-":
					resultFinal = valor1 - valor2;
					break;
				case "/":
					if(valor2 == 0){
						text.setText("Divisao por 0");
						break;
					}
					resultFinal = valor1 / valor2;
					break;
				case "*":
					resultFinal = valor1 * valor2;
					break;
				case "x^y":
					resultFinal = Math.pow(valor1,valor2);
					break;
			
				}
				stringAntesOp = "";
				stringDpsOp = "";
				textoAnterior = Double.toString(resultFinal);
				operando = "";
				text.setText(textoAnterior);
			}
			if(event.getSource() == buttons[15]){
				operacao = true;
				stringAntesOp = text.getText();
				textoAnterior = "";
				stringDpsOp = "";
				operando = buttons[15].getText();
			}
			if(event.getSource() == buttons[16]){
				int faet = fat(Integer.parseInt(textoAnterior));
				textoAnterior = Integer.toString(faet);
				text.setText(textoAnterior);
				
			}
			if(event.getSource() == buttons[17]){
				double valorString = Double.parseDouble(textoAnterior);
				double resultFinal = Math.exp(valorString);
				textoAnterior = Double.toString(resultFinal);
				text.setText(textoAnterior);
				
			}
			
			if(event.getSource() == buttons[18]){
				double valorString = Double.parseDouble(textoAnterior);
				double resultFinal = Math.pow(valorString, 1.0/2);
				textoAnterior = Double.toString(resultFinal);
				text.setText(textoAnterior);
			}
			
			if(event.getSource() == buttons[19]){
				double valorString = Double.parseDouble(textoAnterior);
				double resultFinal = Math.pow(valorString, 1.0/3);
				textoAnterior = Double.toString(resultFinal);
				text.setText(textoAnterior);
			}
			
			
			if(event.getSource() == buttons[20]){
				double valorString = Double.parseDouble(textoAnterior);
				double resultFinal = valorString/100;
				textoAnterior = Double.toString(resultFinal);
				text.setText(textoAnterior);
			}
			
			if(event.getSource() == buttons[21]){
				double valorString = Double.parseDouble(textoAnterior);
				double resultFinal = valorString*valorString;
				textoAnterior = Double.toString(resultFinal);
				text.setText(textoAnterior);
			}
			if(event.getSource() == buttons[22]){
				operacao = true;
				stringAntesOp = textoAnterior;
				textoAnterior = "";
				stringDpsOp = "";
				operando = buttons[22].getText();
				
			}
			if(event.getSource() == buttons[23]){
				operando = "";
				stringAntesOp = "";
				stringDpsOp = "";
				operacao = false;
				textoAnterior = "";
				text.setText("");
				
			}
			
					
					
				
			}
		
		
	}
	public static void main(String[] args) {
		CalculatorGUI calculator = new CalculatorGUI();
		
		calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calculator.setSize(500, 200);
		calculator.setVisible(true);
		
	}
}
