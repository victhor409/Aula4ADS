package application;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Program {
	
	
	public static class MinhaJanela extends JFrame {

	
		private static final long serialVersionUID = 1L;

		public MinhaJanela() throws HeadlessException{
			super("Apenas um teste");
			setLayout(new BorderLayout());
			setBounds(10, 10, 300, 200);
			JPanel jp = new JPanel(new FlowLayout());
			jp.add(new Button("ok"));
			jp.add(new Button("Cancelar"));
			add(jp, "South");
		}
		
	public static void main(String[] args) {
		
		new MinhaJanela().setVisible(true);
		
		int a = new Integer(
				JOptionPane.showInputDialog("Primeiro Numero"));
		int b = new Integer(
				JOptionPane.showInputDialog("Segundo numero"));
		
		int c = a+b;
		JOptionPane.showMessageDialog(null,"A soma será: "+c, "soma", JOptionPane.INFORMATION_MESSAGE);
		
		

	}
	}
}


