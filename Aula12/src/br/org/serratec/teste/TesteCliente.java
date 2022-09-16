package br.org.serratec.teste;

import java.sql.Connection;

import br.org.serratec.connection.ConnectionFactory;
import br.org.serratec.model.Cliente;
import br.org.serratec.persistence.ClienteDao;

public class TesteCliente {
	public static void main(String[] args) {
		Cliente cliente = new Cliente(null, "Cait", "22999987755","cait@gmail.com");
		Cliente c1 = new Cliente(null, "Ashe", "22998535455","ashe@gmail.com");
		
		Connection connection = new ConnectionFactory().getConnection();
		
		ClienteDao clienteDao = new ClienteDao(connection);
		
		try {
			connection.setAutoCommit(false);
			clienteDao.inserirCliente(cliente);
			clienteDao.inserirCliente(c1);
			connection.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	//	clienteDao.inserirCliente(cliente);
	//	clienteDao.atualizarCliente(cliente);
	//	clienteDao.removerCliente(cliente);
		
	//	for (Cliente c : clienteDao.listarClientes()) {
	//		System.out.println(c);}
		
	
	//	System.out.println(clienteDao.listarClientes("om"));
		
	// CRUD (Create retrieve update delete)
		
	}
}

