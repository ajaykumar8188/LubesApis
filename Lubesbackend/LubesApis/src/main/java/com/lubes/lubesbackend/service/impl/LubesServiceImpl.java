package com.lubes.lubesbackend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lubes.lubesbackend.dao.LubesDao;
import com.lubes.lubesbackend.model.categories;
import com.lubes.lubesbackend.service.LubesService;


@Service

public class LubesServiceImpl implements LubesService {
	
	@Autowired
	private LubesDao lubesDao;
		
	@Override
	public Object GetRoles() {
		return lubesDao.GetRoles();
	}
	@Override
	public Object GetCategories() {
		return lubesDao.GetCategories();
	}
	@Override
	public Object Savecategories(categories category) {
		return lubesDao.Savecategories(category);
	}

}
