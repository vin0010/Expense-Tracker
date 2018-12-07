package com.codex.et.common;

import com.codex.et.accounts.Account;
import com.codex.et.categories.Category;
import com.codex.et.user.User;

public class Income extends AccountActivity {
	private long cost;

	public Income(Category category, Account account, User user) {
		super(category, account, user);
	}

	public long getActivityCost() {
		return cost;
	}

}
