package controller;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Janela {

	public static void main(String[] args) {
	
		JFrame janela = new JFrame();
		janela.setTitle("Título da Janela");
		janela.setSize(500,300);
		//Define as dimensões da janela.
		janela.setResizable(false);
		//Bloqueia o redimensionamento da janela por mouse.
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Encerra o programa ao fechar a janela
		
		ImageIcon icone = new ImageIcon("img/Like.png");
		janela.setIconImage(icone.getImage());
		
		janela.setLocationRelativeTo(null);
		//Centraliza a janela na tela
		
		janela.setVisible(true);
		
	}

}
