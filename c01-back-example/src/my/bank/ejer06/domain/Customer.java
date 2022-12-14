package my.bank.ejer06.domain;

public class Customer {

	private String firstName;
	private String lastName;
	private Account account;

	public Customer(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account acct) {
		this.account = acct;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", balance=" + account.getBalance() + "]";
	}

}
