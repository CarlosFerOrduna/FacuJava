package com.holaspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.holaspring")
@EnableAspectJAutoProxy
public class ConfiguradorSpring {

	@Bean
	public Persona getPersona() {
		Persona persona = new Persona();

		persona.setNombre("Ana");

		return persona;
	}
}
