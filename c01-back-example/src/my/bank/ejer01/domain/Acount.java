package my.bank.ejer01.domain;

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
				System.out.println("No tienes dinero suficiente");
			}
		} else {
			System.out.println("No tienes dinero suficiente");
		}
	}

	public static void main(String[] args) {

		Acount cuenta = new Acount(100.0);

		cuenta.deposit(47.0);
		cuenta.whithDraw(150.0);

		System.out.println(cuenta.getBalance());
	}
}
