package my.bank.ejer06.domain;

public class SavingAccount extends Account {

	private Double interestRate;

	public SavingAccount(Double initBalance, Double interestRate) {
		super(initBalance + (initBalance * interestRate / 100));
		this.interestRate = interestRate;
	}

	@Override
	public boolean deposit(Double amt) {

		if (interestRate != null) {

			super.deposit(amt + (amt * interestRate / 100));
			return true;
		} else {

			if (amt > 0) {

				super.deposit(amt);
				return true;
			}

			return false;
		}
	}
}
