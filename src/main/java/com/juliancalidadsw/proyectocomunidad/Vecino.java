package com.juliancalidadsw.proyectocomunidad;



public abstract class Vecino{

	protected String nombre;
	protected String piso;
	protected String nif;
	protected int nPeticiones;
	protected PeticionMejora[] peticiones;

	
	protected Vecino(String nom, String nif, String piso) {

		this.nombre = nom;
		this.piso = piso;
		this.nif = nif;
		nPeticiones=0;
		this.peticiones= new PeticionMejora[10];
	}
	

	public PeticionMejora[] getPeticiones() {
		return peticiones;
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

	public void setNombre(String nom) {

		nombre = nom;

	}

	public void setPiso(String pis) {

		piso = pis;

	}

	public void setNif(String ni) {

		nif = ni;

	}

	public abstract double calcularImpuesto();

	public void realizarPeticion(String descripcion, int urgencia) {

		

			PeticionMejora p = new PeticionMejora(descripcion, urgencia);

			peticiones[nPeticiones] = p;

			nPeticiones++;

		
	}

	public String mostrarPeticion() {
		
		StringBuilder sbu = new StringBuilder();

		for (int i = 0; i < nPeticiones; i++) {
			if (peticiones[i].getUrgencia() == 1) {
				
				sbu.append(peticiones[i].toString());

			}
		}
		return sbu.toString();
	}
	
	public boolean comprobarPeticiones() {
		
		return nPeticiones<10;
		
	}
	
	

	public String toString() {

		String cadena = "";

		cadena = cadena + nombre + piso + nif + nPeticiones;
		
		StringBuilder sbu = new StringBuilder();

		for (int i = 0; i < nPeticiones; i++) {
			
			sbu.append(" " + " " + (i + 1) + " " + peticiones[i].toString() + " ");

		}

		return cadena+sbu.toString();

	}

}
