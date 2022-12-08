package controller;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckBox extends JFrame {

	ImageIcon iconChocolate = new ImageIcon("img/chocolate.jpg");
	ImageIcon iconCoco = new ImageIcon("img/coco.jpg");
	ImageIcon iconMorango = new ImageIcon("img/morango.jpg");

	JLabel labelChocolate = new JLabel(iconChocolate);
	JLabel labelCoco = new JLabel(iconCoco);
	JLabel labelMorango = new JLabel(iconMorango);

	public CheckBox() {
		super("Exemplo CheckBox");

		labelChocolate.setPreferredSize(new Dimension(250, 250));
		labelChocolate.setVisible(false);

		labelCoco.setPreferredSize(new Dimension(250, 250));
		labelCoco.setVisible(false);

		labelMorango.setPreferredSize(new Dimension(250, 250));
		labelMorango.setVisible(false);

		JCheckBox checkChocolate = new JCheckBox("Chocolate");
		checkChocolate.setMnemonic(KeyEvent.VK_H);

		JCheckBox checkCoco = new JCheckBox("Coco");
		checkChocolate.setMnemonic(KeyEvent.VK_O);

		JCheckBox checkMorango = new JCheckBox("Morango");
		checkMorango.setMnemonic(KeyEvent.VK_M);

		checkChocolate.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.DESELECTED) {

					labelChocolate.setVisible(false);

				} else {

					labelChocolate.setVisible(true);

				}

			}
		});

		checkMorango.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.DESELECTED) {

					labelMorango.setVisible(false);

				} else {

					labelMorango.setVisible(true);

				}

			}
		});

		checkCoco.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.DESELECTED) {

					labelCoco.setVisible(false);

				} else {

					labelCoco.setVisible(true);

				}

			}
		});

		JPanel checkPainel = new JPanel(new GridLayout(1,3));
		checkPainel.add(checkChocolate);
		checkPainel.add(checkCoco);
		checkPainel.add(checkMorango);
		
		JPanel labelPainel = new JPanel(new GridLayout(1,3));
		labelPainel.add(labelChocolate);
		labelPainel.add(labelCoco);
		labelPainel.add(labelMorango);
		
		Container container = getContentPane();
		container.add(checkPainel, BorderLayout.NORTH);
		container.add(labelPainel, BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,300);
		setVisible(true);
	}
	
	

	public static void main(String[] args) {

		new CheckBox();
	}

}
