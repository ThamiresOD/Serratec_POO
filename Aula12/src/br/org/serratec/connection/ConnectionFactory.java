package br.org.serratec.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory { // 127.0.0.1 ou localhost
	private String urlConection = "jdbc:postgresql://127.0.0.1:5432/pOOAula12-jdbc", user = "postgres", password = "senha";
	private Connection connection;

	public Connection getConnection() {
		try {
			System.out.println(" Conectando! ");
			connection = DriverManager.getConnection(urlConection, user, password);
			if(connection != null) {
				System.out.println(" Conexão ralizada! ");
			} else {
				System.out.println(" Não conectado! ");
			}
		} catch (SQLException e) {
			System.out.println(" Erro! Driver não encontrado! ");
		}
		return connection;
	}
}
