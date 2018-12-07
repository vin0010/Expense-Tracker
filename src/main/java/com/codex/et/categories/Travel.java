package com.codex.et.categories;

import com.codex.et.util.CategoryType;

//TODO does it have to be an abstarct class?
public class Travel implements Category {
//	private SubCategory subCategory;
	private Category subCategory;

	public CategoryType getCategoryType() {
		return this.getCategoryType();
	}

//	 TODO does all categories need to have a list of its sub categories?
	public Category getSubCategory() {
		return subCategory;
	}
}
