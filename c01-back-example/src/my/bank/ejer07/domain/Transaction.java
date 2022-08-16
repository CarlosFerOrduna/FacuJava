package my.bank.ejer07.domain;

public class Transaction {

	private String operacion;
	private Double monto;

	public Transaction(String operacion, Double monto) {
		this.operacion = operacion;
		this.monto = monto;
	}
	
	public String show() {
		return "Transaction [Operation=" + this.operacion + " monto:" + this.monto + "]";
	}
}
