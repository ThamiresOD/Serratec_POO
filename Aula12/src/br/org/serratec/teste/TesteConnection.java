package br.org.serratec.teste;

import java.sql.Connection;

import br.org.serratec.connection.ConnectionFactory;

public class TesteConnection {
	
	public static void main(String[] args) {
	
		Connection connection = new ConnectionFactory().getConnection();
		
	}

}
