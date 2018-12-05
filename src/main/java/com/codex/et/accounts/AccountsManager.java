package com.codex.et.accounts;

import java.util.List;

import com.codex.et.user.User;

public class AccountsManager {
	List<Account> accounts;
	List<User> users;

	public AccountsManager(List<Account> accounts, List<User> users) {
		this.users = users;
		this.accounts = accounts;
	}

	public Transaction addExpense(Account account) {

		return null;
	}

	public Transaction addIncome(Account account) {
		return null;
	}

	public void addAccount(Account account) {
		this.accounts.add(account);
	}

	public void addUser(User user) {
		this.users.add(user);
	}

	public Transaction transfer(Account account1, Account account2) {
		return null;
	}

}
