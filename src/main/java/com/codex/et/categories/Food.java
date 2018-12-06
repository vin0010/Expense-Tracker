package com.codex.et.categories;

import java.util.List;

import com.codex.et.util.CategoryType;

public class Food implements Category {
//	private SubCategory subCategory;
	private Category category;
	public CategoryType getCategoryType() {
		// TODO Auto-generated method stub
		return category.getCategoryType();
	}
	/*
	 * Does all sub categories require seperate class or just a string is enough?
	 * In that case, how can I get all sub categories of Food or any other category?
	 * 
	 * (non-Javadoc)
	 * @see com.codex.et.categories.Categories#getSubCategories()
	 */
	
	public List<SubCategory> getSubCategories() {
		// TODO Auto-generated method stub
		return null;
	}
}
