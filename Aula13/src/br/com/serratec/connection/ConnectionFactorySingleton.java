package br.com.serratec.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactorySingleton {
	private static String urlConnection = "jdbc:postgresql://127.0.0.1:5432/pOOAula12-jdbc", user = "postgres", password = "senha";
	private static Connection connection = null;
	
	private static Connection newConnection() {
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(urlConnection, user, password);
			
		} catch (Exception e) {
			System.out.println(" Não foi possível conectar! ");
		}
		return con;
	}
	
	public static Connection getConnection() {
		if(connection == null) {
			connection = newConnection();
			System.out.println(" Conectado com sucesso");
		}
		return connection;
	}
}
