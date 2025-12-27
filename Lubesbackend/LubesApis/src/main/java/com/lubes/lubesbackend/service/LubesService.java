package com.lubes.lubesbackend.service;

import com.lubes.lubesbackend.model.categories;

public interface LubesService {

	Object GetRoles();

	Object GetCategories();

	Object Savecategories(categories category);

	
}
