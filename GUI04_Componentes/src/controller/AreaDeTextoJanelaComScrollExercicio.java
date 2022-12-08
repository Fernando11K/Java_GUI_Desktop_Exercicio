package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AreaDeTextoJanelaComScrollExercicio extends JFrame {
	
	public AreaDeTextoJanelaComScrollExercicio() {
		super("Área de Texto Janela com Scroll");
		
		JButton botao = new JButton("Enviar Texto");
		JTextArea areaDeTexto = new JTextArea(10,30);//
		
		
		
		botao.addActionListener(new ActionListener() {//
			
			@Override
			public void actionPerformed(ActionEvent e) {//
				JOptionPane.showMessageDialog(null, new String(areaDeTexto.getText()));
				
			}
		});
		
		JLabel label = new JLabel("Digite uma mensagem");
		
		
		
		JPanel painel = new JPanel();
		painel.add(label);
		painel.add(areaDeTexto);
		painel.add(botao);
		

		
		
		JScrollPane sp = new JScrollPane(painel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		// Definindo barra de rolagem desta vez ao painel, e não somente à área de texto.
		
		add(sp);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
	
		new AreaDeTextoJanelaComScrollExercicio();
		

	}

}
