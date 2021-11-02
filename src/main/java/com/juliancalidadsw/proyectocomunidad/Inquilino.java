package com.juliancalidadsw.proyectocomunidad;



public class Inquilino extends Vecino {
	
	private static final double IMPUESTO_INQUILINO = 0.05;
	private static final double IMPUESTO_INQUILINO2 = 0.1;
	private static final double PRECIO_BASE_INQUILINO = 300;
	private static final int PRECIO_ALQUILER = 400;

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

	@Override
	public String toString() {

		String cadena = "";

		cadena = cadena + " "+nombre+" " + piso+" " + nif+" " + nPeticiones+" " + alquiler;

		return cadena;

	}

}
