package controller;

import java.util.List;

import javax.swing.JFrame;

import model.Contato;
import model.DAO.ContatoDAO;
import util.Teclado;
import view.JanelaExibeMensagens;

public class ControleDeContatos  {
	
	private static final int CADASTRAR_MENSAGEM = 1;
	private static final int MOSTRAR_MENSAGENS = 2;
	private static final int APAGAR_MENSAGEM = 3;
	private static final int ATUALIZAR_MENSAGEM = 4;
	private static final int SAIR = 5;
	
	public void mostrarMenu() {
		System.out.println("---Sistema de Mensagens---");
		System.out.println("1-Cadastrar mensagem.");
		System.out.println("2-Mostrar mensagem.");
		System.out.println("3-Apagar mensagem.");
		System.out.println("4-Atualizar mensagem.");
		System.out.println("5-Sair ");
	}
	public void cadastrarMensagem() {
		System.out.println("\n---Cadastro de Mensagem---\n");
		String nome = Teclado.lerTexto("Nome: ");
		String email = Teclado.lerTexto("Email: ");
		String mensagem = Teclado.lerTexto("Mensagem: ");
		
		Contato contato = ContatoDAO.inserir(nome, email, mensagem);
		
		if (contato!=null) {
			System.out.println("\nContato inserido com sucesso.");
			System.out.println(contato.toString());
		}else {
			System.out.println("Erro ao inserir contato.");
		}
	}
	
	public void mostrarMensagens() {
		System.out.println("---Relatório de Mensagens---");
		
		List<Contato> contatos = ContatoDAO.buscarTodos();
		new JanelaExibeMensagens(contatos);
		
	
	}
	
	public void apagarMensagem() {
		System.out.println("\n---Apagar Mensagem---\n");
		int id = Teclado.lerInt("ID: ");
		if(ContatoDAO.excluir(id)) {
			System.out.println("Mensagem apagada com sucesso.");
		}else {
			System.out.println("Erro ao apagar mensagem.");
		}
	}
	
	public void atualizarMensagem() {
		System.out.println("---Atualizar Mensagem---");
		
		int id = Teclado.lerInt("ID: ");
		String mensagem = Teclado.lerTexto("Nova mensagem: ");
		
		if(ContatoDAO.atualizar(id,mensagem)) {
			System.out.println("Mensagem atualizada com sucesso.");
		}else {
			System.out.println("Erro ao atualizar mensagem.");
		}
		
	}

	public static void main(String[] args) {
		ControleDeContatos cdc = new ControleDeContatos();
		int opcao = SAIR;
		do {
			cdc.mostrarMenu();
			opcao = Teclado.lerInt("Opção: ");
			switch (opcao) {
			
			case CADASTRAR_MENSAGEM:
				cdc.cadastrarMensagem();
				break;
				
			case MOSTRAR_MENSAGENS:
				cdc.mostrarMensagens();
				break;
				
			case APAGAR_MENSAGEM:
				cdc.apagarMensagem();
				break;
				
			case ATUALIZAR_MENSAGEM:
				cdc.atualizarMensagem();
				break;
				
			case SAIR:
				System.out.println("Saindo do sistema.");
				break;
				
			default:
				System.out.println("Opção inválida");
				break;
			}
			Teclado.lerTexto("\nPressione ENTER para continuar...\n");
			
		}while(opcao != SAIR);
		System.out.println("/nSistema encerrado.");
		
		
		

	}

}
