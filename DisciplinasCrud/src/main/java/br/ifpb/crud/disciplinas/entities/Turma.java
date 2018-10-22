package br.ifpb.crud.disciplinas.entities;

import java.util.Set;

import javax.persistence.Entity;

@Entity
public class Turma implements Identificavel {

	private Long id;
	private String nome;
	
	private Set<Usuario> alunos;
	private Usuario professor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Usuario> getAlunos() {
		return alunos;
	}

	public void setAlunos(Set<Usuario> alunos) {
		this.alunos = alunos;
	}

	public Usuario getProfessor() {
		return professor;
	}

	public void setProfessor(Usuario professor) {
		this.professor = professor;
	}

}
