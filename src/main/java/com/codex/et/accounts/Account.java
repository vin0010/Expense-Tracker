package com.codex.et.accounts;

import com.codex.et.user.User;
import com.codex.et.util.AccountType;

public interface Account {
//	AccountType accountType = null;	is required?

	public AccountType getAccountType();
	
	public User getAssociatedUser();

	public long getAccountBalance();

	public long getAccountNumber();
}
