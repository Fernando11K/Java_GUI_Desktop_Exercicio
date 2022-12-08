package controller;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Painel extends JFrame {
	
	Painel(){
	super("Título");
	
	ImageIcon icone1 = new ImageIcon("img/ic_youtube.png");
	ImageIcon icone2 = new ImageIcon("img/ic_onoff.jpg");
	ImageIcon icone3 = new ImageIcon("img/ic_download.gif");
	JLabel labelTexto = new JLabel("Texto e imagem no painel"); //Etiqueta que recebe texto
	
	JLabel label1 = new JLabel(icone1); //Etiqueta que recebe imagem
	JLabel label2 = new JLabel(icone2);
	JLabel label3 = new JLabel(icone3);
	
	JPanel painel = new JPanel(); //Criando um painel
	painel.add(labelTexto); // Adicionando as etiquetas ao painel
	painel.add(label1);
	painel.add(label2);
	painel.add(label3);
	
	add(painel);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Encerra o programa ao fechar a janela
	pack(); // A Janela terá o menor tamanho possível
	setVisible(true); //Torna a janela visível
	
	
	}
	public static void main(String[] args) {
		
		new Painel();	}

}
