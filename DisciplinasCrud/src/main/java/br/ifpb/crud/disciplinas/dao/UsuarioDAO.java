package br.ifpb.crud.disciplinas.dao;

import java.util.List;

import br.ifpb.crud.disciplinas.filtros.UsuarioFiltro;
import br.ifpb.crud.disciplinas.entities.Usuario;

public class UsuarioDAO extends DAO<Usuario> {
	
	public UsuarioDAO() {
		super(Usuario.class);
	}

	public List<Usuario> findBy(UsuarioFiltro filtro) {
		return null;
	}
	
}
