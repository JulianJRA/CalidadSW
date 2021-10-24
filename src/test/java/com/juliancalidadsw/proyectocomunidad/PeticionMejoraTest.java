package com.juliancalidadsw.proyectocomunidad;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PeticionMejoraTest {
	
	@Test
	public void getDescripcionTest() {
		PeticionMejora p = new PeticionMejora("luces fundidas",1);
		assertEquals("luces fundidas",p.getDescripcion());

	}

	@Test
	public void getUrgencia() {
		PeticionMejora p = new PeticionMejora("luces fundidas",1);
		assertEquals(1,p.getUrgencia());
	}

}
