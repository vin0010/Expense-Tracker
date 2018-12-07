package com.codex.et.categories;

import com.codex.et.util.CategoryType;

public interface Category {
	public CategoryType getCategoryType();

	// TODO - How to validate/restrict if a sub category belongs to only specific
	// category?
	public Category getSubCategory();
}
