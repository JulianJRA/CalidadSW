package com.juliancalidadsw.proyectocomunidad;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InquilinoTest {
	
	@Test
	public void getAlquilerTest() {
		Inquilino i = new Inquilino("Juan","06060606F","2D",320.50);
		assertEquals(320.50,i.getAlquiler(),0.001);
	}

	@Test 
	public void calcularImpuesto() {

		Inquilino i = new Inquilino("Juan","06060606F","2D",320.50);
		assertEquals(315.0,i.calcularImpuesto(),0.001);
		

	}

}
