package my.bank.ejer05.test;

import my.bank.ejer05.domain.Bank;

public class BankTest {

	public static void main(String[] args) {

		Bank bank = new Bank();

		bank.addCustomer("Simms", "Jane");
		bank.addCustomer("Owen", "Bryant");
		bank.addCustomer("Tim", "Soley");
		bank.addCustomer("Maria", "Soley");

		for (int i = 0; i < bank.getNumberOfCustomer(); i++) {

			bank.getCustomers(i);

			System.out.printf("Customer [%d] is %s, %s %n", i, bank.getCustomers(i).getFirstName(),
					bank.getCustomers(i).getLastName());
		}

	}

}
