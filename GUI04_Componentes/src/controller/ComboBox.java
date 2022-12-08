package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ComboBox extends JFrame {
	
	public ComboBox() {
		super("ComboBox");
		
		final JLabel label = new JLabel();
		String[] vetor = {"um", "dois", "três"};
		JComboBox comboBox = new JComboBox(vetor);
		
		comboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				String conteudo = (String)cb.getSelectedItem();// Variável conteudo recebe o valor selecionado pelo usuário no comboBox
				label.setText(conteudo); //conteudo é então exibido no label
				
			}
		});
		
		JPanel painel = new JPanel();
		painel.add(comboBox);
		painel.add(label);
		
		add(painel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);

	}
	

	public static void main(String[] args) {
		new ComboBox();

	}

}
