package br.ifpb.crud.disciplinas.services;

import java.io.Serializable;
import java.util.List;

import br.ifpb.crud.disciplinas.dao.DisciplinaDAO;
import br.ifpb.crud.disciplinas.entities.Disciplina;
import br.ifpb.crud.disciplinas.util.TransacionalCdi;

public class DisciplinaService implements Serializable ,Service<Disciplina>{

	private static final long serialVersionUID = -7803325791425670859L;
	private DisciplinaDAO disciplinaDAO;
	
	@Override
	@TransacionalCdi
	public void save(Disciplina e) {
		disciplinaDAO.save(e);
	}

	@Override
	@TransacionalCdi
	public void update(Disciplina e) {
		disciplinaDAO.update(e);
		
	}

	@Override
	@TransacionalCdi
	public void remove(Disciplina e) {
		disciplinaDAO.remove(e);
		
	}

	@Override
	public Disciplina getByID(long disciplinaId) {
		return disciplinaDAO.getByID(disciplinaId);
	}

	@Override
	public List<Disciplina> getAll() {
		return disciplinaDAO.getAll();
	}
}