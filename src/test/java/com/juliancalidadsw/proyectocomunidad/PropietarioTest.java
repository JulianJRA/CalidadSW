package com.juliancalidadsw.proyectocomunidad;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;

public class PropietarioTest {
	
	@Test
	public void getAnyoTest() {
		Propietario p = new Propietario("Ana","00001111Z","1D",1984);
		assertEquals(1984,p.getAnyo());
	}

	@Test
	public void calcularImpuestoTest() {
		Propietario p = new Propietario("Ana","00001111Z","1D",1984);
		assertEquals(575.0, p.calcularImpuesto(),0.001);
	}
	
}
