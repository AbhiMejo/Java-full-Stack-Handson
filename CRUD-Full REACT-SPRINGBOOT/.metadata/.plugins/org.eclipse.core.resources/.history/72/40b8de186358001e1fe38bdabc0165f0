package com.reactfull.fullcriteria.controller;

//import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.reactfull.fullcriteria.entity.RSEntity;
import com.reactfull.fullcriteria.service.RSService;

@Controller
public class RSController {
	
	@Autowired
	public RSService service;
	
	
	@GetMapping("/")
	public String save() {
		return"index";
	}
	@GetMapping("/retry")
	public String retry() {
		return"retry";
	}
	//This Endpoint is for Creating a User
	@PostMapping("/save")
	public String saveentity(@ModelAttribute("id")Long id,
			@ModelAttribute("uname")String uname,
			@ModelAttribute("password")String password,
			@ModelAttribute("confpass")String confpass,
			@ModelAttribute("phone")Long phone,
			@ModelAttribute("about")String about) {
		
		Optional<RSEntity> en= service.listByuname(uname);
		
		if(en.isPresent()) {
			return "retry";
		}
		else {
			RSEntity entity=new RSEntity(id,uname,password,confpass,phone,about);
			service.saveAndupdate(entity);
			return "Save";
		}
		
	}
	
	@GetMapping("/list")
	public Iterable<RSEntity> getAll(){
		
		return service.listAll();
	}
	
	
	@PostMapping("checking/edit")
	public String editDetails(@RequestBody RSEntity entity ,@ModelAttribute("id")Long id,
			@ModelAttribute("uname")String uname,
			@ModelAttribute("password")String password,
			@ModelAttribute("confpass")String confpass,
			@ModelAttribute("phone")Long phone,
			@ModelAttribute("about")String about) {
		
			RSEntity edit= new RSEntity(id,uname,password,confpass,phone,about);
			service.saveAndEdit(edit);
			return"Edited";
		
		
		
	}
	
	
}
