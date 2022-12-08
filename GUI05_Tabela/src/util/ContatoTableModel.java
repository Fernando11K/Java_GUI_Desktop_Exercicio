package util;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.Contato;

public class ContatoTableModel extends AbstractTableModel {
	private final List<Contato> contatos;

	public ContatoTableModel(List<Contato> contatos) {
		this.contatos = contatos;
	}

	@Override
	public int getColumnCount() {

		return 4;
	}

	@Override
	public int getRowCount() {

		return contatos.size();
	}

	@Override
	public Object getValueAt(int linha, int coluna) {

		Contato contato = contatos.get(linha);

		switch (coluna) {
		case 0: {

			return contato.getId();
		}

		case 1: {

			return contato.getNome();
		}

		case 2: {

			return contato.getEmail();
		}

		case 3: {

			return contato.getMensagem();
		}

		default:
			break;
		}

		return null;
	}

	@Override
	public String getColumnName(int column) {

		switch (column) {
		case 0: {

			return "ID: ";
		}

		case 1: {

			return "NOME: ";
		}

		case 2: {

			return "Email: ";
		}
		
		case 3: {

			return "Mensagem: ";
		}
		
		default:
			return "";
		}

	}

}
