package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	private String url; // Local do Banco de Dados.
	private String driver; // Classe Java do Framework que foi baixado na web.
	private String login; // Login do usuário no SGBD.
	private String senha; // Senha do usuário no SGBD.

	public Conexao(String url, String driver, String login, String senha) {
		super();
		this.url = url;
		this.driver = driver;
		this.login = login;
		this.senha = senha;

		try {
			Class.forName(driver);
		} 
		catch (ClassNotFoundException e) {
			System.out.println("Erro ao carregar o Driver. Classe não encontrada!");
			System.out.println("Mensagem: "+e.getMessage());
		}
	}
	public Connection obterConexao() {
		Connection conexao = null;
		
		try {
			conexao = DriverManager.getConnection(this.url,this.login,this.senha);
		} catch (SQLException e) {
			
			System.out.println("Erro ao acessar o Banco de Dados.");
			System.out.println("Verifique os parâmetros de conexão.");
			System.out.println("Mensagem: "+e.getMessage());
		}
		return conexao;
	}
	public String getUrl() {
		return url;
	}
	public String getDriver() {
		return driver;
	}
	public String getLogin() {
		return login;
	}
	public String getSenha() {
		return senha;
	}
    
}
