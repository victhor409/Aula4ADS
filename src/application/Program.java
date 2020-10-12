package application;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import JSwing.JanelaSimples;

public class Program {
		
	
	
	public static void main(String[] args) {
	
	JanelaSimples j1 = new JanelaSimples();
	j1.setModal(true);
	j1.setBounds(0,0 , 300, 300);
	j1.setVisible(true);
	
	}
}	
		

