package controller;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JanelasDeConfirmação {

	public static void main(String[] args) {

		//Janela de Confirmação 1
		int opt1 = JOptionPane.showConfirmDialog(null, "Janela de Confirmação 1");

		switch (opt1) {

		case JOptionPane.CANCEL_OPTION:
			JOptionPane.showMessageDialog(null, "Você clicou em \"Cancelar\"");
			break;

		case JOptionPane.YES_OPTION:
			JOptionPane.showMessageDialog(null, "Você clicou em \"Sim\"");
			break;

		case JOptionPane.NO_OPTION:
			JOptionPane.showMessageDialog(null, "Você clicou em \"Não\"");
			break;

		default:
			JOptionPane.showMessageDialog(null, "Você fechou a janela");
		}
		//Janela de Confirmação 2
			
			
		int opt2 = JOptionPane.showConfirmDialog(null, "Janela de Confirmação 2","Título da Janela de Confirmação 2",
				JOptionPane.OK_CANCEL_OPTION);
		
		switch (opt2) {
		
		case JOptionPane.CANCEL_OPTION:
			
			JOptionPane.showMessageDialog(null,"Você clicou em \"Cancelar\"");
			break;

		case JOptionPane.OK_OPTION:
			JOptionPane.showMessageDialog(null, "Você clicou em \"OK\"");
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "Você fechou a janela");
			break;
		}
		//Janela de Confirmação 3
		
		int opt3 = JOptionPane.showConfirmDialog(null, "Janela de Confirmação 3","Título da Janela de Confirmação 3",
				JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
		
		switch (opt3) {
		
		case JOptionPane.YES_OPTION:
			
			JOptionPane.showMessageDialog(null,"Você clicou em \"Sim\"");
			break;

		case JOptionPane.NO_OPTION:
			JOptionPane.showMessageDialog(null, "Você clicou em \"Não\"");
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "Você fechou a janela");
			break;
		}
			//Janela de Confirmação 4
			
			ImageIcon iconFoto = new ImageIcon("img/iconApaixonado65.png");
			
			int opt4 = JOptionPane.showConfirmDialog(null, "Janela de Confirmação 4","Título da Janela de Confirmação 4",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,iconFoto);
			
			switch (opt4) {
			
			case JOptionPane.YES_OPTION:
				
				JOptionPane.showMessageDialog(null,"Você clicou em \"Sim\"");
				break;

			case JOptionPane.NO_OPTION:
				JOptionPane.showMessageDialog(null, "Você clicou em \"Não\"");
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Você fechou a janela");
				break;	
			}
			//
				
			String texto1 = JOptionPane.showInputDialog("Janela de Entrada 1");
			JOptionPane.showMessageDialog(null, "Você digitou: " +texto1);
			
			String texto2 = JOptionPane.showInputDialog(null,"Janela de Entrada 2");
			JOptionPane.showMessageDialog(null, "Você digitou: " +texto2);
			
			String texto3 = JOptionPane.showInputDialog("Janela de Entrada 3","Valor inicial da janela de entrada 3");
			JOptionPane.showMessageDialog(null, "Você digitou: " +texto3);
			
			String texto4 = JOptionPane.showInputDialog(null,"Janela de Entrada 4", "Valor inicial da janela de entrada 4");
			JOptionPane.showMessageDialog(null, "Você digitou: " +texto4);
			
			String texto5 = JOptionPane.showInputDialog(null,"Janela de Entrada 5", "Título da janela de entrada 5", JOptionPane.QUESTION_MESSAGE);
			JOptionPane.showMessageDialog(null, "Você digitou: " +texto5);
			
			ImageIcon iconFoto2 = new ImageIcon("img/iconPiscando65");
			String vetString [] = {"Fabrício","Rodrigo","Xicão","PC"};
			
			Object objeto = JOptionPane.showInputDialog(null, "Janela de Entrada 6", "Título da janela de entrada 6", JOptionPane.PLAIN_MESSAGE, iconFoto2, vetString, vetString[3]);
			JOptionPane.showMessageDialog(null, "Você selecionou: " +objeto);
			
			
		
			
			
			}
		}
	
