package com.codex.et.categories;

import java.util.List;

import com.codex.et.util.CategoryType;

//TODO does it have to be an abstarct class?
public class Travel implements Category {
//	private SubCategory subCategory;
	private Category category;

//	public Travel(SubCategory subCategory) {
//		this.subCategory = subCategory;
//	}

	public CategoryType getCategoryType() {
		return category.getCategoryType();
	}

//	 TODO does all categories need to have a list of its sub categories?
	public List<SubCategory> getSubCategories() {
		// TODO Auto-generated method stub
		return null;
	}
}
