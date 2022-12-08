package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CaixaDeTexto extends JFrame {
	
	public CaixaDeTexto() {
		super("Caixa de Texto");
		JTextField caixaDeTexto = new JTextField(20);
		caixaDeTexto.setText("Digite algo aqui");
		caixaDeTexto.setToolTipText("Digite logo!!!");
		
		caixaDeTexto.addKeyListener(new KeyListener() { //Adicionando um Listener à Caixa de Texto
			
			@Override
			public void keyTyped(KeyEvent e) {
				
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				caixaDeTexto.setText(caixaDeTexto.getText().toUpperCase());
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		JButton botao1 = new JButton("Votão 1"); //Criando um botão e atribuindo suas funcionalidades
		botao1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, caixaDeTexto.getText());
				
			}
		});
		
		JPanel painel = new JPanel(); //Criando um painel e adicionado a caixa de texto e o botão 
		painel.add(caixaDeTexto);
		painel.add(botao1);
		
		add(painel); //Adicionando o painel à janela e definindo propriedades da janela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,100);
		setVisible(true);
		
	}

	public static void main(String[] args) {
	
		new CaixaDeTexto();
	}

}
