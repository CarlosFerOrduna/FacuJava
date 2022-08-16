package my.bank.ejer07.domain;

public class AccountHistory {

	private static final int MAXIMMUN = 100;
	private Transaction[] transacciones;
	private Integer contador;

	public AccountHistory() {

		this.transacciones = new Transaction[MAXIMMUN];
		this.contador = 0;
	}

	public void addTransaction(Transaction nuevaTransaction) {

		if (contador < MAXIMMUN) {
			this.transacciones[contador] = nuevaTransaction;
			this.contador++;
		} else {
			System.out.println("Error en la transaccion");
		}

	}

	public void showHistory() {

		for (int i = 0; i < contador; i++) {
			System.out.printf("[" + i + "]" + transacciones[i].show());
		}
	}

}
