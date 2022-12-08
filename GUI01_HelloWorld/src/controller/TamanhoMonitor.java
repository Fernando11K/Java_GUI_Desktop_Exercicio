package controller;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TamanhoMonitor {

	public static void main(String[] args) {
		
		JFrame tela = new JFrame("Programação Desktop");
		JLabel texto = new JLabel("Alô, Mundo!");
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		
		Dimension screenSize = kit.getScreenSize();
		//A Classe encapsula a largura (Width) e a altura(Height) em um único objeto
		
		int screenWidth = (int) screenSize.getWidth();
		int screenHeight = (int) screenSize.getHeight();
		
		tela.setLayout(null);
		tela.getContentPane().add(texto);
		
		texto.setBounds(30, 20, 210, 20);
		
		tela.setSize(screenWidth,screenHeight);
		tela.setVisible(true);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
