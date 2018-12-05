package com.codex.et.categories;

import java.util.List;

import com.codex.et.util.CategoryType;

public interface Categories {
	public CategoryType getCategoryType();
	public List<Categories> getSubCategories();
}
