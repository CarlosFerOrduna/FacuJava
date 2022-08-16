package ar.edu.davinci.domain;

public class Cliente {

	private String nombre;
	private String apellido;
	private Integer dni;
	private Barco[] barcos;
	private final int CANTIDAD_BARCOS = 0;
	private Integer cantidadBarcos;

	public Cliente(String nombre, String apellido, Integer dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.barcos = new Barco[CANTIDAD_BARCOS];
		this.cantidadBarcos = CANTIDAD_BARCOS;
	}

	public Cliente(String nombre, String apellido, Integer dni, Integer cantidadBarcos, Barco barco) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.barcos = new Barco[cantidadBarcos];
		this.cantidadBarcos = cantidadBarcos;
		agregarBarco(barco);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Integer getCanidadBarcos() {
		return cantidadBarcos;
	}

	public void setCanidadBarcos(Integer canidadBarcos) {
		this.cantidadBarcos = canidadBarcos;
	}

	public void agregarBarco(Barco nuevoBarco) {

		for (int i = 0; i < barcos.length; i++) {

			if (barcos[i] == null) {

				this.barcos[i] = nuevoBarco;

				break;
			}
		}
	}

	public Barco buscarBarcoPorPosicion(int posicion) {
		return barcos[posicion];
	}

	public Barco buscarBarcoPorMatricula(String matricula) {

		for (int i = 0; i < cantidadBarcos; i++) {

			if (barcos[i].getMatricula().equalsIgnoreCase(matricula)) {

				return barcos[i];
			}

		}
		return null;
	}

}
