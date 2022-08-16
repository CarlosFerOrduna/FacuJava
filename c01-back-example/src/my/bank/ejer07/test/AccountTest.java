package my.bank.ejer07.test;

import my.bank.ejer07.domain.Account;

public class AccountTest {

	public static void main(String[] args) {

		Account cuenta = new Account(100.0);
		
		cuenta.deposit(47.0);
		cuenta.whithDraw(120.0);
		
		System.out.println(cuenta.getBalance());
		
		cuenta.showHistory();
		
		
	}

}
