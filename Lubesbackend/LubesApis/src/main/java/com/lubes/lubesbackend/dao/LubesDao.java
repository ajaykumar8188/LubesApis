package com.lubes.lubesbackend.dao;

import com.lubes.lubesbackend.model.categories;
import com.lubes.lubesbackend.model.roles;

public interface LubesDao {

	Object GetRoles();

	Object GetCategories();

	Object Savecategories(categories category);

	Object Saveroles(roles role);

}
