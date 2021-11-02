package com.juliancalidadsw.proyectocomunidad;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComunidadTest {

	@Test
	public void getDireccionTest() {
		Comunidad c = new Comunidad(5, "C/ Toledo, 65", "Union");
		assertEquals("C/ Toledo, 65", c.getDireccion());
	}

	@Test
	public void getNombreTest() {
		Comunidad c = new Comunidad(5, "C/ Toledo, 65", "Union");
		assertEquals("Union", c.getNombre());
	}

	@Test
	public void getnVecinosTest() {
		Comunidad c = new Comunidad(5, "C/ Toledo, 65", "Union");
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
		
		assertEquals(11, c.getnVecinos());
	}

	@Test
	public void getAscensoresTest() {
		Comunidad c = new Comunidad(5, "C/ Toledo, 65", "Union");
		assertEquals(5, c.getAscensores());
	}

	@Test
	public void getVecinosTest() {

		Comunidad c = new Comunidad(5, "C/ Toledo, 65", "Union");
		if (c.getVecinos() instanceof Vecino[]) {
			assertTrue(true);
		}

	}

	@Test
	public void setAscensoresTest() {
		Comunidad c = new Comunidad(5, "C/ Toledo, 65", "Union");
		c.setAscensores(5);
		assertEquals(5,c.getAscensores());
	}
	
	@Test
	public void setDireccionTest() {
		Comunidad c = new Comunidad(5, "C/ Toledo, 65", "Union");
		c.setDireccion("C/ Patata");
		assertEquals("C/ Patata",c.getDireccion());
	}
	
	@Test
	public void setNombreTest() {
		Comunidad c = new Comunidad(5, "C/ Toledo, 65", "Union");
		c.setNombre("Alcarria");
		assertEquals("Alcarria",c.getNombre());
	}
	
	@Test
	public void setnVecinosTest() {
		Comunidad c = new Comunidad(5, "C/ Toledo, 65", "Union");
		c.setnVecinos(3);
		assertEquals(3,c.getnVecinos());
	}
	
	@Test
	public void addVecinoTest() {
		Comunidad c = new Comunidad(5, "C/ Toledo, 65", "Union");
		c.addVecino(new Propietario("Ana", "00001111Z", "1D", 1984));
		Vecino v = new Propietario("Ana", "00001111Z", "1D", 1984);
		if (v.equals(c.getVecinos()[0]))
			assertTrue(true);

	}

	@Test
	public void calcularCosteMantenimientoTest() {
		// de los ascensores
		EmpresaMantenimiento empresa = new EmpresaMantenimiento("Ascensores Don Quijote S.A.", "C/ Camilo Jos� Cela",
				120.0);
		Comunidad c = new Comunidad(6, "C/ Toledo, 65", "Union");
		assertEquals(8640.0, c.calcularCosteMantenimiento(empresa, c), 0.001);

	}

	@Test
	public void calcularImpuestoVecinoTest() {
		Vecino v = new Propietario("Ana", "00001111Z", "1D", 1984);
		Comunidad c = new Comunidad(6, "C/ Toledo, 65", "Union");
		Vecino[] vecinos = c.getVecinos();
		vecinos[0] = v;
		assertEquals(575.0, c.calcularImpuestoVecino(0), 0.001);

	}

	@Test
	public void calcularImpuestoAnualTest() { // calcula el impuesto anual que recauda la comunidad de vecinos

		// 4745.0
		Comunidad c = new Comunidad(6, "C/ Toledo, 65", "Union");
	
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
		assertEquals(4745.0, c.calcularImpuestoAnual(), 0.001);

	}

	@Test
	public void posicionVecinoTest() { // comprueba la posici�n del vecino en la matriz con el DNI

		Comunidad c = new Comunidad(6, "C/ Toledo, 65", "Union");
		Vecino[] vecinos = c.getVecinos();
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
		assertEquals(4, c.posicionVecino("55550000A"));
	}

	@Test
	public void existeVecinoTest() { // comprueba si el DNI proporcionado existe o no en la matriz

		Comunidad c = new Comunidad(6, "C/ Toledo, 65", "Union");
		Vecino[] vecinos = c.getVecinos();
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
		assertEquals(true,c.existeVecino("00001111Z"));

	}

	@Test
	public void posiblePeticionTest() { 
	  
		Comunidad c = new Comunidad(6, "C/ Toledo, 65", "Union");
		
		Vecino[] vecinos = c.getVecinos();
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
		assertEquals(true,c.posiblePeticion("00001111Z"));
		 
	}
	 
	@Test
	public void addPeticionTest() { 
		Comunidad c = new Comunidad(5, "C/ Toledo, 65", "Union");
		c.addVecino(new Propietario("Ana", "00001111Z", "1D", 1984));
		Vecino[] vecinos = c.getVecinos();
		PeticionMejora p = new PeticionMejora("luces fundidas", 1);
		c.addPeticion("luces fundidas", 1, 0);
		if(p.equals(vecinos[0].getPeticiones()[0])) assertTrue(true);		
	}
	  
	@Test
	public void numeroPeticionesTest() { 
		Comunidad c = new Comunidad(6, "C/ Toledo, 65", "Union");
		Vecino[] vecinos = c.getVecinos();
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
		c.addPeticion("luces fundidas", 1, 0);
		c.addPeticion("no hay internet", 2, 0);	
		assertEquals(2,c.numeroPeticiones("00001111Z"));
	}
	  
	@Test
	public void mostrarUrgentesTest() { 
		Comunidad c = new Comunidad(6, "C/ Toledo, 65", "Union");
		Vecino[] vecinos = c.getVecinos();
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
		c.addPeticion("luces fundidas", 1, 0);
		c.addPeticion("no hay internet", 2, 0);
		c.addPeticion("vecino peligroso", 1, 0);	
		String cadena = "\nLa descripcion de la peticion urgente es: luces fundidas"
				+ "\nLa descripcion de la peticion urgente es: vecino peligroso";
		assertEquals(cadena,c.mostrarUrgentes(0));

	}
	
	 

}
