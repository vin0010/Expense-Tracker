package com.codex.et.user;

import java.util.List;

import com.codex.et.accounts.Account;

public interface User {
	public String getUserName();
	public Account getAccountDetails(long accountNumber);
	public List<Account> getAssociatedAccounts();
}
