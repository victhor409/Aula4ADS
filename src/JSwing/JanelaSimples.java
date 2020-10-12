package JSwing;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class JanelaSimples extends JDialog{

	
	private static final long serialVersionUID = 1L;
	private JTextField txt1;
	private JCheckBox chk1, chk2;
	private JRadioButton rb1, rb2;
	private JButton btn1, btn2;
	
	
	public JanelaSimples() {
		setLayout(new GridLayout(4,2));
		add(new JLabel("Nome"));
		add(txt1=new JTextField(10));
		//campo de text com 10 posicoes
		
		add(new JLabel("Opcoes de leitura"));
		JPanel jp1 = new JPanel(new GridLayout(2,1));
		jp1.add(chk1 = new JCheckBox("Revista Mensal"));
		jp1.add(chk2 = new JCheckBox("Versao Digital"));
		//Painel de caixa de selecao
		
		add(jp1);
		
		add(new JLabel("Graduado"));
		JPanel jp2 = new JPanel(new GridLayout(2,1));
		jp2.add(new JRadioButton("Sim"));
		jp2.add(new JRadioButton("Nao"));
		
		
		
		//agrupamento dos botes do radio
		add(jp2);
		
		add(btn1 = new JButton("Ok"));
		add(btn2= new JButton("Cancel"));
		
	}
}
