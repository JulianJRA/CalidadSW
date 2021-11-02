package com.juliancalidadsw.proyectocomunidad;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrincipalTest {
	
	@Test
	public void mostrarInformacionTest() {
		Comunidad c = new Comunidad(6, "C/ Juan Ram�n Jim�nez", "Torres Blancas");
		c.addVecino(new Propietario("Ana", "00001111Z", "1D", 1984));
		c.addVecino(new Inquilino("Juan", "06060606F", "2D", 320.50));
		c.addVecino(new Propietario("Pedro", "40404040J", "3A", 2010));
		c.addVecino(new Inquilino("Marco", "60605050N", "1A", 580.00));
		c.addVecino(new Inquilino("Wirth", "55550000A", "1C", 220.00));
		c.addVecino(new Inquilino("Dijkstra", "55550001B", "2A", 350.80));
		c.addVecino(new Propietario("Allen", "55550010C", "3C", 1990));
		c.addVecino(new Inquilino("Curie", "55550100D", "2A", 392.35));
		c.addVecino(new Inquilino("Pearl", "55551000E", "3B", 415.00));
		c.addVecino(new Propietario("Liskov", "55551111K", "2B", 2012));
		c.addVecino(new Propietario("Codd", "55550101M", "2C", 1998));
		Principal.mostrarInformacion(c);
		assertTrue(true);
	}
	
}

