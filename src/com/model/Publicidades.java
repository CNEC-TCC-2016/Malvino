package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "publicidade")
@SequenceGenerator(name="publicidade_seq", sequenceName="publicidades_id_publicidade_seq", allocationSize = 1)
public class Publicidades {
	
	@Id
	@Column(name = "id_publicidade")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="publicidade_seq")
	int idPublicidade;
	
	@Column(name = "ds_nome")
	String nome;
	
	@Column(name = "ds_descricao")
	String descricao;

	public int getIdPublicidade() {
		return idPublicidade;
	}

	public void setIdPublicidade(int idPublicidade) {
		this.idPublicidade = idPublicidade;
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
	
	
}
