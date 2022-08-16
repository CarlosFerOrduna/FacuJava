package my.bank.ejer06.domain;

public class CheckingAccount extends Account {

	private Double overdraftAmount;

	public CheckingAccount(Double initBalance) {
		super(initBalance);
	}

	public CheckingAccount(Double initBalance, Double overdraftAmount) {
		super(initBalance);
		this.overdraftAmount = overdraftAmount;
	}

	@Override
	public boolean withdraw(Double amt) {

		if (super.getBalance() >= amt) {

			super.setBalance(super.getBalance() - amt);

			return true;

		} else if (super.getBalance() < amt && overdraftAmount != null
				&& (super.getBalance() + overdraftAmount >= amt)) {

			Double amtSobrante = amt - super.getBalance();

			overdraftAmount = overdraftAmount - amtSobrante;

			super.setBalance(0.0);

			return true;
		}
		return false;

	}
}
