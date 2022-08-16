
public class Instancia {

	private static Instancia instancia;
	private String value;

	private Instancia() {

	}

	public synchronized static Instancia getInstancia() {
		if (instancia == null) {
			instancia = new Instancia();
		}

		return instancia;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
