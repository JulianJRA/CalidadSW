package com.juliancalidadsw.proyectocomunidad;



public class Inquilino extends Vecino {

	private double alquiler;

	public Inquilino(String nombre, String nif, String piso, double alquiler) {

		super(nombre, nif, piso);
		this.alquiler = alquiler;

	}

	public double getAlquiler() {
		return alquiler;
	}

	public double calcularImpuesto() {

		double recargo;

		double impuesto;

		if (alquiler > PRECIO_ALQUILER) {

			recargo = IMPUESTO_INQUILINO2;

		} else {

			recargo = IMPUESTO_INQUILINO;
		}

		impuesto = PRECIO_BASE_INQUILINO + (recargo * PRECIO_BASE_INQUILINO);

		return impuesto;

	}

	public String toString() {

		String cadena = "";

		cadena = cadena + " "+nombre+" " + piso+" " + nif+" " + nPeticiones+" " + alquiler;

		

		return cadena;

	}

}
