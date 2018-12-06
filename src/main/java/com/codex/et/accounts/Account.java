package com.codex.et.accounts;

import java.util.List;

import com.codex.et.common.AccountActivity;
import com.codex.et.user.User;
import com.codex.et.util.AccountType;
import com.codex.et.util.TimeLine;

public interface Account {
//	AccountType accountType = null;	is required?

	public AccountType getAccountType();

	public List<AccountActivity> getAccountActivity(Account account, TimeLine timeLine);

	public List<AccountActivity> getAccountExpenses(Account account, TimeLine timeLine);

	public List<AccountActivity> getAccountIncomes(Account account, TimeLine timeLine);

	public User getAssociatedUser();

	public long getAccountBalance();

	public long getAccountNumber();
}
