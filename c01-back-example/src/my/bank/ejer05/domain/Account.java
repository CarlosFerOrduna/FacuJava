package my.bank.ejer05.domain;

public class Account {

	private Double balance;

	public Account(Double initBalance) {
		this.balance = initBalance;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public boolean deposit(Double amt) {

		if (amt > 0) {
			balance = balance + amt;

			return true;
		}

		return false;

	}

	public boolean whithdraw(Double amt) {

		if (balance > 0) {

			if (amt <= balance) {

				balance = balance - amt;

				return true;

			}
		}
		return false;
	}

}
