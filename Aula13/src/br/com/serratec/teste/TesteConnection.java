package br.com.serratec.teste;

import java.sql.Connection;

import br.com.serratec.connection.ConnectionFactorySingleton;

public class TesteConnection {
	public static void main(String[] args) {
		Connection con = ConnectionFactorySingleton.getConnection();
		
	}

}
