package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import model.Contato;
import util.Conexao;

public class ContatoDAO {

	public static Contato inserir(String nome, String email, String mensagem) {
		Contato contato = null;

		Conexao conexao = new Conexao("jdbc:mysql://localhost:3306/18_conexaobd?useTimezone=true&serverTimezone=UTC",
				"com.mysql.cj.jdbc.Driver", "root", "@F3rn@nd011000#");

		Connection con = conexao.obterConexao();

		// '?' é um caracter coringa o qual deve ser vínculado a um dado
		String sql = "insert into contato(nome,email,mensagem) values(?,?,?)";
		// Prepara a instrução SQL
		
		/*
		 * É usado para criar um objeto que representa a instrução SQL que será
		 * executada, sendo que é invocado através do objeto Connection.
		 */

		try {

			PreparedStatement comando = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			comando.setString(1, nome);
			comando.setString(2, email);
			comando.setString(3, mensagem);

			if (comando.executeUpdate() > 0) {
				ResultSet rs = comando.getGeneratedKeys();
				if (rs.next()) {
					int id = rs.getInt(1);
					contato = new Contato(id, nome, email, mensagem);
				}
				rs.close();
			}
			comando.close();
			con.close();

		} catch (SQLException e) {
			System.out.println("Erro ao insetir no Banco de Dados.");
			System.out.println("Verifique sua instrução SQL.");
			System.out.println("Mensagem: " + e.getMessage());
		}

		return contato;

	}

	public static List<Contato> buscarTodos() {
		List<Contato> contatos = new LinkedList<Contato>();

		Conexao conexao = new Conexao("jdbc:mysql://localhost:3306/18_conexaobd?useTimezone=true&serverTimezone=UTC",
				"com.mysql.cj.jdbc.Driver", "root", "@F3rn@nd011000#");

		Connection con = conexao.obterConexao();

		String sql = "select * from contato";

		try {
			Statement comando = con.createStatement();

			ResultSet rs = comando.executeQuery(sql);

			while (rs.next()) {
				Contato contato = new Contato();
				contato.setId(rs.getInt("id"));
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setMensagem(rs.getString("mensagem"));

				contatos.add(contato);
			}
			rs.close();
			comando.close();
			con.close();

		} catch (SQLException e) {
			System.out.println("Erro ao buscar no Banco de Dados.");
			System.out.println("Verifique sua instrução SQL.");
			System.out.println("Mensagem: " + e.getMessage());
		}
		return contatos;
	}

	public static boolean excluir(int id) {

		boolean ok = false;

		Contato contato = null;

		Conexao conexao = new Conexao("jdbc:mysql://localhost:3306/18_conexaobd?useTimezone=true&serverTimezone=UTC",
				"com.mysql.cj.jdbc.Driver", "root", "@F3rn@nd011000#");

		Connection con = conexao.obterConexao();

		String sql = "delete from contato where id =?";

		try {
			PreparedStatement comando = con.prepareStatement(sql);
			comando.setInt(1, id);

			ok = comando.executeUpdate() > 0;

			comando.close();
			con.close();

		} catch (SQLException e) {
			System.out.println("Erro ao excluir no Banco de Dados.");
			System.out.println("Verifique sua instrução SQL.");
			System.out.println("Mensagem: " + e.getMessage());
		}
		return ok;

	}

	public static boolean atualizar(int id, String mensagem) {
		boolean ok = false;

		Contato contato = null;

		Conexao conexao = new Conexao("jdbc:mysql://localhost:3306/18_conexaobd?useTimezone=true&serverTimezone=UTC",
				"com.mysql.cj.jdbc.Driver", "root", "@F3rn@nd011000#");

		Connection con = conexao.obterConexao();

		String sql = "update contato set mensagem=? where id=?";
		try {

			PreparedStatement comando = con.prepareStatement(sql);
			comando.setString(1, mensagem);
			comando.setInt(2, id);

			ok = comando.executeUpdate() > 0;

			comando.close();
			con.close();

		} catch (SQLException e) {

			System.out.println("Erro ao atualizar no Banco de Dados.");
			System.out.println("Verifique sua instrução SQL.");
			System.out.println("Mensagem: " + e.getMessage());

		}
		return ok;
	}
}
