package com.registrationform.registrationform;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegService {

	@Autowired
	private RegRepo repo;
	
	public void saveAndUpdate(RegEntity entity) {
	
		repo.save(entity);
	}
}
