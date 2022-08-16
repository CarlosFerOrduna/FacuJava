package my.bank.ejer06.test;

import my.bank.ejer06.domain.Bank;
import my.bank.ejer06.domain.CheckingAccount;
import my.bank.ejer06.domain.SavingAccount;

public class BankingTest {

	public static void main(String[] args) {

		Bank bank = new Bank();

		bank.addCustomer("Jane", "Smith");

		bank.getCustomers(0).setAccount(new SavingAccount(500.0, 3.0));

		bank.addCustomer("Owen", "Bryant");

		bank.getCustomers(1).setAccount(new CheckingAccount(500.0));

		bank.addCustomer("Tim", "Soley");

		bank.getCustomers(2).setAccount(new CheckingAccount(500.0, 500.0));

		bank.addCustomer("Maria", "Soley");

		bank.getCustomers(3).setAccount(bank.getCustomers(2).getAccount());

		System.out.println(bank.getCustomers(0).getAccount().withdraw(150.0));
		System.out.println(bank.getCustomers(0).getAccount().deposit(22.50));
		System.out.println(bank.getCustomers(0).getAccount().withdraw(47.62));
		System.out.println(bank.getCustomers(0).getAccount().withdraw(400.0));
		System.out.println(bank.getCustomers(0).getAccount().getBalance());

		System.out.println(bank.getCustomers(1).getAccount().withdraw(150.0));
		System.out.println(bank.getCustomers(1).getAccount().deposit(22.50));
		System.out.println(bank.getCustomers(1).getAccount().withdraw(47.62));
		System.out.println(bank.getCustomers(1).getAccount().withdraw(400.0));
		System.out.println(bank.getCustomers(1).getAccount().getBalance());

		System.out.println(bank.getCustomers(2).getAccount().withdraw(150.0));
		System.out.println(bank.getCustomers(2).getAccount().deposit(22.50));
		System.out.println(bank.getCustomers(2).getAccount().withdraw(47.62));
		System.out.println(bank.getCustomers(2).getAccount().withdraw(400.0));
		System.out.println(bank.getCustomers(2).getAccount().getBalance());
		
		System.out.println(bank.getCustomers(3).getAccount().deposit(150.0));
		System.out.println(bank.getCustomers(3).getAccount().withdraw(750.0));
		System.out.println(bank.getCustomers(3).getAccount().getBalance());

	}

}
