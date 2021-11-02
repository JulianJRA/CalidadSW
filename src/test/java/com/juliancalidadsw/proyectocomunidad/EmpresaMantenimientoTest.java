package com.juliancalidadsw.proyectocomunidad;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmpresaMantenimientoTest {

	@Test
	public void getNombreTest() {
		EmpresaMantenimiento empresa = new EmpresaMantenimiento("Ascensores S.A.", "C/ Camilo Jose Cela",
				120.0);
		assertEquals("Ascensores S.A.",empresa.getNombre());
	}

	@Test
	public void getDireccionTest() {
		EmpresaMantenimiento empresa = new EmpresaMantenimiento("Ascensores S.A.", "C/ Camilo Jose Cela",
				120.0);
		assertEquals("C/ Camilo Jose Cela",empresa.getDireccion());
	}

	@Test
	public void getCosteAscensorTest() {
		EmpresaMantenimiento empresa = new EmpresaMantenimiento("Ascensores S.A.", "C/ Camilo Jose Cela",
				120.0);
		assertEquals(120.0,empresa.getCosteAscensor(),0.001);
	}
	
	@Test
	public void setNombreTest() {
		EmpresaMantenimiento empresa = new EmpresaMantenimiento("Ascensores S.A.", "C/ Camilo Jose Cela",
				120.0);
		empresa.setNombre("Ascensor");
		assertEquals("Ascensor",empresa.getNombre());
	}
	
	@Test
	public void setDireccionTest() {
		EmpresaMantenimiento empresa = new EmpresaMantenimiento("Ascensores S.A.", "C/ Camilo Jose Cela",
				120.0);
		empresa.setDireccion("C/ Toledo");
		assertEquals("C/ Toledo",empresa.getDireccion());
	}
	
	@Test
	public void setCosteAscensorTest() {
		EmpresaMantenimiento empresa = new EmpresaMantenimiento("Ascensores S.A.", "C/ Camilo Jose Cela",
				120.0);
		empresa.setCosteAscensor(105.0);
		assertEquals(105.0,empresa.getCosteAscensor(),0.001);
	}

}
