package com.juliancalidadsw.proyectocomunidad;

import org.junit.Test;

import static org.junit.Assert.*;

public class FileManagerTest {
	
	@Test
	public void leerVecinosTest() {

		Comunidad c1 = new Comunidad(6, "C/ Juan Ram�n Jim�nez", "Torres Blancas");

		FileManager.leerVecinos(
				"Vecinos.txt",
				c1);
		
		Vecino[] vecinos = new Vecino[11];
		vecinos[0] = new Propietario("Ana", "00001111Z", "1D", 1984);
		vecinos[1] = new Inquilino("Juan", "06060606F", "2D", 320.50);
		vecinos[2] = new Propietario("Pedro", "40404040J", "3A", 2010);
		vecinos[3] = new Inquilino("Marco", "60605050N", "1A", 580.00);
		vecinos[4] = new Inquilino("Wirth", "55550000A", "1C", 220.00);
		vecinos[5] = new Inquilino("Dijkstra", "55550001B", "2A", 350.80);
		vecinos[6] = new Propietario("Allen", "55550010C", "3C", 1990);
		vecinos[7] = new Inquilino("Curie", "55550100D", "2A", 392.35);
		vecinos[8] = new Inquilino("Pearl", "55551000E", "3B", 415.00);
		vecinos[9] = new Propietario("Liskov", "55551111K", "2B", 2012);
		vecinos[10] = new Propietario("Codd", "55550101M", "2C", 1998);
		
		Vecino[] vecinos2=c1.getVecinos();
		
		if(vecinos.equals(vecinos2)) {
			assertTrue(true);
		}
	}
	
}
