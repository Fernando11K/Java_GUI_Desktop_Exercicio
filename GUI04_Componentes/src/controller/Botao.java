package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Botao extends JFrame {

	public Botao() {
		super("Botão");

		JButton botao = new JButton("Botão 1"); // Cria um objeto JButton
		botao.setToolTipText("Clica em mim !!!"); // Msg ao passar o mouse sobre o botão
		botao.addActionListener(new ActionListener() { //Listener vai ficar aguardando alguma ação no botão pelo usuário
			
			@Override
			public void actionPerformed(ActionEvent arg0) { //Dentro deste método define-se o que será feito quando o botão for pressionado
				JOptionPane.showMessageDialog(null, "Você clicou no botão 1.");
			
			}
		});
	JPanel painel = new JPanel(); // Criando um painel e adicionando o botão ao painel
	painel.add(botao);
	
	add(painel);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(300,100);
	setVisible(true);
	}

	public static void main(String[] args) {
		new Botao();
	}

}
