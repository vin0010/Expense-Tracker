package com.codex.et.categories;

import java.util.List;

import com.codex.et.util.CategoryType;

public class Medical implements Category {
//	private SubCategory subCategory;
	private Category category;
	public CategoryType getCategoryType() {
		// TODO Auto-generated method stub
		return category.getCategoryType();
	}
//
	public List<SubCategory> getSubCategories() {
		// TODO Auto-generated method stub
		return null;
	}

}
