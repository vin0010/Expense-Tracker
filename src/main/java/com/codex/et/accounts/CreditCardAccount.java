package com.codex.et.accounts;

import java.util.List;

import com.codex.et.common.AccountActivity;
import com.codex.et.user.User;
import com.codex.et.util.AccountType;
import com.codex.et.util.TimeLine;

public class CreditCardAccount  implements Account{

	public AccountType getAccountType() {
		// TODO Auto-generated method stub
		return null;
	}

	public long getAccountBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	public long getAccountNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	public User getAssociatedUser() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<AccountActivity> getAccountActivity(Account account, TimeLine timeLine) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<AccountActivity> getAccountExpenses(Account account, TimeLine timeLine) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<AccountActivity> getAccountIncomes(Account account, TimeLine timeLine) {
		// TODO Auto-generated method stub
		return null;
	}

}
