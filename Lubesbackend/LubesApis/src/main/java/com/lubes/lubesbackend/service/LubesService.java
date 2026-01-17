package com.lubes.lubesbackend.service;

import com.lubes.lubesbackend.model.categories;
import com.lubes.lubesbackend.model.roles;

public interface LubesService {

	Object GetRoles();

	Object GetCategories();

	Object Savecategories(categories category);

	Object Saveroles(roles role);

	
}
