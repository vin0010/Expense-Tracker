package com.codex.et.common;

import com.codex.et.accounts.Account;
import com.codex.et.categories.Category;
import com.codex.et.user.User;

public class Expense extends AccountActivity {
	
	
	public Expense(Category category, Account account, User user) {
		super(category, account, user);
	}

	public long getActivityCost() {
		// TODO Auto-generated method stub
		return 0;
	}

}
