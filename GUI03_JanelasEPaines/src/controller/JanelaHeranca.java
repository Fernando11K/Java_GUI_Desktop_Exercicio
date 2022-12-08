package controller;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JanelaHeranca extends JFrame {
	
	public JanelaHeranca() {
		super("Título: Janela Com Herança");
		
		
		setTitle("Título da Janela");
		setSize(500,300);
		//Define as dimensões da janela.
		setResizable(false);
		//Bloqueia o redimensionamento da janela por mouse.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Encerra o programa ao fechar a janela
		
		ImageIcon icone = new ImageIcon("img/Like.png");
		setIconImage(icone.getImage());
		
		setLocationRelativeTo(null);
		//Centraliza a janela na tela
		
		setVisible(true);
		
		
	}
	
	

	public static void main(String[] args) {
		
		new JanelaHeranca();
	
	
	}

}
