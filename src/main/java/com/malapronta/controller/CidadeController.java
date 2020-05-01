package com.malapronta.controller;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.malapronta.domain.Cidade;
import com.malapronta.services.CidadeService;

@RestController
@RequestMapping("v1/cidade")
public class CidadeController {

	@Autowired
	private CidadeService service;
	
	private URI getUri(Integer id) {
		return ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(id).toUri();
	}
	@PostMapping()
	public ResponseEntity<Cidade> saveCidade(@RequestBody Cidade cidade){
		try {
		Cidade c = service.insertCidade(cidade);
		URI location = getUri(c.getId());
		return ResponseEntity.created(location).build();
		} catch (Exception e) {
			return ResponseEntity.badRequest().build();
		}
	}
	
	@GetMapping()
	public ResponseEntity<Iterable<Cidade>> getCidades() {
		return ResponseEntity.ok(service.getCidades());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Cidade>> findCidade(@PathVariable Integer id){
		try {
			Optional<Cidade> cidade = service.findCidade(id);
			return ResponseEntity.ok(cidade);
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
	}
	
}
