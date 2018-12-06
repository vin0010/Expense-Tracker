package com.codex.et.common;

import com.codex.et.accounts.Account;
import com.codex.et.categories.Category;
import com.codex.et.user.User;

public abstract class AccountActivity {
	private Category category;
	private Account account;
	private User user;

	public AccountActivity(Category category, Account account, User user) {
		this.category = category;
		this.account = account;
		this.user = user;
	}

	public abstract long getActivityCost();
}
