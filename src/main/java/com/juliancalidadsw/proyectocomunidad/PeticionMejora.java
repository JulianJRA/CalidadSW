package com.juliancalidadsw.proyectocomunidad;



public class PeticionMejora {

	String descripcion;
	int urgencia;

	public PeticionMejora(String descripcion, int urgencia) {

		this.descripcion = descripcion;
		this.urgencia = urgencia;

	}

	public String getDescripcion() {

		return descripcion;

	}

	public void setDescripcion(String nd) {

		descripcion = nd;

	}

	public int getUrgencia() {

		return urgencia;

	}

	public void setUrgencia(int ur) {

		urgencia = ur;

	}

	public String toString() {

		String cadena = "\nLa descripcion de la peticion urgente es: ";
		cadena = cadena + descripcion;

		return cadena;

	}

}
