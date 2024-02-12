package com.reactfull.fullcriteria.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reactfull.fullcriteria.entity.RSEntity;
import com.reactfull.fullcriteria.repository.RSRepository;

@Service
public class RSService {

	@Autowired
	public RSRepository repo;
	
	public void saveAndupdate(RSEntity entity) {
		
		repo.save(entity);
	}
	public Optional<RSEntity> listByuname(String uname){
		return repo.findByuname(uname);
	}
	public Iterable<RSEntity> listAll(){
		return this.repo.findAll();
	}
	public void saveAndEdit(RSEntity edit) {
		repo.save(edit);
	}

}
