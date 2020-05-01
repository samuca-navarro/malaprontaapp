package com.malapronta.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.malapronta.domain.Cidade;
import com.malapronta.repositories.CidadeRepository;

@Service
public class CidadeService {
	
	@Autowired
	private CidadeRepository repo;
	
	public Optional<Cidade> findCidade(Integer id) {
		Optional<Cidade> obj = repo.findById(id);
		return obj;
	}
	
	public Iterable<Cidade> getCidades() {
		return repo.findAll();
	}
	
	public Cidade insertCidade(Cidade cidade) {
		Assert.isNull(cidade.getId(), "Não foi possivel inserir o registro");
		return repo.save(cidade);
	}

}
