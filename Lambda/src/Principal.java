import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		List<Persona> personas = new ArrayList<Persona>();

		personas.add(new Persona("Fer", "Orduna", 26));
		personas.add(new Persona("Ana", "Conde", 26));
		personas.add(new Persona("Chacho", "Alvarez", 26));

		personas.sort((p1, p2) -> (p1.getNombre().compareTo(p2.getNombre())));

		for (Persona persona : personas) {

			System.out.printf("Persona : %s %s %s %n", persona.getNombre(), persona.getApellido(), persona.getEdad());
		}
	}
}
