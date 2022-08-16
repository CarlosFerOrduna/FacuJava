package my.bank.ejer06.domain;

public class Bank {

	private Customer[] customers;
	private Integer numberOfCustomer;

	public Bank() {
		this.customers = new Customer[10];
		this.numberOfCustomer = 0;
	}

	public void addCustomer(String f, String l) {

		for (int i = 0; i < customers.length; i++) {

			if (customers[i] == null) {

				customers[i] = new Customer(f, l);

				break;
			}
		}
	}

	public Customer getCustomers(int indexCustomer) {

		return customers[indexCustomer];
	}

	public Integer getNumberOfCustomer() {

		for (int i = 0; i < customers.length; i++) {

			if (customers[i] instanceof Customer) {

				numberOfCustomer++;
			}
		}

		return numberOfCustomer;

	}

}
