package com.holaspring;

public class FactoryPersona {

	public static Persona getInstance(String tipo) {
		return new Persona();
	}

}
