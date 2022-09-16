package br.com.serratec.persistence;

import java.util.List;

import br.com.serratec.interfaces.CrudGenerico;
import br.com.serratec.model.Categoria;

public class CategoriaDao implements CrudGenerico<Categoria> {

	@Override
	public List<Categoria> listar() {
		return null;
	}

	@Override
	public void inserir(Categoria t) {
	}

	@Override
	public void atualizar(Categoria t) {
	}

	@Override
	public void remover(Categoria t) {
	}

	@Override
	public Categoria buscar(int codigo) {
		return null;
	}
}
