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
	public void getUrgenciaTest() {
		PeticionMejora p = new PeticionMejora("luces fundidas",1);
		assertEquals(1,p.getUrgencia());
	}
	
	@Test
	public void setDescripcionTest() {
		PeticionMejora p = new PeticionMejora("fuga de gas",1);
		p.setDescripcion("luces fundidas");
		assertEquals("luces fundidas",p.getDescripcion());
	}
	
	@Test
	public void setUrgenciaTest() {
		PeticionMejora p = new PeticionMejora("fuga de gas",1);
		p.setUrgencia(2);
		assertEquals(2,p.getUrgencia());
	}

}
