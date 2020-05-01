package com.malapronta.domain.dto;

import com.malapronta.domain.Cidade;

public class CidadeDTO {
	
	private Integer id;
	private String nome;
	private String estado;
	private String pais;
	
	public CidadeDTO(Cidade cidade) {
		super();
		this.id = cidade.getId();
		this.nome = cidade.getNome();
		this.estado = cidade.getEstado();
		this.pais = cidade.getPais();
	}
	
	public CidadeDTO() {
		super();
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
}
