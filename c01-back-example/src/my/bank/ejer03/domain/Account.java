package my.bank.ejer03.domain;

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

	public void deposit(Double amt) {
		balance = balance + amt;
	}

	public void whithdraw(Double amt) {

		if (balance > 0) {
			if (amt <= balance) {
				balance = balance - amt;
			} else {
				System.out.println("No tienes dinero suficiente");
			}
		} else {
			System.out.println("No tienes dinero suficiente");
		}
	}

}
