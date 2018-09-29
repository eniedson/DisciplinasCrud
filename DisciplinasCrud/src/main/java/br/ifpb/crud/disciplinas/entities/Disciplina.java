package br.ifpb.crud.disciplinas.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Disciplina implements Identificavel {
	
	@Id
	private Long id;
	private String nome;
	private String descricao;
	@ManyToOne
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Usuario getProfessor() {
		return professor;
	}

	public void setProfessor(Usuario professor) {
		this.professor = professor;
	}
	public String toString() {
		return "Disciplina: " + nome + "\n Descrição: " + descricao + "\n Professor: " + professor.getNome();
	}

}
