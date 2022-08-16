package com.holaspring;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectoLog {

	@Before ("execution (* mensaje())")
	public void log() {
		System.out.println("El metodo se invoca");
	}
}
