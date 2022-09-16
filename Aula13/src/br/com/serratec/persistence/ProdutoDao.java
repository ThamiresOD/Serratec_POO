package br.com.serratec.persistence;

import java.util.List;

import br.com.serratec.interfaces.CrudGenerico;
import br.com.serratec.model.Produto;

public class ProdutoDao implements CrudGenerico<Produto>{

	@Override
	public List<Produto> listar() {
		return null;
	}

	@Override
	public void inserir(Produto t) {		
	}

	@Override
	public void atualizar(Produto t) {		
	}

	@Override
	public void remover(Produto t) {		
	}

	@Override
	public Produto buscar(int codigo) {
		return null;
	}
}
