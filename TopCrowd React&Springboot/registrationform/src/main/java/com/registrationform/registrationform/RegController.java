package com.registrationform.registrationform;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

@RestController

@CrossOrigin(origins = "*")
public class RegController {
 
	@Autowired
	public RegService service;
	
	@PostMapping("/save")
	public String SaveForm(@RequestBody RegEntity entity) {
		
		service.saveAndUpdate(entity);
		return" Successfully added";
	}
}
