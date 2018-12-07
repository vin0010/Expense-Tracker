package com.codex.et.categories;

import com.codex.et.util.CategoryType;

public class Food implements Category {
	private Category subCategory;

	public CategoryType getCategoryType() {
		return this.getCategoryType();
	}
	/*
	 * Does all sub categories require seperate class or just a string is enough? In
	 * that case, how can I get all sub categories of Food or any other category?
	 * 
	 * (non-Javadoc)
	 * 
	 * @see com.codex.et.categories.Categories#getSubCategories()
	 */

	public Category getSubCategory() {
		return subCategory;
	}
}
