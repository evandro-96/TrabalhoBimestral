package br.univel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	private Connection con = null;		

	public Connection abrirConexao() throws SQLException {

		String url = "jdbc:h2:~/test";
		String user = "sa";
		String pass = "sa";
		
		con = DriverManager.getConnection(url, user, pass);
	
		return con;
	}	
	
	public void fecharConexao() throws SQLException {
		con.close();
	}
}