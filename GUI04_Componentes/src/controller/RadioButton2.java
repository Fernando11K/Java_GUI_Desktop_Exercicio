package controller;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class RadioButton2 extends JFrame {

	ImageIcon iconHomem = new ImageIcon("img/homem.jpg");
	ImageIcon iconMulher = new ImageIcon("img/mulher.jpg");
	JLabel label = new JLabel(iconHomem);

	JRadioButton radioHomem = new JRadioButton("Homem");
	JRadioButton radioMulher = new JRadioButton("Mulher");
	ButtonGroup group = new ButtonGroup();

	public RadioButton2() {
		super("Exemplo de RadioButton");

		JButton botao = new JButton("OK");

		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					JOptionPane.showMessageDialog(null,
							new String("Você selecionou: " + group.getSelection().getActionCommand())); //Retorna qual foi selecionado
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Você não selecionou nenhum objeto", "Erro de Seleção", 0);

				}

			}
		});

		label.setPreferredSize(new Dimension(150, 300));

		radioHomem.setMnemonic(KeyEvent.VK_H);
		radioHomem.setActionCommand("Homem");

		radioMulher.setMnemonic(KeyEvent.VK_M);
		radioMulher.setActionCommand("Mulher");

		group.add(radioHomem);
		group.add(radioMulher);

		radioHomem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setIcon(iconHomem);
				// System.out.println(group.getSelection().getActionCommand());

			}
		});

		radioMulher.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				label.setIcon(iconMulher);
				// System.out.println(group.getSelection().getActionCommand());

			}
		});
		;

		radioMulher.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setIcon(iconMulher);

			}
		});

		JPanel radioPainel = new JPanel(new GridLayout(2, 1));
		radioPainel.add(radioHomem);
		radioPainel.add(radioMulher);

		Container container = getContentPane();

		container.add(radioPainel, BorderLayout.WEST);
		container.add(label, BorderLayout.CENTER);
		container.add(botao, BorderLayout.SOUTH);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 400);
		setVisible(true);

	}

	public static void main(String[] args) {

		new RadioButton2();

	}

}
