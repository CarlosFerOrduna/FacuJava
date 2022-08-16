package my.bank.ejer03.test;

import my.bank.ejer03.domain.Account;
import my.bank.ejer03.domain.Customer;

public class BankingTest {
	public static void main(String[] args) {

		Customer customer = new Customer("Jane", "Smith");

		customer.setAccount(new Account(500.0));

		customer.getAccount().whithdraw(150.0);
		customer.getAccount().deposit(22.50);
		customer.getAccount().whithdraw(47.62);

		System.out.println(customer.getAccount().getBalance());

		System.out.println(customer.toString());
	}
}
