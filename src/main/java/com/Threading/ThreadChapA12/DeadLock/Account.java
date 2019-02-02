package com.threading.ThreadChapA12.DeadLock;

public class Account {
	private int balance;

	Account() {
		balance = 10000;
	}

	public static void transfer(Account acc1, Account acc2, int ammount) {
		acc1.withdraw(ammount);
		acc2.deposite(ammount);
	}

	public void withdraw(int ammount) {
		balance += ammount;
	}

	public void deposite(int ammount) {
		balance -= ammount;
	}

	public int getBalance() {
		return balance;
	}
}
