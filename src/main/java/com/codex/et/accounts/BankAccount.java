package com.codex.et.accounts;

import java.util.ArrayList;
import java.util.List;

import com.codex.et.common.AccountActivity;
import com.codex.et.user.User;
import com.codex.et.util.AccountType;
import com.codex.et.util.TimeLine;

public class BankAccount implements Account {
	private AccountType accountType;
	private long balance;
	private long accountNumber;
	private User user;

	public AccountType getAccountType() {
		return accountType;
	}

	public long getAccountBalance() {
		return balance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public User getAssociatedUser() {
		return user;
	}

	public List<AccountActivity> getAccountActivity(Account account, TimeLine timeLine) {
		return new ArrayList<AccountActivity>();
	}

	public List<AccountActivity> getAccountExpenses(Account account, TimeLine timeLine) {
		return new ArrayList<AccountActivity>();
	}

	public List<AccountActivity> getAccountIncomes(Account account, TimeLine timeLine) {
		return new ArrayList<AccountActivity>();
	}

	public Transaction creditAccount(Account account) {
		return new Transaction();
	}

	public Transaction debitAccount(Account account) {
		return new Transaction();
	}

	public List<Transaction> transfer(Account toAccount) {
		return new ArrayList<Transaction>();
	}

}
