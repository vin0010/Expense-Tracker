package com.codex.et.categories;

import java.util.List;

import com.codex.et.util.CategoryType;

public interface Category {
	public CategoryType getCategoryType();

	// TODO - How to validate/restrict if a sub category belongs to only specific
	// category?
//	public List<SubCategory> getSubCategories();
}
