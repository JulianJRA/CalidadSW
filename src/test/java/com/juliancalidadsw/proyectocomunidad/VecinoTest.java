package com.juliancalidadsw.proyectocomunidad;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VecinoTest {
	
	@Test
	public void getPeticionesTest() {
		Vecino v = new Propietario("Ana","00001111Z","1D",1984);
		assertEquals(10, v.getPeticiones().length);
	}
	
	@Test
	public void getNombreTest() {
		Vecino v = new Propietario("Ana","00001111Z","1D",1984);
		assertEquals("Ana",v.getNombre());
	}
	
	@Test
	public void getPisoTest() {
		Vecino v = new Propietario("Ana","00001111Z","1D",1984);
		assertEquals("1D",v.getPiso());
	}

	public void getNifTest() {
		Vecino v = new Propietario("Ana","00001111Z","1D",1984);
		assertEquals("00001111Z",v.getNif());
	}

	@Test
	public void getNPeticionesTest() {
		Vecino v = new Propietario("Ana","00001111Z","1D",1984);
		assertEquals(0,v.getNPeticiones());
		v.realizarPeticion("no hay internet", 1);
		assertEquals(1,v.getNPeticiones());
	}
	
	@Test
	public void setNombreTest() {
		Vecino v = new Propietario("Ana","00001111Z","1D",1984);
		v.setNombre("Pepa");
		assertEquals("Pepa",v.getNombre());
	}
	
	@Test
	public void setPisoTest() {
		Vecino v = new Propietario("Ana","00001111Z","1D",1984);
		v.setPiso("5A");
		assertEquals("5A",v.getPiso());
	}
	
	@Test
	public void setNifTest() {
		Vecino v = new Propietario("Ana","00001111Z","1D",1984);
		v.setNif("12346789W");
		assertEquals("12346789W",v.getNif());
	}

	@Test
	public void realizarPeticionTest() {
		Vecino v = new Propietario("Ana","00001111Z","1D",1984);
		PeticionMejora p = new PeticionMejora("escape de gas", 1);
		v.realizarPeticion("escape de gas", 1);
		if(p.equals(v.getPeticiones()[0])) assertTrue(true);

	}

	@Test
	public void mostrarPeticionTest() {
		Vecino v = new Propietario("Ana","00001111Z","1D",1984);
		v.realizarPeticion("escape de gas", 1);
		assertEquals("\nLa descripcion de la peticion urgente es: escape de gas",v.mostrarPeticion());
	}
	
	@Test
	public void comprobarPeticionesTest() {
		Vecino v = new Propietario("Ana","00001111Z","1D",1984);
		v.realizarPeticion("escape de gas", 1);
		assertEquals(true, v.comprobarPeticiones());
		v.realizarPeticion("escape de gas", 1);
		v.realizarPeticion("escape de gas", 1);
		v.realizarPeticion("escape de gas", 1);
		v.realizarPeticion("escape de gas", 1);
		v.realizarPeticion("escape de gas", 1);
		v.realizarPeticion("escape de gas", 1);
		v.realizarPeticion("escape de gas", 1);
		v.realizarPeticion("escape de gas", 1);
		v.realizarPeticion("escape de gas", 1);
		assertEquals(false,v.comprobarPeticiones());	
	}


}
