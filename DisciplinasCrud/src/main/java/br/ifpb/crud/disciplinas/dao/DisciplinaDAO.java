package br.ifpb.crud.disciplinas.dao;

import java.util.List;

import br.ifpb.crud.disciplinas.entities.Disciplina;
import br.ifpb.crud.disciplinas.filtros.DisciplinaFiltro;

public class DisciplinaDAO extends DAO<Disciplina>{

	public DisciplinaDAO() {
		super(Disciplina.class);
	}
	
	public List<Disciplina> findBy(DisciplinaFiltro filtro){
		return null;
	}

}
