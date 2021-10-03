package com.juliancalidadsw.proyectocomunidad;



public abstract class Vecino implements Precios{

	protected String nombre, piso, nif;
	protected int nPeticiones;
	protected double impuesto;
	protected peticionMejora peticiones[];

	
	public Vecino(String nombre, String nif, String piso) {

		this.nombre = nombre;
		this.piso = piso;
		this.nif = nif;
		nPeticiones=0;
		this.peticiones= new peticionMejora[10];
	}
	


	public String getNombre() {
		return nombre;
	}

	public String getPiso() {
		return piso;
	}

	public String getNif() {
		return nif;
	}

	public int getNPeticiones() {
		return nPeticiones;
	}

	public double getImpuesto() {
		return impuesto;
	}

	public void setNombre(String nom) {

		nom = nombre;

	}

	public void setPiso(String pis) {

		pis = piso;

	}

	public void setNif(String ni) {

		ni = nif;

	}

	public abstract double calcularImpuesto();

	public void realizarPeticion(String descripcion, int urgencia) {

		

			peticionMejora p = new peticionMejora(descripcion, urgencia);

			peticiones[nPeticiones] = p;

			nPeticiones++;

		
	}

	public String mostrarPeticion() {
		
		String cadena = "";

		for (int i = 0; i < nPeticiones; i++) {
			if (peticiones[i].getUrgencia() == 1) {
				
				cadena = cadena +peticiones[i].toString();

			}
		}
		return cadena;
	}
	
	public boolean comprobarPeticiones() {
		
		return nPeticiones<10;
		
	}
	
	

	public String toString() {

		String cadena = "";

		cadena = cadena + nombre + piso + nif + nPeticiones;

		for (int i = 0; i < nPeticiones; i++) {

			cadena = cadena + " " + " " + (i + 1) + " " + peticiones[i].toString() + " ";

		}

		return cadena;

	}

}
