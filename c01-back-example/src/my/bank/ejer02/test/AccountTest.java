package my.bank.ejer02.test;

import my.bank.ejer02.domain.Acount;

public class AccountTest {
	public static void main(String[] args) {

		Acount cuenta = new Acount(100.0);

		cuenta.deposit(47.0);
		cuenta.whithDraw(150.0);

		System.out.println(cuenta.getBalance());
	}

}
