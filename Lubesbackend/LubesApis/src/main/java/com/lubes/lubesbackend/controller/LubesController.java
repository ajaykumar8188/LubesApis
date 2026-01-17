package com.lubes.lubesbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lubes.lubesbackend.model.categories;
import com.lubes.lubesbackend.model.roles;
import com.lubes.lubesbackend.service.LubesService;


@RestController 
@CrossOrigin

public class LubesController {
	@Autowired
	private LubesService lubesService;
	
	@GetMapping("/api/admin/getroles")
	public Object GetRoles() {
		return lubesService.GetRoles();
	}
	@GetMapping("/api/admin/getcategories")
	public Object GetCategories() {
		return lubesService.GetCategories();
	}
	@PostMapping("/api/admin/Savecategories")
	public Object Savecategories(@RequestBody categories category) {
		return lubesService.Savecategories(category);
	}
	@PostMapping("/api/admin/Saveroles")
	public Object Saveroles(@RequestBody roles role) {
		return lubesService.Saveroles(role);
	}
}
