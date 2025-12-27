package com.lubes.lubesbackend.dao;

import com.lubes.lubesbackend.model.categories;

public interface LubesDao {

	Object GetRoles();

	Object GetCategories();

	Object Savecategories(categories category);

}
