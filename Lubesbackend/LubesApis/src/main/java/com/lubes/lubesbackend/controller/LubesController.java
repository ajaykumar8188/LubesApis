package com.lubes.lubesbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lubes.lubesbackend.service.LubesService;


@RestController 
@CrossOrigin

public class LubesController {
	@Autowired
	private LubesService lubesService;
	
	@GetMapping("/api/lubes/getroles")
	public Object GetRoles() {
		return lubesService.GetRoles();
	}

}
