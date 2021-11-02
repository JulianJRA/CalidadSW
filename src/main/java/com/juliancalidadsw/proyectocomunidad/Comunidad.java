package com.juliancalidadsw.proyectocomunidad;

import java.util.Scanner;

public class Comunidad { // creamos la clase y definimos todas sus variables

	int ascensores;
	Vecino[] vecinos;
	String direccion;
	String nombre;
	int nVecinos;
	double costeAscensor;
	Scanner teclado = new Scanner(System.in);

	public Comunidad(int ascensores, String direccion, String nombre) { // creamos el constructor

		nVecinos = 0;
		this.ascensores = ascensores;
		this.direccion = direccion;
		this.nombre = nombre;
		this.vecinos = new Vecino[11];

	}

	// creamos todos los getters y los setters necesarios
	public String getDireccion() {
		return direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public int getnVecinos() {

		return nVecinos;

	}

	public int getAscensores() {

		return ascensores;
	}

	public void setAscensores(int ascen) {

		ascensores = ascen;
	}

	public Vecino[] getVecinos() {

		return vecinos;

	}

	public void setDireccion(String d) {
		direccion = d;
	}

	public void setNombre(String n) {
		nombre = n;
	}

	public void setnVecinos(int n) {
		nVecinos = n;
	}

	public void addVecino(Vecino v) { //creamos el metodo anyadir vecino para anyaadir nuevos vecinos a la matriz

		if (nVecinos < vecinos.length) { // comprueba que se pueden a�adir vecinos a la matriz

			vecinos[nVecinos] = v;
			nVecinos++;

		}

	}

	public double calcularCosteMantenimiento(EmpresaMantenimiento empresa, Comunidad c) { // calcula el coste de mantenimiento 
																										  //de los ascensores

		double costePorAscensor = empresa.getCosteAscensor();

		double costeMensual = (costePorAscensor * c.getAscensores());

		return costeMensual * 12; // reune el coste mensual dado de los ascensores y lo multiplica por 12 para el
									// total anual

	}

	public double calcularImpuestoVecino(int posicion) { // comprueba mediante la posici�n del vecino en la matriz el
															// coste de su impuesto

		return vecinos[posicion].calcularImpuesto();
	
	}

	public double calcularImpuestoAnual() { // calcula el impuesto anual que recauda la comunidad de vecinos
		double impuesto = 0;

		for (int i = 0; i < nVecinos; i++) {
			impuesto = impuesto + vecinos[i].calcularImpuesto();
		}
		return impuesto;

	}

	public int posicionVecino(String nif) { // comprueba la posici�n del vecino en la matriz con el DNI

		int x = 0;

		for (int i = 0; i < vecinos.length; i++) {

			if (nif.equals(vecinos[i].getNif())) {
				x = i;

			}
		}

		return x;
	}

	public boolean existeVecino(String nif) { // comprueba si el DNI proporcionado existe o no en la matriz

		boolean existe = false;

		for (int i = 0; i < vecinos.length; i++) {

			if (nif.equalsIgnoreCase(vecinos[i].getNif())) {

				existe = true;

			}
		}
		return existe;

	}

	public boolean posiblePeticion(String nif) { // comprueba si el vecino puede o no realizar m�s peticiones de mejora

		boolean peticionPosible = false;

		for (int i = 0; i < vecinos.length; i++) {

			if (nif.equalsIgnoreCase(vecinos[i].getNif()) && vecinos[i].comprobarPeticiones()) {

					peticionPosible = true;
			
			}
		}
		return peticionPosible;

	}

	public void addPeticion(String descripcion, int urgencia, int posicion) { // a�ade la petici�n de mejora indicando
																				// descripci�n y urgencia

		vecinos[posicion].realizarPeticion(descripcion, urgencia);

	}

	public int numeroPeticiones(String nif) { // devuelve el n�mero de peticiones realizadas por un determinado vecino

		int x = 0;
		for (int i = 0; i < vecinos.length; i++) {

			if (nif.equalsIgnoreCase(vecinos[i].getNif())) {
				x = vecinos[i].getNPeticiones();
			}

		}
		return x;

	}

	public String mostrarUrgentes(int x) { // se utiliza en la clase principal para mostrar las peticiones urgentes de
											// un determinado vecino
		return vecinos[x].mostrarPeticion();
	}

	public String toString() { // para mostrar la informacion completa del objeto, es decir, el valor de sus
								// atributos

		String cadena = "";

		cadena = cadena + "N�mero de ascensores: " + ascensores +  "\n Direcci�n: " + direccion + "\n Nombre de la comunidad: " + nombre + "\n N�mero de vecinos: " + nVecinos;
		
		StringBuilder sbu = new StringBuilder();
		
		for (int i = 0; i < vecinos.length; i++) {
			
			sbu.append("\nInformaci�n vecino: " + " " + (i + 1) + " " + vecinos[i].toString() + " ");

		}

		return cadena+sbu.toString();

	}
}