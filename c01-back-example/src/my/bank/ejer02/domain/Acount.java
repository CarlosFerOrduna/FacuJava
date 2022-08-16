package my.bank.ejer02.domain;

public class Acount {

	private Double balance;

	public Acount(Double initBalance) {
		this.balance = initBalance;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public void deposit(Double amt) {
		balance = balance + amt;
	}

	public void whithDraw(Double amt) {

		if (balance != 0) {
			if (amt < balance) {
				balance = balance - amt;
			} else {
			}
		} else {
		}
	}

}
