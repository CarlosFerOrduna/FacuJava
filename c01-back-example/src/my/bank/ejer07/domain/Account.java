package my.bank.ejer07.domain;

public class Account {

	private Double balance;
	private AccountHistory accountHistory;

	public Account(Double initBalance) {
		this.balance = initBalance;

		accountHistory = new AccountHistory();
		accountHistory.addTransaction(new Transaction("initial", initBalance));
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public void deposit(Double amt) {
		balance = balance + amt;
		accountHistory.addTransaction(new Transaction("deposit", amt));
	}

	public void whithDraw(Double amt) {

		if (balance != 0) {
			if (amt < balance) {
				balance = balance - amt;

				accountHistory.addTransaction(new Transaction("whithdraw", amt));
			} else {
			}
		} else {
		}
	}

	public void showHistory() {
		accountHistory.showHistory();
	}

}
