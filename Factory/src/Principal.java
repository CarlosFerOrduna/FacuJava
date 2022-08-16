import domain.FactoryFacturas;
import domain.Factura;

public class Principal {

	public static void main(String[] args) {

		Factura factura1 = FactoryFacturas.getInstance(1, "Tablet", 100, "iva");
		Factura factura2 = FactoryFacturas.getInstance(1, "Tablet", 100, "siniva");

		System.out.println(factura1.toString());
		System.out.println(factura2.toString());
	}

}
